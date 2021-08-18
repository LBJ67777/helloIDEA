package com.water.java;

import com.water.modu.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {

    private static final int a = 1;
    public static final int v = 2;
    public static final int NUM = 10;

            
    private static final Customer cu = new Customer();
    @Override
    public String toString() {
        return super.toString();
    }

    public HelloWorld(int age) {
        this.age = age;
    }

    private int age;

    /*
    * 私有变量id
    */
    int id;
    /*
    * name
    */
    private String name;

    /*\

        111111

        */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        /*String[] s = new String[]{"a", "vab", "adadc"};
        for (int i = 0; i < s.length; i++){
            System.out.println("args = [" + args + "]");
//            System.out.println("i = " + i);
            System.out.println(s[i]);
        }*/
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        /*for (String s1 : s) {
            System.out.println(s1);
        }*/
        System.out.println("hello");

        System.out.println("helloworld!!");
        System.out.println("helloworld!!");
//        ArrayList list = new ArrayList();

        boolean flag = true;

        if (flag) {

        } else {

        }
        for (int i = 0; i < 10; i++) {

        }
    }


    public void method() {
        ArrayList arrayList = new ArrayList();
        if (arrayList == null) {
            System.out.println(1);
        }

    }
}
