package com.atguigu.java;

import java.util.HashMap;

/**
 * @author wangsen
 * @create 2018-08-28 20:23
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "tom");
        map.put("age", "12");
        map.put("school", "Tsinghua");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println("map = " + map);

    }

}
