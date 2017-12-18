package collection.test;

import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionTest{

    ConferenceReservationDate reservation = new ConferenceReservationDate(null, null);

    @Before
    public void b() {
        reservation.setT08A("1");
        reservation.setT08B("2");
        reservation.setT22B("22B");
        reservation.setT12B("222");
        reservation.setT13A("111");
    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (String methodName : getMethodNames("set")) {
            Method method = reservation.getClass().getMethod(methodName, String.class);
            method.invoke(reservation,"1");
        }
    }

    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        for (String methodName : getMethodNames("get")) {
            Method method = reservation.getClass().getMethod(methodName);
            String value = (String)method.invoke(reservation);
            if(value != null){
                int model = getModel(methodName);
                System.out.println("value:"+model);
            }
        }
    }

    /**
     * 获取方法名列表
     * @param front 方法名前缀 get 或者 set
     * @return
     */
    private List<String> getMethodNames(String front) {
        ArrayList<String> list = new ArrayList();
        for (int i = 8; i < 23; i++) {
            String mid;
            if (i < 10) {
                mid = "0" + i;
            } else {
                mid = "" + i;
            }

            for (int j = 0; j < 2; j++) {
                String tail;
                if (j == 0) {
                    tail = "A";
                } else {
                    tail = "B";
                }
                list.add(front + "T" + mid + tail);
            }
        }
        return list;
    }

    /**
     * 传入一个数字，解析成一个方法名，
     * 例如：model = 17， front = "get" ,return "getT08B",
     *      model = 17， front = null ,return "t08B"
     * @param model
     * @param front 方法名前缀 get 或者 set
     * @return
     */

    private String getMethodName(int model, String front) {
        int hour = model / 2;
        int min = model % 2;
        String mid;
        if (hour < 10) {
            mid = "0" + hour;
        } else {
            mid = "" + hour;
        }
        String tail;
        if (min == 0) {
            tail = "A";
        } else {
            tail = "B";
        }
        if (front == null) {
            return "t"+mid + tail;
        }
        return front + "T" + mid + tail;
    }
    @Test
    public void test_1() {
        String name = getMethodName(17, null);

        System.out.println(name);


    }

    private int getModel(String name) {
        int a = Integer.parseInt(String.valueOf(name.charAt(4)));
        int b = Integer.parseInt(String.valueOf(name.charAt(5)));
        char c = name.charAt(6);
        int d = (a * 10 + b) * 2;
        if (c == 'B') {
            d++;
        }
        return d;
    }

    @Test
    public void getMethodName() {

        String name = "setT08B";
        int a = Integer.parseInt(String.valueOf(name.charAt(4)));
        int b = Integer.parseInt(String.valueOf(name.charAt(5)));
        char c = name.charAt(6);
        int d = (a * 10 + b) * 2;
        if (c == 'B') {
            d++;
        }
        System.out.println(d);


    }

    @Test
    public void test_2() {
        ArrayList<Integer> list1 = new ArrayList();
        for (int i = 1; i < 5; i++) {
            list1.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList();
        for (int i = 2; i < 6; i++) {
            list2.add(i);
        }
        show(list1);
        show(list2);
        boolean b = list1.removeAll(list2);
        System.out.println(b);
        show(list1);

    }

    private void show(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

class ConferenceReservationDate {
    private String id;

    private String conferenceRoomId;

    private Date reserveDate;

    private long version;

    private String t08A;

    private String t08B;

    private String t09A;

    private String t09B;

    private String t10A;

    private String t10B;

    private String t11A;

    private String t11B;

    private String t12A;

    private String t12B;

    private String t13A;

    private String t13B;

    private String t14A;

    private String t14B;

    private String t15A;

    private String t15B;

    private String t16A;

    private String t16B;

    private String t17A;

    private String t17B;

    private String t18A;

    private String t18B;

    private String t19A;

    private String t19B;

    private String t20A;

    private String t20B;

    private String t21A;

    private String t21B;

    private String t22A;

    private String t22B;

    public ConferenceReservationDate(String id, String conferenceRoomId){
        this.id = id;
        this.conferenceRoomId = conferenceRoomId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConferenceRoomId() {
        return conferenceRoomId;
    }

    public void setConferenceRoomId(String conferenceRoomId) {
        this.conferenceRoomId = conferenceRoomId;
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getT08A() {
        return t08A;
    }

    public void setT08A(String t08A) {
        this.t08A = t08A;
    }

    public String getT08B() {
        return t08B;
    }

    public void setT08B(String t08B) {
        this.t08B = t08B;
    }

    public String getT09A() {
        return t09A;
    }

    public void setT09A(String t09A) {
        this.t09A = t09A;
    }

    public String getT09B() {
        return t09B;
    }

    public void setT09B(String t09B) {
        this.t09B = t09B;
    }

    public String getT10A() {
        return t10A;
    }

    public void setT10A(String t10A) {
        this.t10A = t10A;
    }

    public String getT10B() {
        return t10B;
    }

    public void setT10B(String t10B) {
        this.t10B = t10B;
    }

    public String getT11A() {
        return t11A;
    }

    public void setT11A(String t11A) {
        this.t11A = t11A;
    }

    public String getT11B() {
        return t11B;
    }

    public void setT11B(String t11B) {
        this.t11B = t11B;
    }

    public String getT12A() {
        return t12A;
    }

    public void setT12A(String t12A) {
        this.t12A = t12A;
    }

    public String getT12B() {
        return t12B;
    }

    public void setT12B(String t12B) {
        this.t12B = t12B;
    }

    public String getT13A() {
        return t13A;
    }

    public void setT13A(String t13A) {
        this.t13A = t13A;
    }

    public String getT13B() {
        return t13B;
    }

    public void setT13B(String t13B) {
        this.t13B = t13B;
    }

    public String getT14A() {
        return t14A;
    }

    public void setT14A(String t14A) {
        this.t14A = t14A;
    }

    public String getT14B() {
        return t14B;
    }

    public void setT14B(String t14B) {
        this.t14B = t14B;
    }

    public String getT15A() {
        return t15A;
    }

    public void setT15A(String t15A) {
        this.t15A = t15A;
    }

    public String getT15B() {
        return t15B;
    }

    public void setT15B(String t15B) {
        this.t15B = t15B;
    }

    public String getT16A() {
        return t16A;
    }

    public void setT16A(String t16A) {
        this.t16A = t16A;
    }

    public String getT16B() {
        return t16B;
    }

    public void setT16B(String t16B) {
        this.t16B = t16B;
    }

    public String getT17A() {
        return t17A;
    }

    public void setT17A(String t17A) {
        this.t17A = t17A;
    }

    public String getT17B() {
        return t17B;
    }

    public void setT17B(String t17B) {
        this.t17B = t17B;
    }

    public String getT18A() {
        return t18A;
    }

    public void setT18A(String t18A) {
        this.t18A = t18A;
    }

    public String getT18B() {
        return t18B;
    }

    public void setT18B(String t18B) {
        this.t18B = t18B;
    }

    public String getT19A() {
        return t19A;
    }

    public void setT19A(String t19A) {
        this.t19A = t19A;
    }

    public String getT19B() {
        return t19B;
    }

    public void setT19B(String t19B) {
        this.t19B = t19B;
    }

    public String getT20A() {
        return t20A;
    }

    public void setT20A(String t20A) {
        this.t20A = t20A;
    }

    public String getT20B() {
        return t20B;
    }

    public void setT20B(String t20B) {
        this.t20B = t20B;
    }

    public String getT21A() {
        return t21A;
    }

    public void setT21A(String t21A) {
        this.t21A = t21A;
    }

    public String getT21B() {
        return t21B;
    }

    public void setT21B(String t21B) {
        this.t21B = t21B;
    }

    public String getT22A() {
        return t22A;
    }

    public void setT22A(String t22A) {
        this.t22A = t22A;
    }

    public String getT22B() {
        return t22B;
    }

    public void setT22B(String t22B) {
        this.t22B = t22B;
    }
}