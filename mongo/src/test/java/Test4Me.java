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
