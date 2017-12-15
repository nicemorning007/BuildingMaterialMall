package bmm.service.impl;

import bmm.dao.BillControlDAO;
import bmm.dao.CheckoutControlDAO;
import bmm.dao.GoodsControlDAO;
import bmm.dao.UserControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.entity.CheckoutEntity;
import bmm.service.CheckoutControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 关于购物车的操作接口的实现
 */
public class CheckoutControlServiceImpl implements CheckoutControlService {
    private CheckoutControlDAO checkoutControlDAO;
    private GoodsControlDAO goodsControlDAO;
    private BillControlDAO billControlDAO;
    private UserControlDAO userControlDAO;

    public void setCheckoutControlDAO(CheckoutControlDAO checkoutControlDAO) {
        this.checkoutControlDAO = checkoutControlDAO;
    }

    public void setGoodsControlDAO(GoodsControlDAO goodsControlDAO) {
        this.goodsControlDAO = goodsControlDAO;
    }

    public void setBillControlDAO(BillControlDAO billControlDAO) {
        this.billControlDAO = billControlDAO;
    }

    public void setUserControlDAO(UserControlDAO userControlDAO) {
        this.userControlDAO = userControlDAO;
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
        return checkoutControlDAO.addTo(goodsId, count, userId);
    }

    /**
     * 用于查询指定用户的购物车总余额
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回购物车总余额；否则返回 <b>0</b>
     */
    @Override
    public double getAllTotal(int id) {
        double total = 0;
        List<CheckoutEntity> list = checkoutControlDAO.showAll(id);
        if (list != null) {
            for (CheckoutEntity checkoutEntity : list) {
                total += (checkoutEntity.getGoodsCount() * goodsControlDAO.getPriceById(checkoutEntity.getGoodsId()));
            }
        }
        return total;
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
        return checkoutControlDAO.removeGoods(goodsId, userId);
    }

    /**
     * 用于给指定用户结算购物车
     *
     * @param id 指定的用户ID
     * @return 如果操作成功则返回该用户订单总额；否则返回 <b>0</b>
     */
    @Override
    public double addToBill(int id) {
        double total = 0;
        List<Integer> tableIdList = checkoutControlDAO.getIdByUserId(id);
        if (tableIdList != null) {
            for (Integer tableId : tableIdList) {
                total += checkoutControlDAO.getGoodsCountById(tableId)
                        * goodsControlDAO.getPriceById(checkoutControlDAO.getGoodsIdById(tableId));
                if (!billControlDAO.addBillById(id, checkoutControlDAO.getGoodsIdById(tableId), checkoutControlDAO.getGoodsCountById(tableId), 0, (checkoutControlDAO.getGoodsCountById(tableId) * (goodsControlDAO.getPriceById(checkoutControlDAO.getGoodsIdById(tableId)))), userControlDAO.getReceiverById(id), userControlDAO.getPhoneById(id), userControlDAO.getAddressById(id))) {
                    total = 0;
                }
            }
        }
        return total;
    }

    /**
     * 根据指定的用户ID清除该用户的购物车
     *
     * @param id 要操作的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean cleanOneById(int id) {
        boolean flag = true;
        List<CheckoutEntity> list = checkoutControlDAO.showAll(id);
        if (list != null) {
            if (list.size() > 0) {
                for (CheckoutEntity checkoutEntity : list) {
                    if (!this.removeGoods(checkoutEntity.getGoodsId(), id)) {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}