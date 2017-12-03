package bmm.dao;

import bmm.entity.UserloginEntity;

/**
 * 关于用户账户登陆的操作接口
 */
public interface UserloginDAO {
    /**
     *  用户登陆的操作方法
     * @param id
     * @return
     */
    UserloginEntity login(int id);
}
