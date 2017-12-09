package bmm.dao.impl;

import bmm.dao.BillControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 关于订单的数据库操作接口的实现
 */
public class BillControlDAOImpl implements BillControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 通过用户ID查询与其有关的所有订单ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功返回该用户的所有订单ID数组，否则返回 <b>null</b>
     */
    @Override
    public List<Object> getIdByUserId(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.id from BillbaseEntity be where be.userId=:userId";
        Query query = session.createQuery(hql);
        query.setParameter("userId", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    /**
     * 通过订单ID查询对应的用户ID号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的用户ID号，否则返回 <b>0</b>
     */
    @Override
    public int getUserIdById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.userId from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的商品ID
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的商品ID，否则返回 <b>0</b>
     */
    @Override
    public int getGoodsIdById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.goodsId from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的状态码
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的状态码，否则返回 <b>0</b>
     */
    @Override
    public int getStateById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.state from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的总价
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的总价，否则返回 <b>0</b>
     */
    @Override
    public double getTotalById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.total from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return Double.parseDouble(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的收件人
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的收件人，否则返回 <b>0</b>
     */
    @Override
    public String getReceiverById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.receiver from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的手机号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的手机号，否则返回 <b>0</b>
     */
    @Override
    public String getPhoneById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.phone from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的地址
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的地址，否则返回 <b>0</b>
     */
    @Override
    public String getAddressById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.address from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的下单时间
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的下单时间，否则返回 <b>0</b>
     */
    @Override
    public String getTimeById(int id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select be.time from BillbaseEntity be where be.id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Object> list = query.list();
        transaction.commit();
        session.close();
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 用于查询所有的订单
     *
     * @return 如果查询成功则返回 <b>List&lt;BillbaseEntity&gt;</b> 对象，否则返回 <b>null</b>
     */
    @Override
    public List<BillbaseEntity> showAllBills() {
        List<BillbaseEntity> list = (List<BillbaseEntity>) hibernateTemplate.find("from BillbaseEntity");
        return list;
    }

    /**
     * 更新指定ID的状态值
     *
     * @param id    要更新的ID号
     * @param state 要更新的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateStateById(int id, int state) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BillbaseEntity billbaseEntity = (BillbaseEntity) session.get(BillbaseEntity.class, id);
        billbaseEntity.setState(state);
        try {
            session.update(billbaseEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 更新指定ID的订单总价
     *
     * @param id    要更新的ID号
     * @param total 要更新的总价
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateTotalById(int id, double total) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BillbaseEntity billbaseEntity = (BillbaseEntity) session.get(BillbaseEntity.class, id);
        billbaseEntity.setTotal(total);
        try {
            session.update(billbaseEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 更新指定ID的订单的收件人
     *
     * @param id       要更新的ID号
     * @param receiver 要更新的收件人
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateReceiverById(int id, String receiver) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BillbaseEntity billbaseEntity = (BillbaseEntity) session.get(BillbaseEntity.class, id);
        billbaseEntity.setReceiver(receiver);
        try {
            session.update(billbaseEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 用于获取总订单数
     *
     * @return 如果查询成功则返回总订单数；否则返回 <b>0</b>
     */
    @Override
    public int getBillCount() {
        long count = 0;
        count = (long) HibernateUtil.getSession()
                .createQuery("select count(*) from BillbaseEntity ")
                .uniqueResult();
        return (int) count;
    }

    /**
     * 用于统计总成交额
     *
     * @return 如果查询成功则返回总成交额；否则返回 <b>0</b>
     */
    @Override
    public double getBillTotalCount() {
        String sql = "SELECT sum(billbase.total) FROM billbase WHERE state = 3";
        Session session = HibernateUtil.getSession();
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        List<Object> list = sqlQuery.list();
        for (Object o : list) {
            if (o != null) {
                return Double.parseDouble(o.toString());
            }
        }
        session.close();
        return 0;
    }
}
