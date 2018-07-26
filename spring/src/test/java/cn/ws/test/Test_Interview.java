package cn.ws.test;

import org.junit.Test;

/*
 * @Author: cool
 * @Date: 2018/6/29 21:29
 */
public class Test_Interview {

    //爱因斯坦台阶问题优化后
    @Test
    public void test() {
        int conut = 1;
        int i = 7;
        while (true) {
            if (i % 2 == 1 && i % 3 == 2 && i % 4 == 3 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0) {
                break;
            }
            i = i + 7;
            System.out.println(conut++);
        }
        System.out.println(i);
    }

    @Test
    public void test1() {
        int conut = 1;
        int i = 3;
        while (true) {
            if (i % 2 == 1 && i % 3 == 2 && i % 4 == 3 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0) {
                break;
            }
            i++;
            System.out.println(conut++);
        }
        System.out.println(i);
    }

    @Test
    public void test2() {
        int sum = 0;
        for (int i = 1; i < 100; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    @Test
    public void test3() {
        boolean isprime = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i/2; j++ ) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
            isprime = true;
        }
    }
}
