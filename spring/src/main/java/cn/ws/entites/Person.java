package cn.ws.entites;

import org.springframework.stereotype.Component;

/**
 * Created by ShuangWang on 2017/7/11.
 */
@Component
public class Person {
    private int pId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}