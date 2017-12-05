package test;

import bmm.dao.UserControlDAO;
import bmm.dao.impl.UserControlDAOImpl;
import bmm.service.AdminControlService;
import bmm.service.UserControlService;
import bmm.service.impl.AdminControlServiceImpl;
import bmm.service.impl.UserlControlServiceImpl;
import bmm.struts.action.user.UserControlAction;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    @Test
    public void updateTest() {
        AdminControlService adminControlService = new AdminControlServiceImpl();
        adminControlService.changePassword("root", "aaa");
    }
}
