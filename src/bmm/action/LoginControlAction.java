package bmm.action;

import bmm.service.UserLoginService;
import com.opensymphony.xwork2.ActionSupport;
import md5.Md5Util;
import org.springframework.stereotype.Controller;

public class LoginControlAction extends ActionSupport {
    private String username;
    private String password;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    //TODO:注册
    public String singup() throws Exception {
        return super.SUCCESS;
    }

    public String login() throws Exception {
        UserLoginService userLoginService = new UserLoginService();
        if (userLoginService.isHeExist(this.username)) {
            if (userLoginService.loginCheck(this.username, Md5Util.md5Encode(this.password))) {
                //TODO:登陆成功
                info = "登陆成功";
            } else {
                info = "密码错误";
            }
        } else {
            info = "用户名不存在";
        }
        return super.SUCCESS;
    }
}
