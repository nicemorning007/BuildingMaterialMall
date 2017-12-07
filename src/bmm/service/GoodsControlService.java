package bmm.service;

/**
 * 关于商品管理的接口
 */
public interface GoodsControlService {
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
    boolean addGoods(String name, String info, double price, String tag, String manu,
                     String produ, String norms, String unit, int start);

    /**
     * 预测下一商品的ID号
     *
     * @return 返回下一商品的ID号，如果数据库访问失败将返回 <b>0</b>
     */
    int guessGoodsId();

    /**
     * 添加商品与分类的关联信息到关联表中
     *
     * @param goodsId 要添加的商品ID
     * @param cate    要添加的分类ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean descIntoGoodsDesc(int goodsId, int cate);

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
    boolean descIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2, String pic3, String pic4, String pic5, String pic6);
}
