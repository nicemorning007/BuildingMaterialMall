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
     * @param name     商品名称
     * @param info     商品属性
     * @param price    单价
     * @param tag      标签（参与的活动）
     * @param cate     分类
     * @param manu     产地
     * @param produ    厂商
     * @param picArray 图片表ID
     * @param norms    规格
     * @param unit     单位
     * @param start    起售数量
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean addGoods(String name, String info, double price, String tag, int cate, String manu, String produ, int picArray, String norms, String unit, int start) {
        return goodsControlDAO.addGoods(name, info, price, tag, cate, manu, produ, picArray, norms, unit, start);
    }

    /**
     * 预测下一商品的ID号
     *
     * @return 返回下一商品的ID号，如果数据库访问失败将返回 <b>0</b>
     */
    @Override
    public int guessGoodsId() {
        return goodsControlDAO.guessGoodsId();
    }

    ;

    /**
     * 添加商品与分类的关联信息到关联表中
     *
     * @param goodsId 要添加的商品ID
     * @param cate    要添加的分类ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean descIntoGoodsDesc(int goodsId, int cate) {
        return goodsControlDAO.descIntoGoodsDesc(goodsId, cate);
    }

    /**
     * 添加商品图片信息到商品图片表中
     *
     * @param goodsId 对应的商品ID号
     * @param pic1    图片1的地址
     * @param pic2    图片2的地址
     * @param pic3    图片3的地址
     * @param pic4    图片4的地址
     * @param pic5    图片5的地址
     * @param pic6    图片6的地址
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean descIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2, String pic3, String pic4, String pic5, String pic6) {
        return goodsControlDAO.descIntoGoodsPicArrayByGoodsId(goodsId, pic1, pic2, pic3, pic4, pic5, pic6);
    }

    /**
     * 用于推测新商品的图片表ID号
     *
     * @return 返回下一商品的图片表ID号，如果数据库访问失败将返回 <b>0</b>
     */
    @Override
    public int guessPicId() {
        return goodsControlDAO.guessPicId();
    }
}
