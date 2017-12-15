package test;

import bmm.utils.md5_util.Md5Util;
import org.junit.jupiter.api.Test;

/**
 * MD5加密测试方法
 */
public class TestMd5 {
    @Test
    public void md5(){
        System.out.println(Md5Util.md5Encode("123456"));
    }

}
