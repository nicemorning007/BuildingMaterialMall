package bmm.dao;

import bmm.entity.GoodsbaseEntity;
import bmm.entity.GoodspicarrayEntity;

import java.util.List;

/**
 * 关于商品属性的数据库操作接口
 */
public interface GoodsControlDAO {
    /**
     * 根据商品名称获取对应的ID号
     *
     * @param name 要查询的商品名称
     * @return 如果查询到商品则返回该商品的ID号，否则返回 <b>0</b>
     */
    int getIdByName(String name);

    /**
     * 根据商品ID号获取对应的商品的名称
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品名称，否则返回 <b>null</b>
     */
    String getNameById(int id);

    /**
     * 根据商品ID号设置相应商品的名称
     *
     * @param id   要设置的ID号
     * @param name 要设置的名称
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setNameById(int id, String name);

    /**
     * 根据商品ID号获取对应的商品的价格
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品价格，否则返回 <b>0</b>
     */
    double getPriceById(int id);

    /**
     * 根据商品ID号设置相应的价格
     *
     * @param id    要设置的ID号
     * @param price 要设置的价格
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setPriceById(int id, double price);

    /**
     * 根据商品ID号获取对应的商品的产地
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品产地，否则返回 <b>null</b>
     */
    String getManuById(int id);

    /**
     * 根据商品ID号设置相应的产地
     *
     * @param id   要设置的ID号
     * @param manu 要设置的产地
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setManuById(int id, String manu);

    /**
     * 根据商品ID号获取对应的商品的图片数组表对应的ID
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的图片数组表对应的ID，否则返回 <b>0</b>
     */
    int getPicArrById(int id);

    /**
     * 根据商品ID号设置相应的图片数组表ID
     *
     * @param id     要设置的ID号
     * @param picArr 要设置的图片数组表ID
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setPicArrById(int id, int picArr);

    /**
     * 根据商品ID号获取对应的商品的销量
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销量，否则返回 <b>0</b>
     */
    int getSaleById(int id);

    /**
     * 根据商品ID号设置相应的销量
     *
     * @param id   要设置的ID号
     * @param sale 要设置的销量
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setSaleById(int id, int sale);

    /**
     * 根据商品ID号获取对应的商品的信息
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品信息，否则返回 <b>null</b>
     */
    String getInfoById(int id);

    /**
     * 根据商品ID号设置相应的信息
     *
     * @param id   要设置的ID号
     * @param info 要设置的信息
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setInfoById(int id, String info);

    /**
     * 根据商品ID号获取对应的商品的标签
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品标签，否则返回 <b>null</b>
     */
    String getTagById(int id);

    /**
     * 根据商品ID号设置相应的标签
     *
     * @param id  要设置的ID号
     * @param tag 要设置的标签
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setTagById(int id, String tag);

    /**
     * 根据商品ID号获取对应的商品的分类表ID号
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的分类表ID号，否则返回 <b>0</b>
     */
    int getCateById(int id);

    /**
     * 根据商品ID号设置相应的分类表ID号
     *
     * @param id   要设置的ID号
     * @param cate 要设置的分类表ID号
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setCateById(int id, int cate);

    /**
     * 根据商品ID号获取对应的商品的销售单位
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销售单位，否则返回 <b>null</b>
     */
    String getUnitById(int id);

    /**
     * 根据商品ID号设置相应的销售单位
     *
     * @param id   要设置的ID号
     * @param unit 要设置的销售单位
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setUnitById(int id, String unit);

    /**
     * 查询所有的商品的全部信息
     *
     * @return 如果查询成功返回所有商品的全部信息；否则返回 <b>null</b>
     */
    List<GoodsbaseEntity> showAllGoods();

    /**
     * 查询指定ID的商品的所有信息
     *
     * @param id 要查询的商品ID号
     * @return 如果查询成功返回该ID号对应的商品的所有信息，否则返回 <b>null</b>
     */
    GoodsbaseEntity getOneAllInfo(int id);

    /**
     * 根据商品ID号获取对应的商品的规格
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品规格，否则返回 <b>null</b>
     */
    String getNormsById(int id);

    /**
     * 根据商品ID号设置相应的销售规格
     *
     * @param id    要设置的ID号
     * @param norms 要设置的销售规格
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setNormsById(int id, String norms);

    /**
     * 根据商品ID号获取对应的商品的起售数量
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品起售数量，否则返回 <b>0</b>
     */
    int getStartById(int id);

