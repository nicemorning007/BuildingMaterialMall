package bmm.service.impl;

import bmm.dao.GoodsControlDAO;
import bmm.service.GoodsControlService;
import bmm.utils.hibernate_util.HibernateUtil;

/**
 * 关于商品管理的接口的实现
 */
public class GoodsControlServiceImpl implements GoodsControlService {
    private GoodsControlDAO goodsControlDAO;

    public GoodsControlDAO getGoodsControlDAO() {
        return goodsControlDAO;
    }

    public void setGoodsControlDAO(GoodsControlDAO goodsControlDAO) {
        this.goodsControlDAO = goodsControlDAO;
    }

    /**
     * 用于新增商品
     *
     * @param name  商品名称
     * @param info  商品属性
     * @param price 单价
     * @param tag   标签（参与的活动）
     * @param manu  产地
     * @param produ 厂商
     * @param norms 规格
     * @param unit  单位
     * @param start 起售数量
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean addGoods(String name, String info, double price, String tag, String manu, String produ, String norms, String unit, int start) {
        return goodsControlDAO.addGoods(name, info, price, tag, manu, produ, norms, unit, start);
    }

    /**
     * 查询商品总数
     *
     * @return 返回商品总数
     */
    @Override
    public int getGoodsCount() {
        return goodsControlDAO.getGoodsCount();
    }
}
