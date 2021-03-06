package bmm.struts.action.admin;

import bmm.dao.MessageControlDao;
import bmm.service.AdminControlService;
import bmm.service.impl.AdminControlServiceImpl;
import bmm.utils.cookie_util.CookieUtil;
import bmm.utils.md5_util.Md5Util;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 管理层的业务请求
 */
public class AdminControlAction extends ActionSupport {
    private String username;
    private String password;
    private String confirmPassword;
    private String info;
    private String[] dangerSelect;
    private MessageControlDao messageControlDao;
    private AdminControlService adminControlService;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String[] getDangerSelect() {
        return dangerSelect;
    }

    public void setDangerSelect(String dangerSelect[]) {
        this.dangerSelect = dangerSelect;
    }

    public void setAdminControlService(AdminControlService adminControlService) {
        this.adminControlService = adminControlService;
    }

    public void setMessageControlDao(MessageControlDao messageControlDao) {
        this.messageControlDao = messageControlDao;
    }

    /**
     * 仅用于将管理员账户登陆信息存储到浏览器中。cookie存在时间仅为30分钟
     *
     * @param value 需要存储的cookie的value
     */
    private void setIsLoginCookie(String value) {
        //添加cookie到客户端，[name,value]
        Cookie cookie = CookieUtil.addCookie("isLogin", value, 60 * 30, "/");
        HttpServletResponse httpServletResponse = ServletActionContext.getResponse();
        httpServletResponse.addCookie(cookie);
    }

    /**
     * 管理员账户登陆操作方法
     *
     * @return 如果登陆成功返回通知字符串 <b>login</b> ，否则返回 <b>input</b>
     */
    public String login() {
        if (adminControlService.login(username, Md5Util.md5Encode(password))) {
            setIsLoginCookie(username);
            return "login";
        }
        info = "用户名或密码错误";
        return "input";
    }

    /**
     * 管理员账户退出操作方法，将会删除name为<b>isLogin</b>的cookie
     *
     * @return 返回字符串 <b>logout</b>
     */
    public String logout() {
        HttpServletRequest request = ServletActionContext.getRequest();
        Cookie cookie = CookieUtil.delCookie(request, "isLogin");
        HttpServletResponse response = ServletActionContext.getResponse();
        response.addCookie(cookie);
        adminControlService.exitAdmin();
        return "logout";
    }

    /**
     * 用于修改管理员账户密码
     *
     * @return 返回字符串 <b>changePassword</b>
     */
    public String changePassword() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        if (password.trim().equals(confirmPassword.trim())) {
            if (adminControlService.changePassword(username, Md5Util.md5Encode(confirmPassword))) {
                info = "修改成功";
                return "changePassword";
            } else {
                info = "操作失败请重试";
            }
        } else {
            info = "两次密码不匹配";
        }
        return "changePassword";
    }

    /**
     * 用于新增管理员账户
     *
     * @return 返回字符串 <b>addAdmin</b>
     */
    public String addAdmin() {
        if (adminControlService.addAdmin(username, Md5Util.md5Encode(password)) == 1) {
            info = "添加成功";
        } else {
            info = "操作失败请重试";
        }
        return "addAdmin";
    }

    /**
     * 用于全站操作的处理
     *
     * @return 返回字符串 <b>dangerSelect</b>
     */
    public String dangerSelect() {
        if (adminControlService.login("root", Md5Util.md5Encode(this.password))) {
            StringBuffer select = new StringBuffer();
            for (int i = 0; i < dangerSelect.length; i++) {
                select.append(dangerSelect[i]).append(" ");
            }
            String[] action;
            action = select.toString().trim().split(" ");
            for (int i = 0; i < action.length; i++) {
                switch (action[i]) {
                    case "清除所有用户":
                        adminControlService.resetUser();
                        info = "操作成功";
                        break;
                    case "清除所有商品":
                        adminControlService.resetGoods();
                        info = "操作成功";
                        break;
                    case "清除所有数据":
                        adminControlService.resetAll();
                        info = "操作成功";
                        break;
                    default:
                        info = "未选择操作";
                        return "dangerSelect";
                }
            }
        } else {
            info = "密码错误";
        }
        return "dangerSelect";
    }

    /**
     * 用于消息处理
     *
     * @return 返回字符串"message"
     */
    public String message() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String messageId = request.getParameter("messageId");
        if (messageId != null) {
            if (messageControlDao.chageState(Integer.parseInt(messageId))) {
                info = "操作成功";
            } else {
                info = "操作失败";
            }
        } else {
            info = "操作失败";
        }
        return "message";
    }
}
