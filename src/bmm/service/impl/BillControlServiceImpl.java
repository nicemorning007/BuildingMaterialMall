package bmm.service.impl;

import bmm.dao.BillControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.service.BillControlService;

import java.util.List;

/**
 * 订单的管理操作接口的实现
 */
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

    /**
     * 更新指定ID的状态值
     *
     * @param id    要更新的ID号
     * @param state 要更新的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateStateById(int id, int state) {
        return billControlDAO.updateStateById(id, state);
    }

    /**
     * 更新指定ID的订单总价
     *
     * @param id    要更新的ID号
     * @param total 要更新的总价
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateTotalById(int id, double total) {
        return billControlDAO.updateTotalById(id, total);
    }

    /**
     * 更新指定ID的订单的收件人
     *
     * @param id       要更新的ID号
     * @param receiver 要更新的收件人
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean updateReceiverById(int id, String receiver) {
        return billControlDAO.updateReceiverById(id, receiver);
    }

    /**
     * 完成指定ID所对应的用户的支付操作
     *
     * @param id 要执行的用户ID
     * @return 如果操作成功则返回应扣除的总数；否则返回 <b>0</b>
     */
    @Override
    public double payMent(int id) {
        double total = 0;
        List<Integer> list = billControlDAO.getOneUserAllUnPayBillIdByUserId(id);
        if (list != null) {
            for (Integer integer : list) {
                billControlDAO.updateStateById(integer, 1);
                total += billControlDAO.getTotalById(integer);
            }
        }

        return total;
    }
}
