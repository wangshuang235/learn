package cn.ws.test.spring_aop;

import cn.ws.spring_aop.CompactDisc;
import cn.ws.spring_aop.TrackCounter;
import cn.ws.spring_aop.TrackCounterConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @Author: cool
 * @Date: 2018/6/4 18:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
/*    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();*/

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(5);

        Assert.assertEquals(3, counter.getPlayCount(1));
        Assert.assertEquals(4, counter.getPlayCount(3));
        Assert.assertEquals(1, counter.getPlayCount(5));
    }
}
