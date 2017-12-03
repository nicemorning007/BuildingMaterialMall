package bmm.service.impl;

import bmm.dao.UserloginDAO;
import bmm.entity.UserloginEntity;
import bmm.service.UserloginEntityService;

import java.util.List;

public class UserloginEntityServiceImpl implements UserloginEntityService {
    private UserloginDAO userloginDAO;

    public UserloginDAO getUserloginDAO() {
        return userloginDAO;
    }

    public void setUserloginDAO(UserloginDAO userloginDAO) {
        this.userloginDAO = userloginDAO;
    }

    @Override
    public UserloginEntity login(int id) {
        return this.userloginDAO.login(id);
    }
}
