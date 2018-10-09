package cn.ws.test.string;


import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @Author: cool
 * @Date: 2018/8/15 8:53
 */
public class StringTest {

    @Test
    public void test1() {
        String s = "wang_shuAng_cool";

        //大小写
        System.out.println(s.toUpperCase()); //WANG_SHUANG_COOL
        System.out.println(s.toLowerCase()); //wang_shuang_cool
        System.out.println(s); //wang_shuAng_cool

        //分割字符串
        String[] split = s.split("_");
        for (String s1 : split) {
            System.out.println(s1); //wang
                                    //shuAng
                                    //cool
        }

        //替换字符
        String replace = s.replace('_', 'w');
        System.out.println(replace); //wangwshuAngwcool

        //替换字符串
        String replace1 = s.replaceAll("_", "_W-W_");
        System.out.println(replace1); //wang_W-W_shuAng_W-W_cool

        /**
         * 截取字符串
         * "unhappy".substring(2) returns "happy"
         */
        System.out.println(s.substring(1)); //ang_shuAng_cool
        System.out.println(s.substring(1, 2)); //a

        //去掉空格
        String s1 = "     wang_shuAng_cool        ";
        System.out.println(s1); //     wang_shuAng_cool
        System.out.println(s1.trim()); //wang_shuAng_cool
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        String s = "res=%7B%22explain%22%3A%5B%7B%22id%22%3A%2247%22%2C%22content%22%3A%22%E5%AF%B9%E9%BC%BB%E7%82%8E%E3%80%81%E9%BC%BB%E7%AA%A6%E7%82%8E%E3%80%81%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%E5%8F%8A%E5%85%B6%E5%B9%B6%E5%8F%91%E7%97%87%E7%9A%84%E6%B2%BB%E7%96%97%EF%BC%8C%E4%B8%8D%E6%89%BF%E6%8B%85%E8%B5%94%E4%BB%98%E8%B4%A3%E4%BB%BB%22%7D%5D%2C%22hb_res%22%3A%221%22%2C%22billing_factor%22%3A1%2C%22quotations%22%3A%5B%7B%22fields_name%22%3A%22bybzgpq%22%2C%22value_name%22%3A%22%E9%BC%BB%E7%82%8E%E3%80%81%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%22%2C%22value_content%22%3A%5B%7B%22value_id%22%3A%22554%22%2C%22value_name%22%3A%22%E6%98%AF%E5%90%A6%E6%82%A3%E6%9C%89%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%EF%BC%9F%22%2C%22value_content%22%3A%22%E5%90%A6%22%7D%5D%7D%5D%2C%22hb_res_text%22%3A%22%E6%84%9F%E8%B0%A2%E6%82%A8%E6%8F%90%E4%BE%9B%E7%9A%84%E5%81%A5%E5%BA%B7%E4%BF%A1%E6%81%AF%EF%BC%8C%E6%81%AD%E5%96%9C%E6%82%A8%E5%8F%AF%E4%BB%A5%E6%AD%A3%E5%B8%B8%E6%8A%95%E4%BF%9D%E6%9C%AC%E4%BA%A7%E5%93%81%E3%80%82%22%2C%22serial_remaining_count%22%3A2%2C%22explain_ids%22%3A%5B%2247%22%5D%2C%22serial_number%22%3A%221537856675879%22%7D&channel_id=e_TsjokG2AB&confirm=1";
        String[] split = s.split("&");
        for (String s1 : split) {
            if (s1.contains("res=")) {
                s1 = URLDecoder.decode(s1,"UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(s1.replaceAll("res=", ""));
                System.out.println(s1.replaceAll("res=", ""));
            }
            else if (s1.contains("channel_id=")) {
                System.out.println(s1.replaceAll("channel_id=", ""));
            }
            else if (s1.contains("confirm=")) {
                System.out.println(s1.replaceAll("confirm=", ""));
            }
        }
    }
    @Test
    public void test3() {
        String s = "res=%7B%22explain%22%3A%5B%7B%22id%22%3A%2247%22%2C%22content%22%3A%22%E5%AF%B9%E9%BC%BB%E7%82%8E%E3%80%81%E9%BC%BB%E7%AA%A6%E7%82%8E%E3%80%81%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%E5%8F%8A%E5%85%B6%E5%B9%B6%E5%8F%91%E7%97%87%E7%9A%84%E6%B2%BB%E7%96%97%EF%BC%8C%E4%B8%8D%E6%89%BF%E6%8B%85%E8%B5%94%E4%BB%98%E8%B4%A3%E4%BB%BB%22%7D%5D%2C%22hb_res%22%3A%221%22%2C%22billing_factor%22%3A1%2C%22quotations%22%3A%5B%7B%22fields_name%22%3A%22bybzgpq%22%2C%22value_name%22%3A%22%E9%BC%BB%E7%82%8E%E3%80%81%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%22%2C%22value_content%22%3A%5B%7B%22value_id%22%3A%22554%22%2C%22value_name%22%3A%22%E6%98%AF%E5%90%A6%E6%82%A3%E6%9C%89%E9%BC%BB%E4%B8%AD%E9%9A%94%E5%81%8F%E6%9B%B2%EF%BC%9F%22%2C%22value_content%22%3A%22%E5%90%A6%22%7D%5D%7D%5D%2C%22hb_res_text%22%3A%22%E6%84%9F%E8%B0%A2%E6%82%A8%E6%8F%90%E4%BE%9B%E7%9A%84%E5%81%A5%E5%BA%B7%E4%BF%A1%E6%81%AF%EF%BC%8C%E6%81%AD%E5%96%9C%E6%82%A8%E5%8F%AF%E4%BB%A5%E6%AD%A3%E5%B8%B8%E6%8A%95%E4%BF%9D%E6%9C%AC%E4%BA%A7%E5%93%81%E3%80%82%22%2C%22serial_remaining_count%22%3A2%2C%22explain_ids%22%3A%5B%2247%22%5D%2C%22serial_number%22%3A%221537856675879%22%7D&channel_id=e_TsjokG2AB&confirm=1";
        String[] split = s.split("&");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
