package bmm.dao;

import bmm.entity.BillbaseEntity;

import java.util.List;

/**
 * 关于订单的数据库操作接口
 */
public interface BillControlDAO {
    /**
     * 通过用户ID查询与其有关的所有订单ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功返回该用户的所有订单ID数组，否则返回 <b>null</b>
     */
    List<?> getIdByUserId(int id);

    /**
     * 通过订单ID查询对应的用户ID号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的用户ID号，否则返回 <b>0</b>
     */
    int getUserIdById(int id);

    /**
     * 通过订单ID查询对应的商品ID
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的商品ID，否则返回 <b>0</b>
     */
    int getGoodsIdById(int id);

    /**
     * 通过订单ID查询对应的状态码
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的状态码，否则返回 <b>0</b>
     */
    int getStateById(int id);

    /**
     * 通过订单ID查询对应的总价
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的总价，否则返回 <b>0</b>
     */
    double getTotalById(int id);

    /**
     * 通过订单ID查询对应的收件人
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的收件人，否则返回 <b>0</b>
     */
    String getReceiverById(int id);

    /**
     * 通过订单ID查询对应的手机号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的手机号，否则返回 <b>0</b>
     */
    String getPhoneById(int id);

    /**
     * 通过订单ID查询对应的地址
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的地址，否则返回 <b>0</b>
     */
    String getAddressById(int id);

    /**
     * 通过订单ID查询对应的下单时间
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的下单时间，否则返回 <b>0</b>
     */
    String getTimeById(int id);

    /**
     * 用于查询所有的订单
     *
     * @return 如果查询成功则返回 <b>List&lt;BillbaseEntity&gt;</b> 对象，否则返回 <b>null</b>
     */
    List<BillbaseEntity> showAllBills();

    /**
     * 更新指定ID的状态值
     *
     * @param id    要更新的ID号
     * @param state 要更新的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updateStateById(int id, int state);

    /**
     * 更新指定ID的订单总价
     *
     * @param id    要更新的ID号
     * @param total 要更新的总价
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updateTotalById(int id, double total);

    /**
     * 更新指定ID的订单的收件人
     *
     * @param id       要更新的ID号
     * @param receiver 要更新的收件人
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean updateReceiverById(int id, String receiver);

    /**
     * 用于获取总订单数
     *
     * @return 如果查询成功则返回总订单数；否则返回 <b>0</b>
     */
    int getBillCount();

    /**
     * 用于统计总成交额
     *
     * @return 如果查询成功则返回总成交额；否则返回 <b>0</b>
     */
    double getBillTotalCount();

    /**
     * 向指定ID的用户添加新的订单
     *
     * @param userId   用户ID号
     * @param goodsId  商品ID号
     * @param state    订单状态码
     * @param total    订单总价
     * @param receiver 收件人
     * @param phone    手机号
     * @param address  收件地址
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean addBillById(int userId, int goodsId, int state, double total, String receiver, String phone, String address);

    /**
     * 通过指定的用户ID查找该用户的所有订单ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功则返回该用户对应的所有订单ID的 <b>List&lt;Integer&gt;</b>；否则返回 <b>null</b>
     */
    List<Integer> getOneUserAllBillIdByUserId(int id);

    /**
     * 通过指定的用户ID查找该用户的所有未支付订单
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户对应的所有订单ID的 <b>List&lt;Integer&gt;</b>；否则返回 <b>null</b>
     */
    List<Integer> getOneUserAllUnPayBillIdByUserId(int id);

}
