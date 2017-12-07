package test;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import org.apache.struts2.ServletActionContext;
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
        System.out.println(dao.getGoodsCount() + 1);
    }

    @Test
    public void fileTest() {
        try {
            File file = new File("D:\\OneDrive\\Pictures\\相機相簿\\20170201_154407000_iOS.jpg");
//            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
//            String upLoadpath = ServletActionContext.getServletContext().getRealPath("images/upload");
            File toFile = new File("E:/", "20170201_154407000_iOS.jpg");
//            OutputStream outputStream = new FileOutputStream(toFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
            int len;
            while ((len = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(len);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
//            byte[] buffer = new byte[1048576];
//            int lenth = inputStream.read(buffer, 0, buffer.length);
//            while (-1 != lenth) {
//                outputStream.write(buffer);
//                outputStream.flush();
//            }
//            inputStream.close();
//            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
