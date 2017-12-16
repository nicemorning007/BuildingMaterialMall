package bmm.dao.impl;

import bmm.dao.MessageControlDao;
import bmm.entity.MessageEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 关于消息的数据库操作接口的实现
 */
@Transactional
public class MessageControlDAOImpl implements MessageControlDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 根据指定的用户ID查找对应的消息表ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功则返回 <b>List&lt;Integer&gt;</b>；否则返回<b>null</b>
     */
    @Override
    public List<Integer> getIdByUserId(int id) {
        String hql = "select me.id from MessageEntity me where me.userId=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list;
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的用户ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的用户ID，否则返回 <b>0</b>
     */
    @Override
    public int getUserIdById(int id) {
        String hql = "select me.userId from MessageEntity me where me.id=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据指定的ID号查找对应的联系方式
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的联系方式，否则返回 <b>null</b>
     */
    @Override
    public String getContactById(int id) {
        String hql = "select me.contact from MessageEntity me where me.id=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的联系人
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的联系人，否则返回 <b>null</b>
     */
    @Override
    public String getNameById(int id) {
        String hql = "select me.name from MessageEntity me where me.id=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的信息
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的信息，否则返回 <b>null</b>
     */
    @Override
    public String getMessageById(int id) {
        String hql = "select me.message from MessageEntity me where me.id=?";
        List<String> list = (List<String>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的状态码
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的状态码，否则返回 <b>0</b>
     */
    @Override
    public int getStateById(int id) {
        String hql = "select me.state from MessageEntity me where me.id=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 显示所有的消息
     *
     * @return 如果查询成功则返回 <b>List&lt;MessageEntity&gt;</b>；否则返回<b>null</b>
     */
    @Override
    public List<MessageEntity> getAll() {
        String hql = "from MessageEntity me";
        List<MessageEntity> list = (List<MessageEntity>) hibernateTemplate.find(hql);
        if (list != null) {
            if (list.size() > 0) {
                return list;
            }
        }
        return null;
    }

    /**
     * 根据指定的ID号查找对应的一条记录
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回 <b>MessageEntity</b>对象；否则返回 <b>null</b>
     */
    @Override
    public MessageEntity getOneById(int id) {
        String hql = "from MessageEntity me where me.id=?";
        List<MessageEntity> list = (List<MessageEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    /**
     * 添加新的消息到消息表中
     *
     * @param userId  关联的用户ID
     * @param contact 对应的联系方式
     * @param name    对应的联系人
     * @param message 对应的消息内容
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean addNewMessage(int userId, String contact, String name, String message) {
        boolean flag = false;
        MessageEntity messageEntity = new MessageEntity();
        if (userId != 0) {
            messageEntity.setUserId(userId);
        }
        messageEntity.setContact(contact);
        messageEntity.setName(name);
        messageEntity.setMessage(message);
        try {
            hibernateTemplate.save(messageEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据指定的ID修改状态值
     *
     * @param id 要操作的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean chageState(int id) {
        boolean flag = false;
        MessageEntity messageEntity;
        messageEntity = (MessageEntity) hibernateTemplate.get(MessageEntity.class, id);
        if (messageEntity != null) {
            messageEntity.setState(1);
            try {
                hibernateTemplate.update(messageEntity);
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
}
