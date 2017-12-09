package bmm.service.impl;

import bmm.dao.UserControlDAO;
import bmm.service.UserControlService;
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
                return flag;
            }
            flag = 1;
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
}
