package bmm.dao.impl;

import bmm.dao.CategorizationControlDAO;
import bmm.entity.CategorizationEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 有关分类数据库操作的数据库接口的实现
 */
public class CategorizationControlDAOImpl implements CategorizationControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 通过类别ID号获得对应的名称
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的分类名，如果查询失败则返回 <b>null</b>
     */
    @Override
    public String getCateNameById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ce.name from CategorizationEntity ce where ce.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        for (Object o : list) {
            return o.toString();
        }
        transaction.commit();
        session.close();
        return null;
    }

    /**
     * 通过类别名称获得对应的ID号
     *
     * @param name 要查询的名称
     * @return 如果查询成功返回该名称对应的ID号, 如果查询失败则返回 <b>0</b>
     */
    @Override
    public int GetIdByCateName(String name) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select ce.id from CategorizationEntity ce where ce.name=:name";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        List<Object> list = query.list();
        for (Object o : list) {
            return Integer.parseInt(o.toString());
        }
        transaction.commit();
        session.close();
        return 0;
    }

    /**
     * 新增分类
     *
     * @param name 分类名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean addCategorization(String name) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        CategorizationEntity categorizationEntity = new CategorizationEntity();
        categorizationEntity.setName(name);
        try {
            session.save(categorizationEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据ID号更改对应的类的名称
     *
     * @param id      要查询的ID号
     * @param newName 要修改的名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean setCateNameById(int id, String newName) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update CategorizationEntity ce set ce.name=:newName where ce.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("newName", newName);
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
     * 删除指定ID号对应的分类
     *
     * @param id 要删除的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean deleteCateNameById(int id) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "delete CategorizationEntity ce where ce.id=:id";
        Query query = session.createQuery(hql);
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
     * 查询所有的分类信息
     *
     * @return 如果查询成功则返回一个 <b>list</b>；否则返回 <b>null</b>
     */
    @Override
    public List<CategorizationEntity> showAllCate() {
        List<CategorizationEntity> list = null;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from CategorizationEntity ";
        Query query = session.createQuery(hql);
        list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

}
