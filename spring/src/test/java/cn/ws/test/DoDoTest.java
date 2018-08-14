package cn.ws.test;

import org.junit.Test;

/**
 * @Author: cool
 * @Date: 2018/7/24 14:43
 */
public class DoDoTest {
    @Test
    public void test() {
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.length());
        System.out.println(buffer.toString().equals(""));
        buffer.append("1");
        buffer.append("2");
        buffer.append("3");
        System.out.println(buffer.length());
    }
}
