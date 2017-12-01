import org.junit.Test;

import java.text.DateFormat;
import java.util.*;

public class Test4Me {
    @Test
    public void test() {
        Date date = new Date();
        System.out.println(date);

        DateFormat format = DateFormat.getInstance();
        String s = format.format(date);
        System.out.println(s);

        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        System.out.println(calendar.getTime());

    }

    @Test
    public void test1() {
        MyArrayList<String> list = new MyArrayList();
        list.add("wangshuang");
        list.add("wangshuang");
        list.add("wangshuang");
        System.out.println(list.size());
        list.set(0, "cool");
        list.add(0,"w");
        System.out.println(list.size());
        System.out.println("-----------Start-----------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------End-----------");

        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }

    @Test
    public void test3() {
        ArrayList<String> list = new ArrayList();
        list.add("wangshuang");
        list.add("wangshuang");
        list.add("wangshuang");
        System.out.println(list.size());
        System.out.println(list.get(0));

    }

    @Test
    public void test4() {
        MyLinkedList<String> list = new MyLinkedList();
        list.add("wangshuang1");
        list.add("wangshuang2");
        list.add("wangshuang3");
        System.out.println(list.size());
        System.out.println(list.get(0));

    }

    @Test
    public void test5() {
        LinkedList<String> list = new LinkedList();
        list.add("wangshuang");
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.get(0));

    }

    @Test
    public void test2() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i < 400000; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list.size());
    }
}
