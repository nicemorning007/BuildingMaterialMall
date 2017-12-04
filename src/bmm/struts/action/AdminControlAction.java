package bmm.struts.action;

import bmm.service.AdminControlService;
import bmm.service.impl.AdminControlServiceImpl;
import bmm.utils.cookie_util.CookieUtil;
import bmm.utils.md5_util.Md5Util;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminControlAction extends ActionSupport {
    private String username;
    private String password;
    private String confirmPassword;
    private String info;
    private AdminControlService adminControlService;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AdminControlService getAdminControlService() {
        return adminControlService;
    }

    public void setAdminControlService(AdminControlServiceImpl adminControlServiceImpl) {
        this.adminControlService = adminControlServiceImpl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void setIsLoginCookie(String value) {
        //添加cookie到客户端，[name,value]
        Cookie cookie = CookieUtil.addCookie("isLogin", value, "/");
        HttpServletResponse httpServletResponse = ServletActionContext.getResponse();
        httpServletResponse.addCookie(cookie);
    }

    /**
     * 管理员账户登陆操作方法
     *
     * @return 如果登陆成功返回通知字符串 <b>login</b> ，否则返回 <b>input</b>
     */
    public String login(){
        String flag = "input";
        if (adminControlService.isExist(username)) {
            if (adminControlService.isCorrectPassword(username, Md5Util.md5Encode(password))) {
                flag = "login";
                //将用户名存储到cookie中
                setIsLoginCookie(username);
            }
        }
        info = "用户名或密码错误";
        return flag;
    }

    /**
     * 管理员账户退出操作方法，将会删除name为<b>isLogin</b>的cookie
     *
     * @return 返回通知字符串 <b>logout</b>
     */
    public String logout() {
        HttpServletRequest request = ServletActionContext.getRequest();
        Cookie cookie = CookieUtil.delCookie(request, "isLogin");
        HttpServletResponse response = ServletActionContext.getResponse();
        response.addCookie(cookie);
        adminControlService.exitAdmin();
        return "logout";
    }

    public String changePassword() {
        if (password.trim().equals(confirmPassword.trim())) {
            if (adminControlService.changePassword(username, confirmPassword)) {
                info = "修改成功";
                return "changePassword";
            }
        }
        info = "操作失败请重试";
        return "changePassword";
    }
}
