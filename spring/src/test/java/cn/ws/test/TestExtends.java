package cn.ws.test;

import org.junit.Test;

public class TestExtends {
    @Test
    public void name() {
        bilaoye b = new bilaoshi();
        b.diaoyu();
        b.show();
        bilaoshi laoshi = (bilaoshi) b;
        laoshi.kandianying();

    }
}

class bilaoye {
    void show() {
        System.out.println("企业管理");
    }

    void diaoyu() {
        System.out.println("钓鱼");
    }
}

class bilaoshi extends bilaoye {

    @Override
    void show() {
        System.out.println("java");
    }
    void kandianying() {
        System.out.println("看电影");
    }
}
