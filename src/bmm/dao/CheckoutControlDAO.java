package bmm.dao;

import bmm.entity.CheckoutEntity;

import java.util.List;

/**
 * 关于购物车数据库的操作接口
 */
public interface CheckoutControlDAO {
    /**
     * 通过指定的ID获得对应的用户ID号
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的用户ID；否则返回 <b>0</b>
     */
    int getUserIdById(int id);

    /**
     * 通过指定的用户ID号获得对应的ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的ID；否则返回 <b>0</b>
     */
    int getIdByUserId(int id);

    /**
     * 通过指定的ID号获得对应的商品名称
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号商品名称；否则返回 <b>null</b>
     */
    String getGoodsNameById(int id);

    /**
     * 通过指定的ID号获得对应的商品ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的商品ID；否则返回 <b>0</b>
     */
    int getGoodsIdById(int id);

    /**
     * 通过指定的ID号获得对应的商品数量
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的商品数量；否则返回 <b>0</b>
     */
    int getGoodsCountById(int id);

    /**
     * 查询指定用户的购物车的所有信息
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该ID号对应的 <b>List&lt;CheckoutEntity&gt;</b>；否则返回 <b>null</b>
     */
    List<CheckoutEntity> showAll(int id);
}
