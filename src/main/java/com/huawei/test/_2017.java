package com.huawei.test;

import java.util.Scanner;

/**
 * .编写一个reverseadd函数，实现两个数倒置后再求和的功能，比如输入123，456就是求321+654，输出975。注意：输入100,200输出3,（自动去除开头的0）,超过范围输出-1
 */
public class _2017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = reverseadd(sc.nextInt(),sc.nextInt());
        System.out.println(result);
    }

    public static int reverseadd(int arg0, int arg1) {
        String str0 = new StringBuilder(arg0+"").reverse().toString();
        String str1 = new StringBuilder(arg1+"").reverse().toString();
        return Integer.parseInt(str0)+Integer.parseInt(str1);
    }

}
