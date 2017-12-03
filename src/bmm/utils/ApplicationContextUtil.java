package bmm.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
    private static final String xmlPath;
    private static final ApplicationContext applicationContext;

    static {
        xmlPath = "spring-config.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    public  static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
