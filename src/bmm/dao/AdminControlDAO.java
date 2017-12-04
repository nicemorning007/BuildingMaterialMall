package bmm.dao;

/**
 * 关于管理员账户的操作接口
 */
public interface AdminControlDAO {
    /**
     * 用于判断用户输入的管理员账户是否存在
     *
     * @param username 用户输入的管理员账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    boolean isExist(String username);

    /**
     * 用于判断用户输入的管理员账户的密码是否正确
     *
     * @param password 加密后的用户输入的管理员账户的密码
     * @return <b>true</b> 如果该账号的密码正确，否则返回 <b>false</b>
     */
    boolean isCorrectPassword(String username, String password);

    /**
     * 用于修改指定用户的密码
     *
     * @param username 需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    boolean changePassword(String username, String newPassword);

    /**
     * 用于清除 Hibernate 的缓存
     */
    void clearCache();
}
