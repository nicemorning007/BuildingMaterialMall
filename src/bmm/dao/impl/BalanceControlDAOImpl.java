package bmm.dao.impl;

import bmm.dao.BalanceControlDAO;
import bmm.entity.BalanceEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 关于余额的数据库操作接口的实现
 */
public class BalanceControlDAOImpl implements BalanceControlDAO {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 根据指定的用户ID号获取对应的余额表ID号
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByUserId(int id) {
        String hql = "select be.id from BalanceEntity be where be.userId=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据指定的ID号获取对应的用户ID号
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号，否则返回 <b>0</b>
     */
    @Override
    public int getUserIdbyId(int id) {
        String hql = "select be.userId from BalanceEntity be where be.id=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据指定的ID号获取对应的用户的余额
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该用户的余额，否则返回 <b>-1</b>
     */
    @Override
    public double getBalanceById(int id) {
        String hql = "select be.balance from BalanceEntity be where be.id=?";
        List<Double> list = (List<Double>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据指定的ID号设置用户ID
     *
     * @param id     要操作的ID号
     * @param userId 要设置的用户ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean setUseridById(int id, int userId) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BalanceEntity balanceEntity = (BalanceEntity) session.get(BalanceEntity.class, id);
        balanceEntity.setUserId(userId);
        try {
            session.update(balanceEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return flag;
    }

    /**
     * 根据指定的ID号设置余额
     *
     * @param id      要操作的ID号
     * @param balance 要设置的余额
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean setBalanceById(int id, double balance) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BalanceEntity balanceEntity = (BalanceEntity) session.get(BalanceEntity.class, id);
        balanceEntity.setBalance(balance);
        try {
            session.update(balanceEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return flag;
    }
}
