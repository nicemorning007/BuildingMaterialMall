package bmm.struts.action.user;

import bmm.service.UserControlService;
import bmm.utils.cookie_util.CookieUtil;
import bmm.utils.md5_util.Md5Util;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class UserControlAction extends ActionSupport {
    private String username;
    private String password;
    private String confirmPassword;
    private String phoneNum;
    private String info;
    private UserControlService userControlService;

    public UserControlService getUserControlService() {
        return userControlService;
    }

    public void setUserControlService(UserControlService userControlService) {
        this.userControlService = userControlService;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 用于用户登陆的操作方法
     *
     * @return 返回"login"字符串
     */
    public String login() {
        if (!userControlService.login(username, Md5Util.md5Encode(this.password))) {
            info = "用户名或密码错误";
            return "input";
        } else {
            HttpServletResponse response = ServletActionContext.getResponse();
            Cookie cookie = CookieUtil.addCookie("userLogin", username, 60 * 30, "/");
            response.addCookie(cookie);
        }
        return "login";
    }

    public String register() {
        int flag = userControlService.register(username, Md5Util.md5Encode(this.password));
        if (flag == 1) {
            info = "注册成功";
        } else if (flag == 0) {
            info = "用户名已存在";
        } else {
            info = "发生未知错误";
        }
        return "register";
    }
}
