package bmm.service.impl;

import bmm.dao.AdminControlDAO;
import bmm.dao.impl.AdminControlDAOImpl;
import bmm.service.AdminControlService;

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
     * 用于处理管理员登陆请求
     *
     * @param username 用户输入的用户名
     * @param password 加密后的用户输入的密码
     * @return 如果登陆成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean login(String username, String password) {
        boolean flag = false;
        if (adminControlDAO.isExist(username)) {
            if (adminControlDAO.isCorrectPassword(username, password)) {
                flag = true;
            }
        }
        return flag;
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
    public boolean changePassword(String username, String newPassword) {
        return adminControlDAO.changePassword(username, newPassword);
    }

    /**
     * 用于新增管理员账户
     *
     * @param username 新的管理员帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>1</b>；如果用户名已存在则返回 <b>0</b>；如果是未知错误则返回 <b>-1</b>
     */
    @Override
    public int addAdmin(String username, String password) {
        int flag = -1;
        if (!adminControlDAO.isExist(username)) {
            adminControlDAO.addAdmin(username, password);
        } else {
            flag = 0;
        }
        return flag;
    }
}
