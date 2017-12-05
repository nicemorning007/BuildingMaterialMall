package bmm.dao;

import bmm.entity.UserinfoEntity;

import java.util.List;

public interface UserinfoDAO {
    /**
     * 查询所有用户的所有信息
     * @return 所有用户的所有信息的list列表
     */
    List<UserinfoEntity> showAllInfo();
}
