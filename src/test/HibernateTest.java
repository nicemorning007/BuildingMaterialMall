package test;

import bmm.dao.CheckoutControlDAO;
import bmm.dao.GoodsControlDAO;
import bmm.entity.CheckoutEntity;
import bmm.service.CheckoutControlService;
import bmm.utils.hibernate_util.SpringInjectionUtil;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 仅供数据库操作测试方法
 */
public class HibernateTest {
    @Test
    public void allTest() {
        CheckoutControlDAO dao = (CheckoutControlDAO) SpringInjectionUtil.getDao("checkoutControlDao");
        GoodsControlDAO goodsControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
        List<CheckoutEntity> list = dao.showAll(2);
        for (CheckoutEntity checkoutEntity : list) {
            System.out.println(checkoutEntity.getGoodsCount() * goodsControlDAO.getPriceById(checkoutEntity.getGoodsId()));
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

    @Test
    public void listTest() {
        List<String> list = new ArrayList<>();
        String s0 = "0";
        String s1 = "1";
        list.add(s0);
        list.add(s1);
        System.out.println(list.get(0));
    }
}
