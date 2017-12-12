package bmm.dao.impl;

import bmm.dao.CheckoutControlDAO;
import bmm.dao.GoodsControlDAO;
import bmm.entity.CheckoutEntity;
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
 * 关于购物车数据库的操作接口的实现
 */
public class CheckoutControlDAOImpl implements CheckoutControlDAO {
    private HibernateTemplate hibernateTemplate;
    private GoodsControlDAO goodsControlDAO;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public GoodsControlDAO getGoodsControlDAO() {
        return goodsControlDAO;
    }

    public void setGoodsControlDAO(GoodsControlDAO goodsControlDAO) {
        this.goodsControlDAO = goodsControlDAO;
    }

    /**
     * 通过指定的ID获得对应的用户ID号
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的用户ID；否则返回 <b>0</b>
     */
    @Override
    public int getUserIdById(int id) {
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "select ce.userId from CheckoutEntity ce where ce.id=?", id);
        if (list.size() > 0) {
            for (CheckoutEntity checkoutEntity : list) {
                return checkoutEntity.getUserId();
            }
        }
        return 0;
    }

    /**
     * 通过指定的用户ID号获得对应的ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的ID <b>List&lt;Integer&gt;</b>对象；否则返回 <b>null</b>
     */
    @Override
    public List<Integer> getIdByUserId(int id) {
        List<Integer> list =
                (List<Integer>) hibernateTemplate.find(
                        "select ce.id from CheckoutEntity ce where ce.userId=?", id);
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 通过指定的ID号获得对应的商品名称
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号商品名称；否则返回 <b>null</b>
     */
    @Override
    public String getGoodsNameById(int id) {
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "select ce.goodsName from CheckoutEntity ce where ce.id=?", id);
        if (list.size() > 0) {
            for (CheckoutEntity checkoutEntity : list) {
                return checkoutEntity.getGoodsName();
            }
        }
        return null;
    }

    /**
     * 通过指定的ID号获得对应的商品ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的商品ID；否则返回 <b>0</b>
     */
    @Override
    public int getGoodsIdById(int id) {
        List<Integer> list =
                (List<Integer>) hibernateTemplate.find(
                        "select ce.goodsId from CheckoutEntity ce where ce.id=?", id);
        if (list.size() > 0) {
            for (Integer integer : list) {
                return integer;
            }
        }
        return 0;
    }

    /**
     * 通过指定的ID号获得对应的商品数量
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的商品数量；否则返回 <b>0</b>
     */
    @Override
    public int getGoodsCountById(int id) {
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "select ce.goodsCount from CheckoutEntity ce where ce.id=?", id);
        if (list.size() > 0) {
            for (CheckoutEntity checkoutEntity : list) {
                return checkoutEntity.getGoodsCount();
            }
        }
        return 0;
    }

    /**
     * 查询指定用户的购物车的所有信息
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该ID号对应的 <b>List&lt;CheckoutEntity&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    public List<CheckoutEntity> showAll(int id) {
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "from CheckoutEntity ce where ce.userId=?", id);
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 用于将商品添加到购物车中
     *
     * @param goodsId 要添加的商品ID
     * @param count   要添加的商品数量
     * @param userId  对应的操作用户
     * @return 如果操作成功则返回 <b>true</b>；否则返回返回 <b>false</b>
     */
    @Override
    public boolean addTo(int goodsId, int count, int userId) {
        boolean flag = false;
        CheckoutEntity checkoutEntity;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from CheckoutEntity ce where ce.goodsId=:goodsId and ce.userId=:userId";
        Query query = session.createQuery(hql);
        query.setParameter("goodsId", goodsId);
        query.setParameter("userId", userId);
        List<CheckoutEntity> list = (List<CheckoutEntity>) query.list();
        if (list.size() > 0) {
            checkoutEntity = list.get(0);
            checkoutEntity.setGoodsCount(checkoutEntity.getGoodsCount() + count);
        } else {
            checkoutEntity = new CheckoutEntity();
            checkoutEntity.setGoodsId(goodsId);
            checkoutEntity.setGoodsName(goodsControlDAO.getNameById(goodsId));
            checkoutEntity.setGoodsCount(count);
            checkoutEntity.setUserId(userId);
        }
        try {
            session.save(checkoutEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        session.close();
        return flag;
    }

    /**
     * 用于移除指定用户的购物车中的指定商品
     *
     * @param goodsId 指定的商品的ID
     * @param userId  指定的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean removeGoods(int goodsId, int userId) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(CheckoutEntity.class);
        Criterion criterion = Restrictions.and(Restrictions.eq("goodsId", goodsId),
                Restrictions.eq("userId", userId));
        List<CheckoutEntity> list = criteria.list();
        if (list != null) {
            CheckoutEntity checkoutEntity = list.get(0);
            try {
                session.delete(checkoutEntity);
                transaction.commit();
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
            }
        }
        return flag;
    }
}
