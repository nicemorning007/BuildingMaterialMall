package bmm.dao;

/**
 * 关于用户账户登陆的操作接口
 */
public interface UserControlDAO {

    /**
     * 通过ID号获取用户名
     *
     * @param id 要查询的ID
     * @return 如果查询成功返回该ID号对应的用户名。否则返回 <b>null</b>
     */
    String getUsernameById(int id);

    /**
     * 通过用户名查找对应的ID号
     * @param username 要查询的用户名
     * @return 如果查询成功返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    int getUserIdByName(String username);

    /**
     * 用于判断用户输入的用户账户是否存在
     *
     * @param username 用户输入的用户账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    boolean isExist(String username);

    /**
     * 通过ID号获取指定用户的密码
     * @param id 要查询的用户的ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    String getPasswordById(int id);

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    boolean changePassword(String username, String newPassword);

    /**
     * 用于新增用户账户
     *
     * @param username 新的用户帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    boolean register(String username, String password);

    /**
     * 用于查询该用户是否被注销或挂失
     *
     * @param id 要查询的用户的id
     * @return 如果未查到数据则返回 <b>-1</b>；
     * 如果已被注销则返回 <b>1</b>；
     * 如果已被挂失则返回 <b>2</b>；
     * 否则返回 <b>0</b>
     */
    int getUserState(int id);

    /**
     * 用于更改用户登陆状态
     *
     * @param id    要更改的用户id号
     * @param state 要更改的状态编号
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    boolean chageUserstate(int id, int state);

    /**
     * 用于清除 Hibernate 的缓存
     */
    void clearCache();
}
