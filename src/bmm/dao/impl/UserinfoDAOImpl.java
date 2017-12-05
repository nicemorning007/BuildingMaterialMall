package bmm.dao.impl;

import bmm.dao.UserinfoDAO;
import bmm.entity.UserinfoEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class UserinfoDAOImpl implements UserinfoDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 查询所有用户的所有信息
     * @return 所有用户的所有信息的list列表
     */
    @Override
    public List<UserinfoEntity> showAllInfo() {
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

}
