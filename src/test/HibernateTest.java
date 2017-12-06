package test;

import bmm.dao.AdminControlDAO;
import bmm.dao.CategorizationControlDAO;
import bmm.dao.UserControlDAO;
import bmm.dao.impl.AdminControlDAOImpl;
import bmm.dao.impl.CategorizationDAOImpl;
import bmm.dao.impl.UserControlDAOImpl;
import bmm.service.AdminControlService;
import bmm.service.impl.AdminControlServiceImpl;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HibernateTest {
    @Test
    public void updateTest() {
        AdminControlService adminControlService = new AdminControlServiceImpl();
        adminControlService.changePassword("root", "aaa");
    }

    @Test
    public void getIdTest() {
        AdminControlDAO adminControlDAO = new AdminControlDAOImpl();
        System.out.println(adminControlDAO.getIdByUsername("root"));
    }

    @Test
    public void getTime() {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        System.out.println(format.format(calendar.getTime()));
    }

    @Test
    public void getLastestTime() {
        UserControlDAO userControlDAO = new UserControlDAOImpl();
        System.out.println(userControlDAO.getLatestLoginTimeById(3));
    }

    @Test
    public void cateTest() {
        CategorizationControlDAO categorizationControlDAO = new CategorizationDAOImpl();
        System.out.println(categorizationControlDAO.GetIdByCateName("结构料件"));
    }
}
