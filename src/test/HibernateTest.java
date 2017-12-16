package test;

import bmm.dao.UserControlDAO;
import bmm.utils.hibernate_util.SpringInjectionUtil;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    @Test
    public void test() {
        UserControlDAO userControlDAO = (UserControlDAO) SpringInjectionUtil.getDao("userControlDao");
        System.out.println(userControlDAO.getUserCount());
    }
}
