package bmm.dao.impl;

import bmm.dao.AdminControlDAO;
import bmm.entity.AdminbaseEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 关于管理员账户的数据库操作接口的实现
 */
public class AdminControlDAOImpl implements AdminControlDAO {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 根据指定的用户名获取对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询到则返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByUsername(String username) {
        String hql = "select ae.id from AdminbaseEntity ae where ae.username=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, username);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据ID号获取对应的用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的用户名，否则返回 <b>null</b>
     */
    @Override
    public String getUsernameById(int id) {
        String hql = "select ae.username from AdminbaseEntity ae where ae.id=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 根据ID号获取对应的用户的密码
     *
     * @param id 要查询的ID号
     * @return 如果查询到则返回该ID号对应的密码，否则返回 <b>null</b>
     */
    @Override
    public String getPasswordById(int id) {
        String hql = "select ae.password from AdminbaseEntity ae where ae.id=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
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
        String hql = "from AdminbaseEntity ae where ae.username=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, username);
        if (list != null) {
            if (list.size() > 0) {
                flag = true;
            }
        }
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
    @Transactional
    public boolean changePassword(String username, String newPassword) {
        boolean flag = false;
        String hql = "from AdminbaseEntity ae where ae.username=?";
        List<AdminbaseEntity> list = (List<AdminbaseEntity>) hibernateTemplate.find(hql, username);
        if (list != null) {
            if (list.size() > 0) {
                for (AdminbaseEntity adminbaseEntity : list) {
                    adminbaseEntity.setPassword(newPassword);
                    try {
                        hibernateTemplate.update(adminbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 用于新增管理员账户
     *
     * @param username 新的管理员帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean addAdmin(String username, String password) {
        boolean flag = false;
        AdminbaseEntity adminbaseEntity = new AdminbaseEntity();
        adminbaseEntity.setUsername(username);
        adminbaseEntity.setPassword(password);
        try {
            hibernateTemplate.save(adminbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    /**
     * 重置用户表
     */
    @Override
    @Transactional
    public void resetUser() {
        String sql1 = "TRUNCATE TABLE userlogin";
        String sql2 = "TRUNCATE TABLE userinfo";
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql1).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql2).executeUpdate();
    }

    /**
     * 重置商品表
     */
    @Override
    @Transactional
    public void resetGoods() {
        String sql1 = "TRUNCATE TABLE goodsbase";
        String sql2 = "TRUNCATE TABLE goodsdesc";
        String sql3 = "TRUNCATE TABLE goodspicarray";
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql1).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql2).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql3).executeUpdate();
    }

    /**
     * 重置全部数据
     */
    @Override
    @Transactional
    public void resetAll() {
        resetUser();
        resetGoods();
        String sql1 = "TRUNCATE TABLE billbase";
        String sql2 = "TRUNCATE TABLE balance";
        String sql3 = "TRUNCATE TABLE categorization";
        String sql4 = "TRUNCATE TABLE checkout";
        String sql5 = "TRUNCATE TABLE logisticbase";
        String sql6 = "TRUNCATE TABLE message";
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql1).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql2).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql3).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql4).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql5).executeUpdate();
        hibernateTemplate.getSessionFactory().openSession().createSQLQuery(sql6).executeUpdate();
    }
}
