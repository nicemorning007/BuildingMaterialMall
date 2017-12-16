package bmm.service.impl;

import bmm.dao.UserControlDAO;
import bmm.entity.UserinfoEntity;
import bmm.service.UserControlService;
import bmm.utils.cookie_util.CookieUtil;
import bmm.utils.md5_util.Md5Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * 关于用户管理的操作接口的实现
 */

public class UserlControlServiceImpl implements UserControlService {
    private UserControlDAO userControlDAO;

    public UserControlDAO getUserControlDAO() {
        return userControlDAO;
    }

    public void setUserControlDAO(UserControlDAO userControlDAO) {
        this.userControlDAO = userControlDAO;
    }

    /**
     * 用于处理用户登陆请求
     *
     * @param username 用户输入的用户名
     * @param password 加密后的用户输入的密码
     * @return 如果登陆成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean login(String username, String password) {
        boolean flag = false;
        if (userControlDAO.isExist(username)) {
            if (userControlDAO.getUserState(userControlDAO.getIdByName(username)) == 0) {
                if (userControlDAO.getPasswordById(userControlDAO.getIdByName(username)).equals(password)) {
                    CookieUtil.addCookie("userLogin", username, 60 * 60);
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                    userControlDAO.setLatestLoginTimeById(userControlDAO.getIdByName(username),
                            format.format(calendar.getTime()));
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * 用于处理用户账户的退出
     */
    @Override
    public void exitAdmin() {
        userControlDAO.clearCache();
    }

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    @Override
    public boolean changePassword(String username, String newPassword) {
        return userControlDAO.changePasswordById(userControlDAO.getIdByName(username), newPassword);
    }

    /**
     * 用于新增用户账户
     *
     * @param username 新的用户帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>1</b>；如果用户名已存在则返回 <b>0</b>；
     * 如果是未知因素导致操作失败则返回 <b>-1</b>
     */
    @Override
    public int register(String username, String password) {
        int flag = -1;
        if (!userControlDAO.isExist(username)) {
            if (userControlDAO.register(username, password)) {
                flag = 1;
                return flag;
            }
        } else {
            flag = 0;
        }
        return flag;
    }

    /**
     * 用于修改指定id的用户的状态值
     *
     * @param id    要注销的用户的id
     * @param state 要修改的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean changeUserStateById(int id, int state) {
        boolean flag = false;
        if (userControlDAO.chageUserstate(id, state)) {
            flag = true;
        }
        return flag;
    }

    /**
     * 用于查询该用户是否被注销或挂失
     *
     * @param id 要查询的用户的id
     * @return 如果未查到数据则返回 <b>-1</b>；
     * 如果已被注销则返回 <b>1</b>；
     * 如果已被挂失则返回 <b>2</b>；
     * 否则返回 <b>0</b>
     */
    @Override
    public int getUserStateById(int id) {
        return userControlDAO.getUserState(id);
    }

    /**
     * 用于重置用户密码
     *
     * @param id 要重置的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean resetPasswordById(int id) {
        return userControlDAO.changePasswordById(id, Md5Util.md5Encode("aaa111"));
    }

    /**
     * 通过ID号获取用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的用户名。否则返回 <b>null</b>
     */
    @Override
    public String getUsernameById(int id) {
        return userControlDAO.getUsernameById(id);
    }

    /**
     * 根据指定的用户ID号更新该用户的信息
     *
     * @param id       要操作的用户ID号
     * @param receiver 要更新的收件人
     * @param adderss  要更新的收件地址
     * @param phone    要更新的联系方式
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateUserInfo(int id, String receiver, String adderss, String phone) {
        return userControlDAO.updateUserInfo(id, receiver, adderss, phone);
    }

    /**
     * 根据指定的用户ID号更改该用户的密码
     *
     * @param id       要操作的用户ID号
     * @param password 要更改的新密码
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updatePasswordByUserId(int id, String password) {
        return userControlDAO.updatePasswordByUserId(id, password);
    }

    /**
     * 根据指定的用户ID号更改该用户的基本信息
     *
     * @param id       要操作的用户ID号
     * @param nickname 要更新的昵称
     * @param gender   要更新的性别
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateBaseInfoByUserId(int id, String nickname, String gender) {
        return userControlDAO.updateBaseInfoByUserId(id, nickname, gender);
    }

    /**
     * 通过指定的用户名获取对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询成功则返回该用户对应的ID号；否则返回 <b>0</b>
     */
    @Override
    public int getUserIdByUserName(String username) {
        return userControlDAO.getIdByName(username);
    }

    /**
     * 用于找回密码的功能。通过用户名查找到对应的userinfo对象，并检查
     * 手机号；收件人；昵称是否匹配以确认身份
     *
     * @param username 要操作的用户名
     * @param phoneNum 手机号
     * @param receiver 收件人
     * @param nickname 昵称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean forgetPassowrd(String username, String phoneNum, String receiver, String nickname) {
        boolean flag = false;
        UserinfoEntity userinfoEntity = userControlDAO.getOneById(userControlDAO.getUserIdByUsername(username));
        if (userinfoEntity != null) {
            if (userControlDAO.getPhoneById(userinfoEntity.getUserId()).equals(phoneNum)) {
                if (userControlDAO.getReceiverById(userinfoEntity.getUserId()).equals(receiver)) {
                    if (userControlDAO.getNickNameById(userinfoEntity.getUserId()).equals(nickname)) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
