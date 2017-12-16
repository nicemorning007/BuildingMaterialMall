package bmm.dao.impl;

import bmm.dao.BillControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * 关于订单的数据库操作接口的实现
 */
public class BillControlDAOImpl implements BillControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 通过用户ID查询与其有关的所有订单ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功返回该用户的所有订单ID数组，否则返回 <b>null</b>
     */
    @Override
    public List<Object> getIdByUserId(int id) {
        String hql = "select be.id from BillbaseEntity be where be.userId=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list;
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的用户ID号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的用户ID号，否则返回 <b>0</b>
     */
    @Override
    public int getUserIdById(int id) {
        String hql = "select be.userId from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的商品ID
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的商品ID，否则返回 <b>0</b>
     */
    @Override
    public int getGoodsIdById(int id) {
        String hql = "select be.goodsId from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的状态码
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的状态码，否则返回 <b>0</b>
     */
    @Override
    public int getStateById(int id) {
        String hql = "select be.state from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的总价
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的总价，否则返回 <b>0</b>
     */
    @Override
    public double getTotalById(int id) {
        String hql = "select be.total from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Double.parseDouble(o.toString());
            }
        }
        return 0;
    }

    /**
     * 通过订单ID查询对应的收件人
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的收件人，否则返回 <b>0</b>
     */
    @Override
    public String getReceiverById(int id) {
        String hql = "select be.receiver from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的手机号
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的手机号，否则返回 <b>0</b>
     */
    @Override
    public String getPhoneById(int id) {
        String hql = "select be.phone from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的地址
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的地址，否则返回 <b>0</b>
     */
    @Override
    public String getAddressById(int id) {
        String hql = "select be.address from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过订单ID查询对应的下单时间
     *
     * @param id 要查询的订单ID号
     * @return 如果查询成功则返回该订单所对应的下单时间，否则返回 <b>0</b>
     */
    @Override
    public String getTimeById(int id) {
        String hql = "select be.time from BillbaseEntity be where be.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 用于查询所有的订单
     *
     * @return 如果查询成功则返回 <b>List&lt;BillbaseEntity&gt;</b> 对象，否则返回 <b>null</b>
     */
    @Override
    public List<BillbaseEntity> showAllBills() {
        List<BillbaseEntity> list = (List<BillbaseEntity>) hibernateTemplate.find("from BillbaseEntity");
        return list;
    }

    /**
     * 更新指定ID的状态值
     *
     * @param id    要更新的ID号
     * @param state 要更新的状态值
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updateStateById(int id, int state) {
        boolean flag = false;
        BillbaseEntity billbaseEntity = (BillbaseEntity) hibernateTemplate.get(BillbaseEntity.class, id);
        billbaseEntity.setState(state);
        try {
            hibernateTemplate.update(billbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 更新指定ID的订单总价
     *
     * @param id    要更新的ID号
     * @param total 要更新的总价
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updateTotalById(int id, double total) {
        boolean flag = false;
        BillbaseEntity billbaseEntity = (BillbaseEntity) hibernateTemplate.get(BillbaseEntity.class, id);
        billbaseEntity.setTotal(total);
        try {
            hibernateTemplate.update(billbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 更新指定ID的订单的收件人
     *
     * @param id       要更新的ID号
     * @param receiver 要更新的收件人
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updateReceiverById(int id, String receiver) {
        boolean flag = false;
        BillbaseEntity billbaseEntity = (BillbaseEntity) hibernateTemplate.get(BillbaseEntity.class, id);
        billbaseEntity.setReceiver(receiver);
        try {
            hibernateTemplate.update(billbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 用于获取总订单数
     *
     * @return 如果查询成功则返回总订单数；否则返回 <b>0</b>
     */
    @Override
    public int getBillCount() {
        String hql = "select count(*) from BillbaseEntity as be";
        Long count = (Long) getHibernateTemplate().find(hql).listIterator().next();
        return count.intValue();
    }

    /**
     * 用于统计总成交额
     *
     * @return 如果查询成功则返回总成交额；否则返回 <b>0</b>
     */
    @Override
    public double getBillTotalCount() {
        String sql = "SELECT sum(billbase.total) FROM billbase WHERE state !=0 AND state !=4";
        Session session = HibernateUtil.getSession();
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        List<Object> list = sqlQuery.list();
        for (Object o : list) {
            if (o != null) {
                return Double.parseDouble(o.toString());
            }
        }
        session.close();
        return 0;
    }

    /**
     * 向指定ID的用户添加新的订单
     *
     * @param userId     用户ID号
     * @param goodsId    商品ID号
     * @param goodsCount 商品总数
     * @param state      订单状态码
     * @param total      订单总价
     * @param receiver   收件人
     * @param phone      手机号
     * @param address    收件地址
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean addBillById(int userId, int goodsId, int goodsCount, int state, double total, String receiver, String phone, String address) {
        boolean flag = false;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        BillbaseEntity billbaseEntity = new BillbaseEntity();
        billbaseEntity.setUserId(userId);
        billbaseEntity.setGoodsId(goodsId);
        billbaseEntity.setGoodsCount(goodsCount);
        billbaseEntity.setState(state);
        billbaseEntity.setTotal(total);
        billbaseEntity.setReceiver(receiver);
        billbaseEntity.setPhone(phone);
        billbaseEntity.setAddress(address);
        billbaseEntity.setTime(format.format(calendar.getTime()));
        try {
            hibernateTemplate.save(billbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 通过指定的用户ID查找该用户的所有订单ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功则返回该用户对应的所有订单ID的 <b>List&lt;Integer&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    public List<Integer> getOneUserAllBillIdByUserId(int id) {
        String hql = "select be.id from BillbaseEntity be where be.userId=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list;
            }
        }
        return null;
    }

    /**
     * 通过指定的用户ID查找该用户的所有未支付订单
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户对应的所有订单ID的 <b>List&lt;Integer&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    public List<Integer> getOneUserAllUnPayBillIdByUserId(int id) {
        String hql = "from BillbaseEntity be where be.userId=? and be.state=0";
        List<BillbaseEntity> list = (List<BillbaseEntity>) hibernateTemplate.find(hql, id);
        List<Integer> integerList = new ArrayList<>();
        if (list != null) {
            if (list.size() > 0) {
                for (BillbaseEntity billbaseEntity : list) {
                    integerList.add(billbaseEntity.getId());
                }
                return integerList;
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的订单的商品总数
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回对应的商品总数；否则返回 <b>0</b>
     */
    @Override
    public int getGoodsCountById(int id) {
        List<Integer> list = (List<Integer>) hibernateTemplate.find(
                "select be.goodsCount from BillbaseEntity be where be.id=?", id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }
}
