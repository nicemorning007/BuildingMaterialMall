package test;

import bmm.service.AdminControlService;
import bmm.service.impl.AdminControlServiceImpl;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    @Test
    public void updateTest() {
        AdminControlService adminControlService = new AdminControlServiceImpl();
        adminControlService.changePassword("root", "aaa");
    }
}
