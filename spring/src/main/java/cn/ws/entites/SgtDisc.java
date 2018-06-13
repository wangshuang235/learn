package cn.ws.entites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SgtDisc implements Disc{

    @Autowired
    private DiscDao discDao;

    @Override
    public void play() {
        System.out.println("hello");
    }

    @Override
    public String save() {
        return discDao.save();
    }
}
