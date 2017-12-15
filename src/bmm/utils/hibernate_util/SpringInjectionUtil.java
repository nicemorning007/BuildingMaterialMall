package bmm.utils.hibernate_util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring注入工具类，可提供Spring注入对象的直接获取和使用
 */
public class SpringInjectionUtil {

    public static Object getDao(String daoName) {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("spring-config.xml");
        Object dao = (Object) resource.getBean(daoName);
        return dao;
    }
}
