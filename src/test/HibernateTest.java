package test;

import bmm.dao.BillControlDAO;
import bmm.dao.GoodsControlDAO;
import bmm.entity.BillbaseEntity;
import bmm.entity.GoodsbaseEntity;
import bmm.utils.hibernate_util.SpringInjectionUtil;
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
//        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("spring-config.xml");
//        BillControlDAO dao = (BillControlDAO) resource.getBean("billControlDao");
//        List<BillbaseEntity> list = dao.showAllBills();
//        for (BillbaseEntity billbaseEntity : list) {
//            System.out.println(billbaseEntity.getReceiver());
//        }

        BillControlDAO billControlDAO = (BillControlDAO) SpringInjectionUtil.getDao("billControlDao");
        List<BillbaseEntity> list = billControlDAO.showAllBills();
        for (BillbaseEntity billbaseEntity : list) {
            System.out.println(billbaseEntity.getReceiver());
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
