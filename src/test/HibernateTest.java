package test;

import bmm.dao.AdminControlDAO;
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
        GoodsControlDAO billControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
        List<GoodsbaseEntity> list = billControlDAO.getGoodsDependByCateByPage(1, 1);
        for (GoodsbaseEntity g : list) {
            System.out.println(g.getName());
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
