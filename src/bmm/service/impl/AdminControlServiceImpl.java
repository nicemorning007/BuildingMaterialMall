package bmm.service.impl;

import bmm.entity.AdminbaseEntity;
import bmm.service.AdminControlService;
import bmm.utils.hibernate_util.HibernateUtil;
import bmm.utils.md5_util.Md5Util;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * 关于管理员账户的操作接口的实现
 */
public class AdminControlServiceImpl implements AdminControlService {

    /**
     * 用于判断用户输入的管理员账户是否存在
     *
     * @param username 用户输入的管理员账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    @Override
    public boolean isExist(String username) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(AdminbaseEntity.class);
        Criterion criterion = Restrictions.eq("username", username);
        criteria.add(criterion);
        List<AdminbaseEntity> list = criteria.list();
        if (list.size() >= 1) {
            for (AdminbaseEntity adminbaseEntity : list) {
                if (adminbaseEntity.getUsername().equals(username)) {
                    flag = true;
                }
            }
        }
        transaction.commit();
        return flag;
    }

    /**
     * 加密密码
     *
     * @param password 用户登录时输入的密码
     * @return 加密后的密码
     */
    @Override
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
     * 用于判断用户输入的管理员账户的密码是否正确
     *
     * @param password 加密后的用户输入的管理员账户的密码
     * @return <b>true</b> 如果该账号的密码正确，否则返回 <b>false</b>
     */
    @Override
    public boolean isCorrectPassword(String username, String password) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(AdminbaseEntity.class);
        Criterion criterion = Restrictions.and(Restrictions.eq("username", username),
                Restrictions.eq("password", password));
        criteria.add(criterion);
        List<AdminbaseEntity> list = criteria.list();
        if (list.size() >= 1) {
            for (AdminbaseEntity adminbaseEntity : list) {
                if (adminbaseEntity.getPassword().equals(password)) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * 用于处理管理员账户的登陆
     *
     * @param username 用户输入的管理员账号
     * @param password 用户输入的管理员账户的密码
     * @return <b>true</b>如果该账号登陆操作成功，否则返回<b>false</b>
     */
    @Override
    public boolean login(String username, String password) {
        boolean flag = false;

        return flag;
    }

    /**
     * 用于处理管理员账户的退出
     *
     * @return <b>true</b>如果该账号退出操作成功，否则返回<b>false</b>
     */
    @Override
    public boolean exitAdmin() {
        return false;
    }
}
