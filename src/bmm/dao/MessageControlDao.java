package bmm.dao;

import bmm.entity.MessageEntity;

import java.util.List;

/**
 * 关于消息的数据库操作接口
 */
public interface MessageControlDao {
    /**
     * 根据指定的用户ID查找对应的消息表ID号
     *
     * @param id 要查询的用户ID
     * @return 如果查询成功则返回 <b>List&lt;Integer&gt;</b>；否则返回<b>null</b>
     */
    List<Integer> getIdByUserId(int id);

    /**
     * 根据指定的ID号查找对应的用户ID
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的用户ID，否则返回 <b>0</b>
     */
    int getUserIdById(int id);

    /**
     * 根据指定的ID号查找对应的联系方式
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的联系方式，否则返回 <b>null</b>
     */
    String getContactById(int id);

    /**
     * 根据指定的ID号查找对应的联系人
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的联系人，否则返回 <b>null</b>
     */
    String getNameById(int id);

    /**
     * 根据指定的ID号查找对应的信息
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的信息，否则返回 <b>null</b>
     */
    String getMessageById(int id);

    /**
     * 根据指定的ID号查找对应的状态码
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回该ID号对应的状态码，否则返回 <b>0</b>
     */
    int getStateById(int id);

    /**
     * 显示所有的消息
     *
     * @return 如果查询成功则返回 <b>List&lt;MessageEntity&gt;</b>；否则返回<b>null</b>
     */
    List<MessageEntity> getAll();

    /**
     * 根据指定的ID号查找对应的一条记录
     *
     * @param id 要查询的ID号
     * @return 如果查询成功则返回 <b>MessageEntity</b>对象；否则返回 <b>null</b>
     */
    MessageEntity getOneById(int id);

    /**
     * 添加新的消息到消息表中
     *
     * @param userId  关联的用户ID
     * @param contact 对应的联系方式
     * @param name    对应的联系人
     * @param message 对应的消息内容
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean addNewMessage(int userId, String contact, String name, String message);

    /**
     * 根据指定的ID修改状态值
     *
     * @param id 要操作的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean chageState(int id);
}
