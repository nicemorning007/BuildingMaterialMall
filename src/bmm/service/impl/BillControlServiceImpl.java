package bmm.service.impl;

import bmm.dao.BillControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.service.BillControlService;

import java.util.List;

public class BillControlServiceImpl implements BillControlService {
    private BillControlDAO billControlDAO;

    public BillControlDAO getBillControlDAO() {
        return billControlDAO;
    }

    public void setBillControlDAO(BillControlDAO billControlDAO) {
        this.billControlDAO = billControlDAO;
    }

    /**
     * 用于查询所有的订单
     *
     * @return 如果查询成功则返回 <b>List&lt;BillbaseEntity&gt;</b> 对象，否则返回 <b>null</b>
     */
    @Override
    public List<BillbaseEntity> showAllBills() {
        return billControlDAO.showAllBills();
    }
}
