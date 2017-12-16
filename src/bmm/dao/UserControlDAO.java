package bmm.dao;

import bmm.entity.UserinfoEntity;

import java.util.List;

/**
 * 关于用户账户登陆的数据库操作接口
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
     * 查询所有用户的所有信息
     *
     * @return 所有用户的所有信息的list列表
     */
    List<UserinfoEntity> showAllUserInfo();

    /**
     * 通过用户名查找对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询成功返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    int getIdByName(String username);

    /**
     * 根据ID号查询对应用户的最近登陆时间
     *
     * @param id 要查询的ID号
     * @return 返回最近登陆的时间
     */
    String getLatestLoginTimeById(int id);

    /**
     * 更新指定ID对应的用户的登陆时间
     *
     * @param id   要更新的用户ID
     * @param time 更新的时间
     * @return 如果更新成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean setLatestLoginTimeById(int id, String time);

    /**
     * 用于判断用户输入的用户账户是否存在
     *
     * @param username 用户输入的用户账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    boolean isExist(String username);

    /**
     * 通过ID号获取指定用户的密码
     *
     * @param id 要查询的用户的ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    String getPasswordById(int id);

    /**
     * 用于修改指定用户的密码
     *
     * @param id          需要修改密码的用户的ID号
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    boolean changePasswordById(int id, String newPassword);

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

    /**
     * 用于获取总用户数
     *
     * @return 如果查询成功则返回总用户数；否则返回 <b>0</b>
     */
    int getUserCount();

    /**
     * 根据用户ID获取对应的收件人
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的收件人，否则返回 <b>null</b>
     */
    String getReceiverById(int id);

    /**
     * 根据用户ID查询对应的手机号
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    String getPhoneById(int id);

    /**
     * 根据用户ID查询对应的收件地址
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的收件地址，否则返回 <b>null</b>
     */
    String getAddressById(int id);

    /**
     * 根据用户ID查找对应的昵称
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户的昵称，否则返回 <b>null</b>
     */
    String getNickNameById(int id);

    /**
     * 根据用户ID设置对应的昵称
     *
     * @param id       要操作的用户ID号
     * @param nickName 要设置的昵称
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    boolean setNickNameById(int id, String nickName);

    /**
     * 根据用户ID查找对应的性别
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户的性别，否则返回 <b>null</b>
     */
    String getGenderById(int id);

    /**
     * 根据用户ID设置对应的性别
     *
     * @param id     要操作的用户ID号
     * @param gender 要设置的性别
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    boolean setGenderById(int id, String gender);

    /**
     * 根据指定的用户名查找对应的用户ID号
     *
     * @param username 要查找的用户名
     * @return 如果查询成功则返回该用户名对应的用户ID号，否则返回 <b>0</b>
     */
    int getUserIdByUsername(String username);

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
     * 通过指定的ID号获取对应的用户信息
     *
     * @param id 要查询的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    UserinfoEntity getOneById(int id);
}
