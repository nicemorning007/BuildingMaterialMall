package test;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HibernateTest {
    @Test
    public void allTest() {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("spring-config.xml");
        GoodsControlDAO dao = (GoodsControlDAO) resource.getBean("goodsControlDao");
//        System.out.println(dao.getOneAllInfo(1).getName());
        List<GoodsbaseEntity> list = dao.showAllGoods();
        for (GoodsbaseEntity goodsbaseEntity : list) {
            System.out.println(goodsbaseEntity.getName()+"  "+goodsbaseEntity.getInfo());
        }
    }
}