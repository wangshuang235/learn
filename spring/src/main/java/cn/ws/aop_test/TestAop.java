package cn.ws.aop_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @Author: cool
 * @Date: 2018/7/26 14:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config_Aop.class)
public class TestAop {

    @Autowired
    private HttpUtil httpUtil;

    @Test
    public void test1() {
        httpUtil.test();
    }
}
