package bmm.service;

/**
 * 对用户登陆和注册做查询判断处理的方法均在此类下
 */

public interface UserloginService {
    /**
     * 检查用户名是否存在
     *
     * @param username 用户登陆时输入的用户名
     * @return true当用户名存在；false当用户名不存在
     */
    boolean isHeExist(String username);

    /**
     * 加密密码
     *
     * @param password 用户登录时输入的密码
     * @return 加密后的密码
     */
    String encryptPassword(String password);

    /**
     * 验证用户登陆
     *
     * @param username 用户登录时输入的用户名
     * @param password 用户登录时输入的密码(应传入加密后的文本)
     * @return <b>true</b> 如果用户登陆成功，否则返回<b>false</b>
     */
    boolean loginCheck(String username, String password);

}