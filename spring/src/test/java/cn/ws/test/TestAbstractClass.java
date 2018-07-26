package cn.ws.test;

import org.junit.Test;

/*
 * @Author: cool
 * @Date: 2018/6/21 20:05
 */
public class TestAbstractClass {
    private static int x = 100;

    public static void main(String[] args) {
        TestAbstractClass a1 = new TestAbstractClass();
        a1.x++;
        TestAbstractClass a2 = new TestAbstractClass();
        a2.x++;
        a1 = new TestAbstractClass();
        a1.x++;
        TestAbstractClass.x--;
        System.out.println(x);
    }

    @Test
    public void test1() {
        String str1 = "H" + "ello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = str2;

        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//false
        System.out.println(str1 == str3);//true
        System.out.println(str2 == str4);//true
    }
}

abstract class TestAbstract {

    public void fun() {//普通方法
        System.out.println("存在方法体的方法");
    }

    public abstract void print();//抽象方法，没有方法体，有abstract关键字做修饰

}
abstract class b {

    public void fun() {//普通方法
        System.out.println("存在方法体的方法");
    }
}

abstract class c {

    private int a;
    public c(int a) {
        this.a = a;
    }

    public void fun() {
        System.out.println(a);
    }
}

abstract class d {
    public abstract void print();
}

