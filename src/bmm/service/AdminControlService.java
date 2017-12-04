package bmm.service;

/**
 * 关于管理员账户的操作接口
 */
public interface AdminControlService {
    /**
     * 用于处理管理员登陆请求
     *
     * @param username 用户输入的用户名
     * @param password 加密后的用户输入的密码
     * @return 如果登陆成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean login(String username, String password);

    /**
     * 用于处理管理员账户的退出
     */
    void exitAdmin();

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
     * @return 如果添加成功返回 <b>1</b>；如果用户名已存在则返回 <b>0</b>；如果是未知错误则返回 <b>-1</b>
     */
    int addAdmin(String username, String password);
}
