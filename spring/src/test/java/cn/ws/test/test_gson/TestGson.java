package cn.ws.test.test_gson;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.HashMap;

/*
 * @Author: cool
 * @Date: 2018/8/8 17:17
 */
public class TestGson {
    private final Gson gson = new Gson();

    @Test
    public void test1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "ws");
        map.put("age", "26");
        map.put("sex", "man");
        String json = gson.toJson(map);
        System.out.println(json);
    }

}
