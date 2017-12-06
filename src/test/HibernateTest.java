package test;

import bmm.dao.GoodsControlDAO;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateTest {
    @Test
    public void allTest() {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("spring-config.xml");
        GoodsControlDAO dao = (GoodsControlDAO) resource.getBean("goodsControlDao");
        System.out.println(dao.setNameById(1,"dsa"));
    }
}