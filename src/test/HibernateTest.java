package test;

import bmm.dao.CategorizationControlDAO;
import bmm.dao.UserControlDAO;
import bmm.utils.hibernate_util.SpringInjectionUtil;
import org.junit.jupiter.api.Test;

public class HibernateTest {
    @Test
    public void test() {
        CategorizationControlDAO categorizationControlDAO = (CategorizationControlDAO) SpringInjectionUtil.getDao("cateControlDao");
        String[] tags = new String[]{categorizationControlDAO.getCateNameById(1)};
        System.out.println(tags[0]);
    }
}
