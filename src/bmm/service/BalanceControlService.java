package bmm.service;

/**
 * 余额的业务操作接口
 */
public interface BalanceControlService {
    /**
     * 根据指定的用户ID号扣除相应金额
     *
     * @param id    要操作的ID号
     * @param total 要扣除的金额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean deductBalanceById(int id, double total);

    /**
     * 向指定用户ID的用户充值相应金额
     *
     * @param id    要操作的ID号
     * @param total 要充值的金额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean rechargeById(int id, double total);
}
