package com.redwall;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class MainTester {
    private static final  BigDecimal ONE_THO = new BigDecimal(1000);
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("1");
//        set.add("3");
//        set.add("4");
//        set.add("a");
//        set.add("2");
//        set.add("b");
//
//        //表示set无序
//        set.forEach(e -> System.out.print(e+"   "));
//
//        String abc = "abc";
//        abc = abc.replace("b","d");
//        System.out.println(abc);

        System.out.println(LocalTime.now());

        System.out.println((System.currentTimeMillis() ));


            String s = new BigDecimal(System.currentTimeMillis()).divide(ONE_THO,3,BigDecimal.ROUND_UNNECESSARY).toString();
            System.out.println(s);
    }

}
