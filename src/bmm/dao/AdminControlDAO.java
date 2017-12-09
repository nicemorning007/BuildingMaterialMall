package bmm.dao;

/**
 * 关于管理员账户数据库的操作接口
 */
public interface AdminControlDAO {
    /**
     * 根据指定的用户名获取对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询到则返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    int getIdByUsername(String username);

    /**
     * 根据ID号获取对应的用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的用户名，否则返回 <b>null</b>
     */
    String getUsernameById(int id);

    /**
     * 根据ID号获取对应的用户的密码
     *
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的密码，否则返回 <b>null</b>
     */
    String getPasswordById(int id);

    /**
     * 用于判断用户输入的管理员账户是否存在
     *
     * @param username 用户输入的管理员账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    boolean isExist(String username);

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    boolean changePassword(String username, String newPassword);

    /**
     * 用于新增管理员账户
     *
     * @param username 新的管理员帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    boolean addAdmin(String username, String password);

    /**
     * 用于清除 Hibernate 的缓存
     */
    void clearCache();

    /**
     * 重置用户表
     */
    void resetUser();

    /**
     * 重置商品表
     */
    void resetGoods();

    /**
     * 重置全部表
     */
    void resetAll();
}
