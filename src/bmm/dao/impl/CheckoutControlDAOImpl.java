package bmm.dao.impl;

import bmm.dao.CheckoutControlDAO;
import bmm.entity.CheckoutEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 关于购物车数据库的操作接口的实现
 */
public class CheckoutControlDAOImpl implements CheckoutControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
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
     * @return 如果查询成功则返回该ID号对应的ID；否则返回 <b>0</b>
     */
    @Override
    public int getIdByUserId(int id) {
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "select ce.id from CheckoutEntity ce where ce.userId=?", id);
        if (list.size() > 0) {
            for (CheckoutEntity checkoutEntity : list) {
                return checkoutEntity.getId();
            }
        }
        return 0;
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
        List<CheckoutEntity> list =
                (List<CheckoutEntity>) hibernateTemplate.find(
                        "select ce.goodsId from CheckoutEntity ce where ce.id=?", id);
        if (list.size() > 0) {
            for (CheckoutEntity checkoutEntity : list) {
                return checkoutEntity.getGoodsId();
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
        if (list.size()>0) {
            return list;
        }
        return null;
    }
}
