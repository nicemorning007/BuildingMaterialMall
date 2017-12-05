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
     * 根据指定的用户名获取对应的ID号
     * @param username 要查询的用户名
     * @return 如果查询到则返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByUsername(String username) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ae.id from AdminbaseEntity ae where ae.username=:username";
        Query query = session.createQuery(hql);
        query.setParameter("username", username);
        List<AdminbaseEntity> list = query.list();
        if (list.size() > 0) {
            for (AdminbaseEntity adminbaseEntity : list) {
                return adminbaseEntity.getId();
            }
        }
        transaction.commit();
        session.close();
        return 0;
    }

    /**
     * 根据ID号获取对应的用户名
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的用户名，否则返回 <b>null</b>
     */
    @Override
    public String getUsernameById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ae.username from AdminbaseEntity ae where ae.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<AdminbaseEntity> list = query.list();
        if (list.size() > 0) {
            for (AdminbaseEntity adminbaseEntity : list) {
                return adminbaseEntity.getUsername();
            }
        }
        transaction.commit();
        session.close();
        return null;
    }

    /**
     * 根据ID号获取对应的用户的密码
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的密码，否则返回 <b>null</b>
     */
    @Override
    public String getPasswordById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ae.password from AdminbaseEntity ae where ae.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<AdminbaseEntity> list = query.list();
        if (list.size() > 0) {
            for (AdminbaseEntity adminbaseEntity : list) {
                return adminbaseEntity.getPassword();
            }
        }
        transaction.commit();
        session.close();
        return null;
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
