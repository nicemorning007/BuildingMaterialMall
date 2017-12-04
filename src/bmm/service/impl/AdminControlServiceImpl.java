package bmm.service.impl;

import bmm.dao.AdminControlDAO;
import bmm.dao.impl.AdminControlDAOImpl;
import bmm.service.AdminControlService;
import bmm.utils.md5_util.Md5Util;

/**
 * 关于管理员账户的操作接口的实现
 */
public class AdminControlServiceImpl implements AdminControlService {
    AdminControlDAO adminControlDAO = new AdminControlDAOImpl();

    /**
     * 用于Spring注入操作
     *
     * @return adminControlDAO 对象
     */
    public AdminControlDAO getAdminControlDAO() {
        return adminControlDAO;
    }

    /**
     * 用于Spring注入操作
     *
     * @param adminControlDAO Spring注入传入的 adminControlDAO 对象
     */
    public void setAdminControlDAO(AdminControlDAO adminControlDAO) {
        this.adminControlDAO = adminControlDAO;
    }

    /**
     * 用于判断用户输入的管理员账户是否存在
     *
     * @param username 用户输入的管理员账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    @Override
    public boolean isExist(String username) {
        return adminControlDAO.isExist(username);
    }

    /**
     * 用于判断用户输入的管理员账户的密码是否正确
     *
     * @param password 加密后的用户输入的管理员账户的密码
     * @return <b>true</b> 如果该账号的密码正确，否则返回 <b>false</b>
     */
    @Override
    public boolean isCorrectPassword(String username, String password) {
        return adminControlDAO.isCorrectPassword(username, password);
    }

    /**
     * 用于处理管理员账户的退出
     *
     * @return <b>true</b>如果该账号退出操作成功，否则返回<b>false</b>
     */
    @Override
    public void exitAdmin() {
        adminControlDAO.clearCache();
    }

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    @Override
    public boolean changePassword(String username, String newPassword){
        return adminControlDAO.changePassword(username, newPassword);
    }
}
