package bmm.dao;

/**
 * 有关分类数据库操作的接口
 */
public interface CategorizationControlDAO {
    /**
     * 通过类别ID号获得对应的名称
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的分类名，如果查询失败则返回 <b>null</b>
     */
    String getCateNameById(int id);

    /**
     * 通过类别名称获得对应的ID号
     * @param name 要查询的名称
     * @return 如果查询成功返回该名称对应的ID号,如果查询失败则返回 <b>0</b>
     */
    int GetIdByCateName(String name);

    /**
     * 新增分类
     * @param name 分类名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean addCategorization(String name);

    /**
     * 根据ID号更改对应的类的名称
     * @param id 要查询的ID号
     * @param newName 要修改的名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean changeCateNameById(int id, String newName);

    /**
     * 删除指定ID号对应的分类
     * @param id 要删除的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    boolean deeleteCateNameById(int id);
}
