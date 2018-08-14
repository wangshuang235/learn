package cn.ws.test.innerClass;

/*
 * @Author: cool
 * @Date: 2018/7/19 11:19
 */
public class TestInnerClass2 {

    public static void main(String[] args) {
        String s = "正在充电";

        Dianche dianche = new Dianche();
        dianche.run(new Dianchi() {
            @Override
            public String chongchongdian(Chongdianqi chongdianqi) {
                return chongdianqi.chongdian(s);
            }
        });
    }
}

class Dianche {
    void run(Dianchi dianchi) {
        String s = dianchi.chongchongdian(new Chongdianqiqi());
        System.out.println(s);
    }
}

interface Dianchi {
    String chongchongdian(Chongdianqi chongdianqi);
}

interface Chongdianqi {
    String chongdian(String s);
}

class Chongdianqiqi implements Chongdianqi{

    @Override
    public String chongdian(String s) {
        System.out.println("充电了");
        return s;
    }
}

