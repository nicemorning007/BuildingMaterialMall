package bmm.service;

import bmm.entity.BillbaseEntity;

import java.util.List;

public interface BillControlService {
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
     * 完成指定ID所对应的用户的支付操作
     *
     * @param id 要执行的用户ID
     * @return 如果操作成功则返回应扣除的总数；否则返回 <b>0</b>
     */
    double payMent(int id);
}
