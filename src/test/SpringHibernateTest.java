package test;

import bmm.entity.UserloginEntity;
import bmm.service.UserloginEntityService;
import bmm.utils.ApplicationContextUtil;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateTest {
    @Test
    public void TestLogin() {
        UserloginEntity userloginEntity;
        UserloginEntityService userloginEntityService =
                ApplicationContextUtil.getApplicationContext().getBean("userloginService", UserloginEntityService.class);
        userloginEntity = userloginEntityService.login(1);
        System.out.println(userloginEntity.getPassword() + "   " + userloginEntity.getUsername());
    }
}