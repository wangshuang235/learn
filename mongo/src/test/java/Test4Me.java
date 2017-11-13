import org.junit.Test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
        /*ArrayList<String> list = new ArrayList();
        list.add("wangshuang");
        System.out.println(list.size());
        System.out.println(list.get(0));*/

    }
}
