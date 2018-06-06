package cn.ws.test;

import org.springframework.stereotype.Component;

@Component
public class SgtDisc implements Disc{
    @Override
    public void play() {
        System.out.println("hello");
    }
}
