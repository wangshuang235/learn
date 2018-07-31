package cn.ws.test.test_java8;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * @Author: cool
 * @Date: 2018/7/30 10:42
 */
public class TestJava8 {
    @Test
    public void test() {
        ArrayList<Bank> list = new ArrayList<>();
        Bank bank1 = new Bank(1, "ws1");
        Bank bank2 = new Bank(3, "ws3");
        Bank bank3 = new Bank(2, "ws2");
        list.add(bank1);
        list.add(bank2);
        list.add(bank3);
/*
        Map<String, Bank> map1 = list.stream()
                .sorted(Comparator.comparingInt(Bank::getCode))
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.toMap(Bank::getName, bank -> bank));
        Map<String, Bank> map2 = list.stream()
                .sorted(Comparator.comparingInt(Bank::getCode))
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.toConcurrentMap(bank -> bank.getName(), bank -> bank));*/

        List<Bank> list1 = list.stream().sorted(Comparator.comparing(Bank::getCode)).collect(Collectors.toList());
        Map<String, Bank> map = new LinkedHashMap<>();
        for (Bank bank : list1) {
            map.put(bank.getName(), bank);
        }
        System.out.println(map);
    }

    public boolean dodo(String s, Predicate<String> predicate) {
        return predicate.test(s);

    }
    @Test
    public void test2() {
        Predicate<String> predicate = (String s) -> !s.isEmpty();
        System.out.println(dodo("haha", predicate));
    }

    @Test
    public void test3() {
        String s = "hahah";
        Optional<String> ss =Optional.ofNullable(s);
        ss.ifPresent(sss -> System.out.println(sss));
        System.out.println(ss.isPresent());

       /* ArrayList<String> list = new ArrayList<>();
        list.add(s);
        Optional<List> list1 = Optional.of(list);*/
        //list1.isPresent(lis -> list1.get())
    }

        @Test
    public void test1() {

        //Runnable r1 = () -> System.out.println("Hello World 1");
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);
        Arrays.sort(players, comparator);

        //Arrays.sort(players, (String s1, String s2) -> s1.compareTo(s2));
    }

}

class Bank {
    public Bank(int code, String name) {
        this.code = code;
        this.name = name;
    }
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
