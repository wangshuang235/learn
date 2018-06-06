package cn.ws.spring_aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: cool
 * @Date: 2018/6/4 17:59
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        CompactDisc cd = new CompactDisc();
        cd.setTitle("myTitle");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("11111111111111111111111");
        tracks.add("22222222222222222222222");
        tracks.add("333333333333333333333333");
        tracks.add("4444444444444444444444");
        tracks.add("5555555555555555555555");
        tracks.add("66666666666666666666666666");
        tracks.add("777777777777777");
        tracks.add("8888888888888888888888888");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
