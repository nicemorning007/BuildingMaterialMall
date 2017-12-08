package test;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.List;

/**
 * 仅供数据库操作测试方法
 */
public class HibernateTest {
    @Test
    public void allTest() {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("spring-config.xml");
        GoodsControlDAO dao = (GoodsControlDAO) resource.getBean("goodsControlDao");
        List<?> list = dao.showAllGoods();
        System.out.println(list.size());
        for (Object o : list) {
            if (o != null) {
                GoodsbaseEntity goodsbaseEntity = (GoodsbaseEntity) o;
                System.out.println(goodsbaseEntity.getId());
                System.out.println(dao.getPicPathByGoodsId(goodsbaseEntity.getId(),1));
            } else {
                System.out.println("object is null");
            }
        }
    }

    @Test
    public void fileTest() {
        try {
            File file = new File("D:\\OneDrive\\Pictures\\相機相簿\\20170201_154407000_iOS.jpg");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            File toFile = new File("E:/", "20170201_154407000_iOS.jpg");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
            int len;
            while ((len = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(len);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
