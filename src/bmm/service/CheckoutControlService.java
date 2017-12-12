package bmm.service;

/**
 * 关于购物车的操作接口
 */
public interface CheckoutControlService {
    /**
     * 查询指定用户的购物车商品总价
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    double getTotal(int id);

    /**
     * 查询指定用户的购物车商品总数
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户购物车的商品总价；否则返回 <b>0</b>
     */
    int getCount(int id);
}