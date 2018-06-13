package cn.ws.test;

import cn.ws.config.CDConfig;
import cn.ws.entites.Disc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class TestJavaConfig {
    @Autowired
    private Disc cd;

    @Test
    public void cdNotNull() {
        assertNotNull(cd);
    }

    @Test
    public void testDi() {
        assertEquals("success", cd.save());
    }
}
