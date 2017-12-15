package bmm.service;

/**
 * 关于用户管理的操作接口
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

    /**
     * 用于查询该用户是否被注销或挂失
     *
     * @param id 要查询的用户的id
     * @return 如果未查到数据则返回 <b>-1</b>；
     * 如果已被注销则返回 <b>1</b>；
     * 如果已被挂失则返回 <b>2</b>；
     * 否则返回 <b>0</b>
     */
    int getUserStateById(int id);

    /**
     * 用于重置用户密码
     *
     * @param id 要重置的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean resetPasswordById(int id);

    /**
     * 通过ID号获取用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的用户名。否则返回 <b>null</b>
     */
    String getUsernameById(int id);

    /**
     * 根据指定的用户ID号更新该用户的信息
     *
     * @param id       要操作的用户ID号
     * @param receiver 要更新的收件人
     * @param adderss  要更新的收件地址
     * @param phone    要更新的联系方式
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updateUserInfo(int id, String receiver, String adderss, String phone);

    /**
     * 根据指定的用户ID号更改该用户的密码
     *
     * @param id       要操作的用户ID号
     * @param password 要更改的新密码
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updatePasswordByUserId(int id, String password);

    /**
     * 根据指定的用户ID号更改该用户的基本信息
     *
     * @param id       要操作的用户ID号
     * @param nickname 要更新的昵称
     * @param gender   要更新的性别
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updateBaseInfoByUserId(int id, String nickname, String gender);

    /**
     * 通过指定的用户名获取对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询成功则返回该用户对应的ID号；否则返回 <b>0</b>
     */
    int getUserIdByUserName(String username);

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
    boolean forgetPassowrd(String username, String phoneNum, String receiver, String nickname);
}