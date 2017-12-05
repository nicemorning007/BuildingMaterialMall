package bmm.service;

/**
 * 对用户登陆和注册做查询判断处理的方法均在此类下
 */

public interface UserControlService {
    /**
     * 用于处理用户登陆请求
     *
     * @param username 用户输入的用户名
     * @param password 加密后的用户输入的密码
     * @return 如果登陆成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean login(String username, String password);

    /**
     * 用于处理用户账户的退出
     */
    void exitAdmin();

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return 如果该账号密码修改成功则返回 <b>true</b> ，否则返回<b>false</b>
     */
    boolean changePassword(String username, String newPassword);

    /**
     * 用于新增用户账户
     *
     * @param username 新的用户帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>1</b>；如果用户名已存在则返回 <b>0</b>；
     * 如果是未知因素导致操作失败则返回 <b>-1</b>
     */
    int register(String username, String password);

    /**
     * 用于注销指定id的用户
     *
     * @param id    要注销的用户的id
     * @param state 要修改的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean changeUserStateById(int id, int state);
}