    /**
     * 根据商品ID号设置相应的销售起售数量
     *
     * @param id    要设置的ID号
     * @param start 要设置的销售起售数量
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    boolean setStartById(int id, int start);

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
    boolean addGoods(String name, String info, double price, String tag, int cate, String manu,
                     String produ, int picArray, String norms, String unit, int start);

    /**
     * 修改商品图片信息
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
    boolean editIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2,
                                           String pic3, String pic4, String pic5, String pic6);

    /**
     * 用于修改商品
     *
     * @param id       商品ID号
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
    boolean editGoods(int id, String name, String info, double price, String tag, int cate, String manu,
                      String produ, int picArray, String norms, String unit, int start);

    /**
     * 查询商品总数
     *
     * @return 返回商品总数
     */
    int getGoodsCount();

    /**
     * 添加商品与分类的关联信息到关联表中
     *
     * @param goodsId 要添加的商品ID
     * @param cate    要添加的分类ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean descIntoGoodsDesc(int goodsId, int cate);

    /**
     * 根据关联表ID号从商品与分类关联表中获取到商品ID
     *
     * @param id 要查询的关联表ID号
     * @return 如果操作成功则返回该商品的 <b>ID</b>；否则返回 <b>0</b>
     */
    int getGoodsIdFromGoodsDescByCateId(int id);

    /**
     * 根据商品ID号从商品与分类关联表中获取到分类ID
     *
     * @param id 要查询的商品ID号
     * @return 如果操作成功则返回该商品的分类 <b>ID</b>；否则返回 <b>0</b>
     */
    int getCateIdFromGoodsDescByGoodsId(int id);

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
    boolean descIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2, String pic3,
                                           String pic4, String pic5, String pic6);

    /**
     * 根据商品ID号从商品图片信息表中获取指定商品的全部图片信息
     *
     * @param goodsId 要查询的商品ID号
     * @return 如果操作成功则返回该商品的 <b>GoodspicarrayEntity</b>对象；否则返回 <b>null</b>
     */
    GoodspicarrayEntity getOneAllInfoPicByGoodsId(int goodsId);

    /**
     * 根据ID号从商品图片信息表中获取指定行的全部图片信息
     *
     * @param id 要查询的图片表ID
     * @return 如果操作成功则返回该ID对应的商品的 <b>GoodspicarrayEntity</b>对象；否则返回 <b>null</b>
     */
    GoodspicarrayEntity getOneAllInfoPicById(int id);

    /**
     * 获取商品图片表的全部信息
     *
     * @return 如果操作成功则返回 <b>List&lt;GoodspicarrayEntity&gt;</b>对象；否则返回 <b>null</b>
     */
    List<GoodspicarrayEntity> getAllInfoFromGoodsPicArray();

    /**
     * 用于推测新商品的ID号
     *
     * @return 返回下一商品的ID号，如果数据库访问失败将返回 <b>0</b>
     */
    int guessGoodsId();

    /**
     * 用于推测新商品的图片表ID号
     *
     * @return 返回下一商品的图片表ID号，如果数据库访问失败将返回 <b>0</b>
     */
    int guessPicId();

    /**
     * 查询商品图片表总数
     *
     * @return 返回商品图片表总数
     */
    int getPicCount();

    /**
     * 通过商品ID获得指定图片的路径
     *
     * @param id  要查询的商品ID
     * @param pic 要获取的图片序号
     * @return 如果操作成功则返回该图片的路径；否则返回 <b>null</b>
     */
    String getPicPathByGoodsId(int id, int pic);

    /**
     * 通过图片表ID号获取指定图的路径
     *
     * @param id  要查询的ID号
     * @param pic 要获取的图片序号
     * @return 如果操作成功则返回该图片的路径；否则返回 <b>null</b>
     */
    String getPicPathById(int id, int pic);

    /**
     * 通过ID号获取指定商品的产地
     *
     * @param id 要查询的ID号
     * @return 如果操作成功则返回该商品的产地；否则返回 <b>null</b>
     */
    String getProduById(int id);

    /**
     * 通过指定的ID号设置该商品的产地
     *
     * @param id    要设置的ID号
     * @param produ 要设置的产地
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean setProduById(int id, String produ);

    /**
     * 根据ID号删除指定的商品
     *
     * @param id 要删除的商品的ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean deleteGoodsById(int id);

    /**
     * 随机取得一条商品记录
     *
     * @return 如果查询成功则返回该商品的 <b>GoodsbaseEntity</b> 对象；否则返回 <b>null</b>
     */
    GoodsbaseEntity getRandomOne();

    /**
     * 查询指定数量的最新商品
     *
     * @param i 指定要查询的数量
     * @return 如果查询成功则返回 <b>List&lt;GoodsbaseEntity&gt;</b>；否则返回 <b>null</b>
     */
    List<GoodsbaseEntity> getXNewest(int i);

    /**
     * 查询指定数量的热销商品
     *
     * @param i 指定要查询的数量
     * @return 如果查询成功则返回 <b>List&lt;GoodsbaseEntity&gt;</b>；否则返回 <b>null</b>
     */
    List<GoodsbaseEntity> getBestSealXGoods(int i);

}
