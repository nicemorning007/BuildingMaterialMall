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
}
