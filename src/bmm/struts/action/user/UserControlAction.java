package bmm.struts.action.user;

import bmm.service.BalanceControlService;
import bmm.service.MessageControlService;
import bmm.service.UserControlService;
import bmm.service.impl.MessageControlServiceImpl;
import bmm.utils.cookie_util.CookieUtil;
import bmm.utils.md5_util.Md5Util;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户管理的业务请求
 */
public class UserControlAction extends ActionSupport {
    private String username;
    private String password;
    private String confirmPassword;
    private String phoneNum;
    private String info;
    private String id;
    private String contact;
    private String name;
    private String message;
    private String address;
    private String receiver;
    private String money;
    private String nickname;
    private UserControlService userControlService;
    private BalanceControlService balanceControlService;
    private MessageControlService messageControlService;

    public void setMessageControlService(MessageControlServiceImpl messageControlService) {
        this.messageControlService = messageControlService;
    }

    public void setUserControlService(UserControlService userControlService) {
        this.userControlService = userControlService;
    }

    public void setBalanceControlService(BalanceControlService balanceControlService) {
        this.balanceControlService = balanceControlService;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
            Cookie cookie = CookieUtil.addCookie("userLogin", username, 60 * 60 * 2, "/");
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
        if (password.equals(confirmPassword)) {
            int flag = userControlService.register(username, Md5Util.md5Encode(this.password));
            if (flag == 1) {
                info = "注册成功";
            } else if (flag == 0) {
                info = "用户名已存在";
            } else {
                info = "发生未知错误";
            }
        } else {
            info = "两次输入的密码不同";
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

    /**
     * 用于用户的退出
     *
     * @return 返回字符串 <b>logout</b>
     */
    public String logout() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.addCookie(CookieUtil.delCookie(request, "userLogin"));
        return "logout";
    }

    /**
     * 用于联系我们功能
     *
     * @return 返回字符串"contact"
     */
    public String contact() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        if (username != null) {
            if (messageControlService.addNewMessage(userControlService.getUserIdByUserName(username), contact, name, message)) {
                this.info = "提交成功";
            } else {
                this.info = "提交失败请重试";
            }
        } else {
            if (messageControlService.addNewMessage(0, contact, name, message)) {
                this.info = "提交成功";
            } else {
                this.info = "提交失败请重试";
            }
        }
        return "contact";
    }

    /**
     * 用于编辑个人信息
     *
     * @return 返回字符串"editInfo"
     */
    public String editInfo() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String userId = request.getParameter("userId");
        this.receiver = request.getParameter("receiver");
        this.address = request.getParameter("address");
        this.phoneNum = request.getParameter("phone");
        if (userControlService.updateUserInfo(Integer.parseInt(userId), this.receiver, this.address, this.phoneNum)) {
            this.message = "操作成功！";
        } else {
            this.message = "操作失败";
        }
        return "editInfo";
    }

    /**
     * 用于更改密码
     *
     * @return 返回字符串"changePassword"
     */
    public String changePassword() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String userId = request.getParameter("userId");
        if (password.equals(confirmPassword)) {
            if (userControlService.updatePasswordByUserId(Integer.parseInt(userId), Md5Util.md5Encode(password))) {
                this.message = "修改成功！";
            } else {
                this.message = "修改失败";
            }
        } else {
            this.message = "两次密码不相同";
        }
        return "changePassword";
    }

    /**
     * 用于账户充值
     *
     * @return 返回字符串"reCharge"
     */
    public String reCharge() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String userId = request.getParameter("userId");
        if (balanceControlService.rechargeById(Integer.parseInt(userId), Double.parseDouble(money))) {
            this.message = "充值成功";
        } else {
            this.message = "充值失败";
        }
        return "reCharge";
    }

    /**
     * 用于修改性别和昵称
     *
     * @return 返回字符串"baseChange"
     */
    public String baseChange() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String userId = request.getParameter("userId");
        String nickname = request.getParameter("nickname");
        if (userControlService.updateBaseInfoByUserId(Integer.parseInt(userId), nickname, this.getCateValue())) {
            this.message = "修改成功";
        } else {
            this.message = "修改失败";
        }
        return "baseChange";
    }

    /**
     * 用于获取select下拉框的值
     *
     * @return 返回对应选项的 <b>value</b>值
     */
    private String getCateValue() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] gender = request.getParameterValues("selectCate");
        return gender[0];
    }

    /**
     * 用于忘记密码功能
     *
     * @return 返回字符串"forgetPassword"
     */
    public String forgetPassword() {
        if (userControlService.forgetPassowrd(username, phoneNum, receiver, nickname)) {
            HttpServletResponse response = ServletActionContext.getResponse();
            try {
                response.sendRedirect("/resetPassword.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.message = "操作失败，请检查";
        }
        return "forgetPassword";
    }

    /**
     * 用于重置密码
     *
     * @return 返回字符串"resetPasswordCon"
     */
    public String resetPasswordCon() {
        if (password.equals(confirmPassword)) {
            if (userControlService.changePassword(this.username, Md5Util.md5Encode(password))) {
                info = "密码重设成功";
            } else {
                info = "发生错误请重试";
            }
        } else {
            info = "两次密码不匹配。";
        }
        return "resetPasswordCon";
    }
}
