package bmm.dao.impl;

import bmm.dao.CategorizationControlDAO;
import bmm.entity.CategorizationEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 有关分类数据库操作的数据库接口的实现
 */
public class CategorizationControlDAOImpl implements CategorizationControlDAO {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 通过类别ID号获得对应的名称
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的分类名，如果查询失败则返回 <b>null</b>
     */
    @Override
    public String getCateNameById(int id) {
        String hql = "select ce.name from CategorizationEntity ce where ce.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            return o.toString();
        }
        return null;
    }

    /**
     * 通过类别名称获得对应的ID号
     *
     * @param name 要查询的名称
     * @return 如果查询成功返回该名称对应的ID号, 如果查询失败则返回 <b>0</b>
     */
    @Override
    public int GetIdByCateName(String name) {
        String hql = "select ce.id from CategorizationEntity ce where ce.name=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, name);
        for (Object o : list) {
            return Integer.parseInt(o.toString());
        }
        return 0;
    }

    /**
     * 新增分类
     *
     * @param name 分类名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean addCategorization(String name) {
        boolean flag = false;
        CategorizationEntity categorizationEntity = new CategorizationEntity();
        categorizationEntity.setName(name);
        try {
            hibernateTemplate.save(categorizationEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据ID号更改对应的类的名称
     *
     * @param id      要查询的ID号
     * @param newName 要修改的名称
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean setCateNameById(int id, String newName) {
        boolean flag = false;
        String hql = "update CategorizationEntity ce set ce.name=:newName where ce.id=?";
        List<CategorizationEntity> list = (List<CategorizationEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (CategorizationEntity categorizationEntity : list) {
                    categorizationEntity.setName(newName);
                    try {
                        hibernateTemplate.update(categorizationEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 删除指定ID号对应的分类
     *
     * @param id 要删除的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean deleteCateNameById(int id) {
        boolean flag = false;
        String hql = "from CategorizationEntity ce where ce.id=?";
        List<CategorizationEntity> list = (List<CategorizationEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (CategorizationEntity categorizationEntity : list) {
                    try {
                        hibernateTemplate.delete(categorizationEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 查询所有的分类信息
     *
     * @return 如果查询成功则返回一个 <b>list</b>；否则返回 <b>null</b>6
     */
    @Override
    public List<CategorizationEntity> showAllCate() {
        List<CategorizationEntity> list = (List<CategorizationEntity>)
                hibernateTemplate.find("from CategorizationEntity");
        return list;
    }

}
