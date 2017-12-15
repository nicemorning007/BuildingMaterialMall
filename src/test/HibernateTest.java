package test;

import bmm.dao.*;
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
        MessageControlDao messageControlDao = (MessageControlDao) SpringInjectionUtil.getDao("messageControlDao");
        messageControlDao.chageState(1);
    }
}
