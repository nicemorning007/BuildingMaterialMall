package test;

import bmm.service.AdminControlService;
import bmm.service.impl.AdminControlServiceImpl;
import org.junit.jupiter.api.Test;

public class TranscationTest {
    @Test
    public void getUsername() {
        AdminControlService adminControlService = new AdminControlServiceImpl();
        if (adminControlService.isExist("root")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
