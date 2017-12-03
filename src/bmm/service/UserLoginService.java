package bmm.service;

import bmm.entity.UserloginEntity;
import bmm.utils.HibernateUtil;
import md5.Md5Util;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * 对用户登陆和注册做查询判断处理的方法均在此类下
 */

public class UserLoginService {


    /**
     * 检查用户名是否存在
     *
     * @param username 用户登陆时输入的用户名
     * @return true当用户名存在；false当用户名不存在
     */
    public boolean isHeExist(String username) {
        boolean flag = false;
        UserloginEntity userlogin = new UserloginEntity();
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("username", username);
        criteria.add(criterion);
        List<UserloginEntity> userloginEntities = criteria.list();
        if (userloginEntities.size() >= 1) {
            for (UserloginEntity userloginEntity : userloginEntities) {
                if (username.equals(userloginEntity.getUsername())) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * 加密密码
     *
     * @param password 用户登录时输入的密码
     * @return 加密后的密码
     */
    public String encryptPassword(String password) {
        String pa = null;
        try {
            pa = Md5Util.md5Encode(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pa;
    }

    /**
     * 验证用户登陆
     *
     * @param username 用户登录时输入的用户名
     * @param password 用户登录时输入的密码(应传入加密后的文本)
     * @return <b>true</b> 如果用户登陆成功，否则返回<b>false</b>
     */
    public boolean loginCheck(String username, String password) {
        boolean flag = false;
        UserloginEntity userlogin = new UserloginEntity();
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.or(Restrictions.eq("username", username),
                Restrictions.eq("password", password));
        criteria.add(criterion);
        List<UserloginEntity> userloginEntities = criteria.list();
        if (userloginEntities.size() >= 1) {
            for (UserloginEntity userloginEntity : userloginEntities) {
                if (username.equals(userloginEntity.getUsername())) {
                    if (password.equals(userloginEntity.getPassword())) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

}
