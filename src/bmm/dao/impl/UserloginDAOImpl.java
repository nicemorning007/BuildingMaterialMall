package bmm.dao.impl;

import bmm.dao.UserloginDAO;
import bmm.entity.UserloginEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class UserloginDAOImpl implements UserloginDAO {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public UserloginEntity login(int id) {
        return this.hibernateTemplate.get(UserloginEntity.class,id);
    }
}