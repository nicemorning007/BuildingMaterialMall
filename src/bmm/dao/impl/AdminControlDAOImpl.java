package bmm.dao.impl;

import bmm.dao.AdminControlDAO;
import bmm.entity.AdminbaseEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 关于管理员账户的操作接口的实现
 */
public class AdminControlDAOImpl implements AdminControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

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
        session.close();
        return flag;
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
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 用于修改指定用户的密码
     *
     * @param username    需要修改密码的用户名
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    @Override
    public boolean changePassword(String username, String newPassword){
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update AdminbaseEntity as adminbaseEntity " +
                "set adminbaseEntity.password=:password where adminbaseEntity.username=:username";
        Query query = session.createQuery(hql);
        query.setParameter("password", newPassword);
        query.setParameter("username", username);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 用于新增管理员账户
     * @param username 新的管理员帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    public boolean addAdmin(String username, String password) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        AdminbaseEntity adminbaseEntity = new AdminbaseEntity();
        adminbaseEntity.setUsername(username);
        adminbaseEntity.setPassword(password);
        try {
            session.save(adminbaseEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 用于清除 Hibernate 的缓存
     */
    @Override
    public void clearCache() {
        Session session = HibernateUtil.getSession();
        session.clear();
    }
}
