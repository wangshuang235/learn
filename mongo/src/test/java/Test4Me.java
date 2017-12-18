import collection.test.BinarySearchTree;
import collection.test.MyArrayList;
import collection.test.MyLinkedList;
import collection.test.MySinglyLinkedList;
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
        Iterator<String> iterator = list.iterator();
        System.out.println("------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test5() {
        LinkedList<String> list = new LinkedList();
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

    @Test
    public void test6() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("wang", "cool");
    }

    @Test
    public void test7() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<String>();
        list.push("cool1");
        list.push("cool2");
        list.push("cool3");
        list.push("cool4");
        list.push("cool5");
        while (list.size() > 0) {
            System.out.println(list.pop());
        }
    }

    @Test
    public void test8() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.printTree();
    }
}
