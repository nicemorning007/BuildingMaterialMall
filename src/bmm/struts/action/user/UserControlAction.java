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
    private String id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用于用户登陆的操作方法
     *
     * @return 返回"login"字符串
     */
    public String login() {
        if (!userControlService.login(username, Md5Util.md5Encode(this.password))) {
            info = "用户名或密码错误或已被注销或挂失";
            return "input";
        } else {
            HttpServletResponse response = ServletActionContext.getResponse();
            Cookie cookie = CookieUtil.addCookie("userLogin", username, 60 * 30, "/");
            response.addCookie(cookie);
        }
        return "login";
    }

    /**
     * 用于用户注册的操作方法
     *
     * @return 返回"register"字符串
     */
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

    /**
     * 用于用户注销的方法
     *
     * @return 返回"userForbidden"字符串
     */
    public String userForbidden() {
        if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 0) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 1)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        } else if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 2) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 3)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        }
        return "userForbidden";
    }

    /**
     * 用于用户解除注销的方法
     *
     * @return 返回"unUserForbidden"字符串
     */
    public String unUserForbidden() {
        if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 1) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 0)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        } else if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 3) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 2)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        }
        return "unUserForbidden";
    }

    /**
     * 用于用户挂失操作
     *
     * @return 返回字符串 <b>lossReporting</b>
     */
    public String lossReporting() {
        if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 0) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 2)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        } else if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 1) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 3)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        }
        return "lossReporting";
    }

    /**
     * 用于解除用户挂失操作
     *
     * @return 返回字符串 <b>lossReporting</b>
     */
    public String unLossReporting() {
        if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 2) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 0)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        } else if (userControlService.getUserStateById(Integer.parseInt(this.id)) == 3) {
            if (userControlService.changeUserStateById(Integer.parseInt(this.id), 1)) {
                info = "操作成功";
            } else {
                info = "发生未知错误";
            }
        }
        return "unLossReporting";
    }

    /**
     * 用于重置用户密码操作
     *
     * @return 返回字符串 <b>resetPassword</b>
     */
    public String resetPassword() {
        if (userControlService.resetPasswordById(Integer.parseInt(this.id))) {
            info = "操作成功";
        } else {
            info = "发生未知错误";
        }
        return "resetPassword";
    }

    public String testHiber() {
        info = userControlService.getUsernameById(Integer.parseInt(this.id));
        return "test";
    }
}
