package bmm.dao;

import bmm.entity.GoodsbaseEntity;

import java.util.List;

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

}
