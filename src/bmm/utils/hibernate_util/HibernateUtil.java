package bmm.utils.hibernate_util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Map;

/**
 * Hibernate工具类，提供Session的直接获取
 */
public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * 用于SessionFactory.openSession()方法的直接获取
     *
     * @return session对象
     * @throws HibernateException 如果 SessionFactory 对象创建失败会抛出该异常
     */
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    /**
     * 用于关闭Session对象
     */
    public static void closeSession() {
        ourSessionFactory.close();
    }

}
