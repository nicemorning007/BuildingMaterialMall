package bmm.service;

/**
 * 消息的管理操作接口
 */
public interface MessageControlService {
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
