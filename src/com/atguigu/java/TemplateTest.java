package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author wangsen
 * @create 2018-08-28 15:23
 */
public class TemplateTest {

    // 模板6 prsf 可生成 private static final 静态常量
    private static final Customer cust = new Customer();

    // 变形 psf
    public static final int NUM = 1;
    // 变形 psfi
    public static final int NUM2 = 2;

    // 变形 psfs
    public static final String NATION = "CHINA";



    // 模板1：psvm
    public static void main(String[] args) {

        // 模板2：sout / soutp/ soutm/ soutv/ xxx.sout
        System.out.println("hello !");

        System.out.println("args = [" + args + "]");

        System.out.println("TemplateTest.main");

        int num = 0;

        System.out.println("num = " + num);

        System.out.println(num);

        // 模板3 ： fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        // 变形 iter 增强 for 循环
        for (String s : arr) {
            System.out.println(s);
        }

        // 变形 itar 普通 for 循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        // 模板4: list.for
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (Object o : list) {
            System.out.println(o);
        }
        
        // 变形 list.fori - 普通的 for 循环
        for (int i = 0; i < list.size(); i++) {
            
        }

        // 变形 list.forr - 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        // 模板5 ifn
        ArrayList<String> strings = new ArrayList<>();

        if (strings == null) {

        }

        // 变形 inn -> if not null
        if (strings != null) {

        }

        // 变形 xxx.nn / xxx.null
        if (strings == null) {

        }

        if (strings != null) {

        }
    }
}
