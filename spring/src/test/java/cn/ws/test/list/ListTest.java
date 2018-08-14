package cn.ws.test.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: cool
 * @Date: 2018/8/14 15:12
 */
public class ListTest {

    /**
     * 1，两个list加入同样元素，当一个list对元素操作时，另一个也会变化。
     * 2，list迭代器中删除元素对元素本身不影响，对另一个list也不影响。
     */
    @Test
    public void test1() {
        Person person1 = new Person("person1",11);
        Person person2 = new Person("person2",12);
        Person person3 = new Person("person3",13);
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);

        ArrayList<Person> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.remove(1);
        /*Person person = list2.get(1);
        person.setAge(100);*/
        show(list2);

        ArrayList<Person> list3 = new ArrayList<>();
        list3.addAll(list);
        show(list3);
    }

    private void show(List<Person> list) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
