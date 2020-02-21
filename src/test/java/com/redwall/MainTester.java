package com.redwall;

import java.util.HashSet;
import java.util.Set;

public class MainTester {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("3");
        set.add("4");
        set.add("a");
        set.add("2");
        set.add("b");

        //表示set无序
        set.forEach(e -> System.out.print(e+"   "));
    }

}
