package bmm.service;

/**
 * 关于购物车的操作接口
 */
public interface CheckoutControlService {
    /**
     * 查询指定用户的购物车商品总价
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    double getTotal(int id);

    /**
     * 查询指定用户的购物车商品总数
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    int getCount(int id);

    /**
     * 用于将商品添加到购物车中
     *
     * @param goodsId 要添加的商品ID
     * @param count   要添加的商品数量
     * @param userId  对应的操作用户
     * @return 如果操作成功则返回 <b>true</b>；否则返回返回 <b>false</b>
     */
    boolean addTo(int goodsId, int count, int userId);

    /**
     * 用于查询指定用户的购物车总余额
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    double getAllTotal(int id);

    /**
     * 用于移除指定用户的购物车中的指定商品
     *
     * @param goodsId 指定的商品的ID
     * @param userId  指定的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean removeGoods(int goodsId, int userId);

    /**
     * 用于给指定用户结算购物车
     *
     * @param id 指定的用户ID
     * @return 如果操作成功则返回该用户订单总额；否则返回 <b>0</b>
     */
    double addToBill(int id);

    /**
     * 根据指定的用户ID清除该用户的购物车
     * @param id 要操作的用户ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean cleanOneById(int id);
}