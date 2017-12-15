package bmm.dao;

/**
 * 关于余额的数据库操作接口
 */
public interface BalanceControlDAO {
    /**
     * 根据指定的用户ID号获取对应的余额表ID号
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该ID号，否则返回 <b>0</b>
     */
    int getIdByUserId(int id);

    /**
     * 根据指定的ID号获取对应的用户ID号
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号，否则返回 <b>0</b>
     */
    int getUserIdbyId(int id);

    /**
     * 根据指定的ID号获取对应的用户的余额
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该用户的余额，否则返回 <b>-1</b>
     */
    double getBalanceById(int id);

    /**
     * 根据指定的ID号设置用户ID
     * @param id 要操作的ID号
     * @param userId 要设置的用户ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean setUseridById(int id, int userId);

    /**
     * 根据指定的ID号设置余额
     * @param id 要操作的ID号
     * @param balance 要设置的余额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean setBalanceById(int id, double balance);
}
