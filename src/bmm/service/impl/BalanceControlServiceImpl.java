package bmm.service.impl;

import bmm.dao.BalanceControlDAO;
import bmm.service.BalanceControlService;

/**
 * 余额的业务操作接口的实现
 */
public class BalanceControlServiceImpl implements BalanceControlService {
    private BalanceControlDAO balanceControlDAO;

    public void setBalanceControlDAO(BalanceControlDAO balanceControlDAO) {
        this.balanceControlDAO = balanceControlDAO;
    }

    /**
     * 根据指定的用户ID号扣除相应金额
     *
     * @param id    要操作的ID号
     * @param total 要扣除的金额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean deductBalanceById(int id, double total) {
        boolean flag = false;
        if (total > balanceControlDAO.getBalanceById(id)) {
            return false;
        } else {
            if (balanceControlDAO.setBalanceById(balanceControlDAO.getIdByUserId(id),
                    (balanceControlDAO.getBalanceById(id) - total))) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 向指定的用户ID的用户充值相应金额
     *
     * @param id    要操作的ID号
     * @param total 要充值的金额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean rechargeById(int id, double total) {
        boolean flag = false;
        if (balanceControlDAO.setBalanceById(balanceControlDAO.getIdByUserId(id),
                (balanceControlDAO.getBalanceById(id) + total))) {
            flag = true;
        }
        return flag;
    }
}
