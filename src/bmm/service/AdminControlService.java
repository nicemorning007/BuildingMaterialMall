package bmm.service;

/**
 * 关于管理员账户的操作接口
 */
public interface AdminControlService {
    /**
     * 用于判断用户输入的管理员账户是否存在
     *
     * @param username 用户输入的管理员账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    boolean isExist(String username);

    /**
     * 加密密码
     *
     * @param password 用户登录时输入的密码
     * @return 加密后的密码
     */
    String encryptPassword(String password);

    /**
     * 用于判断用户输入的管理员账户的密码是否正确
     *
     * @param password 加密后的用户输入的管理员账户的密码
     * @return <b>true</b> 如果该账号的密码正确，否则返回 <b>false</b>
     */
    boolean isCorrectPassword(String username, String password);

    /**
     * 用于处理管理员账户的登陆
     *
     * @param username 用户输入的管理员账号
     * @param password 用户输入的管理员账户的密码
     * @return <b>true</b>如果该账号登陆操作成功，否则返回<b>false</b>
     */
    boolean login(String username, String password);

    /**
     * 用于处理管理员账户的退出
     *
     * @return <b>true</b>如果该账号退出操作成功，否则返回<b>false</b>
     */
    boolean exitAdmin();
}
