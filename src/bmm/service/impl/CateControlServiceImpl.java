package bmm.service.impl;

import bmm.dao.CategorizationControlDAO;
import bmm.service.CateControlService;

public class CateControlServiceImpl implements CateControlService {
    private CategorizationControlDAO categorizationControlDAO;

    public CategorizationControlDAO getCategorizationControlDAO() {
        return categorizationControlDAO;
    }

    public void setCategorizationControlDAO(CategorizationControlDAO categorizationControlDAO) {
        this.categorizationControlDAO = categorizationControlDAO;
    }

    /**
     * 根据指定的ID号编辑分类名
     *
     * @param id      要修改的ID号
     * @param newName 新增的分类名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean editCateNameById(int id, String newName) {
        return categorizationControlDAO.setCateNameById(id, newName);
    }

    /**
     * 新增分类名
     *
     * @param name 要增加的名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean addCateName(String name) {
        boolean flag = false;
        if (categorizationControlDAO.GetIdByCateName(name) == 0) {
            flag = categorizationControlDAO.addCategorization(name);
        }
        return flag;
    }

    /**
     * 删除指定ID的分类
     *
     * @param id 要删除的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean deleteCate(int id) {
        return categorizationControlDAO.deleteCateNameById(id);
    }
}
