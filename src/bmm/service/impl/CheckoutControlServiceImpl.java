package bmm.service.impl;

import bmm.dao.CheckoutControlDAO;
import bmm.dao.GoodsControlDAO;
import bmm.entity.CheckoutEntity;
import bmm.service.CheckoutControlService;

import java.util.List;

public class CheckoutControlServiceImpl implements CheckoutControlService {
    private CheckoutControlDAO checkoutControlDAO;
    private GoodsControlDAO goodsControlDAO;

    public CheckoutControlDAO getCheckoutControlDAO() {
        return checkoutControlDAO;
    }

    public void setCheckoutControlDAO(CheckoutControlDAO checkoutControlDAO) {
        this.checkoutControlDAO = checkoutControlDAO;
    }

    public GoodsControlDAO getGoodsControlDAO() {
        return goodsControlDAO;
    }

    public void setGoodsControlDAO(GoodsControlDAO goodsControlDAO) {
        this.goodsControlDAO = goodsControlDAO;
    }

    /**
     * 查询指定用户的购物车商品总价
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    @Override
    public double getTotal(int id) {
        double total = 0;
        List<CheckoutEntity> list = checkoutControlDAO.showAll(id);
        if (list != null) {
            for (CheckoutEntity checkoutEntity : list) {
                total += goodsControlDAO.getPriceById(checkoutControlDAO.getGoodsIdById(id));
            }
        } else {
            return 0;
        }
        return total;
    }

    /**
     * 查询指定用户的购物车商品总数
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    @Override
    public int getCount(int id) {
        List<CheckoutEntity> list = checkoutControlDAO.showAll(id);
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
