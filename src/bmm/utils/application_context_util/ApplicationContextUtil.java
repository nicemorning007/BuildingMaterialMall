package bmm.utils.application_context_util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext工具类，自动加载xml配置文件，可提供ApplicationContext对象的直接获取
 */
public class ApplicationContextUtil {
    private static final String xmlPath;
    private static final ApplicationContext applicationContext;

    static {
        xmlPath = "spring-config.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    /**
     * 用于 ApplicationContext 对象的直接获取
     *
     * @return ApplicationContext 对象
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
