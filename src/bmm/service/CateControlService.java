package bmm.service;

/**
 * 关于分类的操作接口
 */
public interface CateControlService {
    /**
     * 根据指定的ID号编辑分类名
     *
     * @param id      要修改的ID号
     * @param newName 新增的分类名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean editCateNameById(int id, String newName);

    /**
     * 新增分类名
     *
     * @param name 要增加的名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean addCateName(String name);

    /**
     * 删除指定ID的分类
     *
     * @param id 要删除的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean deleteCate(int id);
}
