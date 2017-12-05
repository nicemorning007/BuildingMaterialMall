package bmm.dao.impl;

import bmm.dao.UserControlDAO;
import bmm.entity.UserinfoEntity;
import bmm.entity.UserloginEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.Iterator;
import java.util.List;

public class UserControlDAOImpl implements UserControlDAO {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 查询所有用户的所有信息
     *
     * @return 所有用户的所有信息的list列表
     */
    @Override
    public List<UserinfoEntity> showAllUserInfo() {
        List<UserinfoEntity> list = null;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from UserinfoEntity ";
        Query query = session.createQuery(hql);
        list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    /**
     * 通过ID号获取用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的用户名。否则返回 <b>null</b>
     */
    @Override
    public String getUsernameById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("id", id);
        criteria.add(criterion);
        List<UserloginEntity> list = criteria.list();
        for (UserloginEntity userloginEntity : list) {
            return userloginEntity.getUsername();
        }
        transaction.commit();
        session.close();
        return null;
    }

    /**
     * 通过用户名查找对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询成功返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByName(String username) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("username", username);
        criteria.add(criterion);
        List<UserloginEntity> list = criteria.list();
        for (UserloginEntity userloginEntity : list) {
            return userloginEntity.getId();
        }
        transaction.commit();
        session.close();
        return 0;
    }

    /**
     * 用于判断用户输入的用户账户是否存在
     *
     * @param username 用户输入的用户账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    @Override
    public boolean isExist(String username) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("username", username);
        criteria.add(criterion);
        List<UserloginEntity> list = criteria.list();
        if (list.size() >= 1) {
            for (UserloginEntity userloginEntity : list) {
                if (userloginEntity.getUsername().equals(username)) {
                    flag = true;
                }
            }
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据ID号查询对应用户的最近登陆时间
     *
     * @param id 要查询的ID号
     * @return 返回最近登陆的时间
     */
    @Override
    public String getLatestLoginTimeById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ue.lastLoginTime from UserinfoEntity ue where ue.userId=:userId";
        Query query = session.createQuery(hql);
        query.setParameter("userId", id);
        List<Object> list = query.list();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = (Object) iterator.next();
            return object.toString();
        }
        transaction.commit();
        session.close();
        return null;
    }

    /**
     * 更新指定ID对应的用户的登陆时间
     *
     * @param id   要更新的用户ID
     * @param time 更新的时间
     * @return 如果更新成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean setLatestLoginTimeById(int id, String time) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update UserinfoEntity as ue set ue.lastLoginTime=:time where ue.userId=:userId";
        Query query = session.createQuery(hql);
        query.setParameter("time", time);
        query.setParameter("userId", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 通过ID号获取指定用户的密码
     *
     * @param id 要查询的用户的ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    @Override
    public String getPasswordById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("id", id);
        criteria.add(criterion);
        List<UserloginEntity> list = criteria.list();
        for (UserloginEntity userloginEntity : list) {
            return userloginEntity.getPassword();
        }
        transaction.commit();
        session.close();
        return null;
    }

    /**
     * 用于修改指定用户的密码
     *
     * @param id          需要修改密码的用户的ID号
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    @Override
    public boolean changePasswordById(int id, String newPassword) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update UserloginEntity as userloginEntity " +
                "set userloginEntity.password=:password where userloginEntity.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("password", newPassword);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 用于新增用户账户
     *
     * @param username 新的用户帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    public boolean register(String username, String password) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        UserloginEntity userloginEntity = new UserloginEntity();
        userloginEntity.setUsername(username);
        userloginEntity.setPassword(password);
        try {
            session.save(userloginEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 用于查询该用户是否被注销或挂失
     *
     * @param id 要查询的用户的id
     * @return 如果未查到数据则返回 <b>-1</b>；
     * 如果已被注销则返回 <b>1</b>；
     * 如果已被挂失则返回 <b>2</b>；
     * 否则返回 <b>0</b>
     */
    @Override
    public int getUserState(int id) {
        int flag = -1;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserloginEntity.class);
        Criterion criterion = Restrictions.eq("id", id);
        criteria.add(criterion);
        List<UserloginEntity> list = criteria.list();
        if (list.size() > 0) {
            for (UserloginEntity userloginEntity : list) {
                return userloginEntity.getState();
            }
        }
        transaction.commit();
        return flag;
    }

    /**
     * 用于更改用户登陆状态
     *
     * @param id    要更改的用户id号
     * @param state 要更改的状态编号
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    public boolean chageUserstate(int id, int state) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update UserloginEntity as us set us.state = :state where us.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("state", state);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
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