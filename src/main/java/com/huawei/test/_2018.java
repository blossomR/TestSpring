package com.huawei.test;

import java.util.Scanner;

/**
 * 个立方体骰子平放在桌面上，有一面正对着读者，称为前面。我们将六个面分别称为左、右、前、后、上、下，每个面对应的数字分别为1、2、3、4、5、6。
 * 我们定义以下操作：向前滚动称为F，向后滚动称为B，向左滚动称为L，向右滚动称为R，上下面不变顺时针旋转称为C，上下面不变逆时针旋转称为U。
 * 在原始状态情况下，输入对应的操作码，输出最终的骰子状态（按照每个面的顺序左右前后上下）。
 */
public class _2018 {
    static int[] cube = {1, 2, 3, 4, 5, 6};

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String action = sc.next();
            switch (action) {
                case "F":
                    System.out.println(front(cube)[2]);
                    break;
                case "B":
                    System.out.println(back(cube)[2]);
                    break;
                case "L":
                    System.out.println(left(cube)[2]);
                    break;
                case "R":
                    System.out.println(right(cube)[2]);
                    break;
                case "C":
                    System.out.println(c(cube)[2]);
                    break;
                case "U":
                    System.out.println(u(cube)[2]);
                    break;
                default:
                    break;
            }

        }
    }

    public static int[] front(int[] arg) {
        int int3 = arg[2];
        int int4 = arg[3];
        int int5 = arg[4];
        int int6 = arg[5];
        arg[5] = int3;
        arg[2] = int5;
        arg[4] = int4;
        arg[3] = int6;
        return arg;
    }

    public static int[] back(int[] arg) {
        for (int i = 0; i < 3; i++) {
            arg = front(arg);
        }
        return arg;
    }

    public static int[] left(int[] arg) {
        int int5 = arg[4];
        int int6 = arg[5];
        int int1 = arg[0];
        int int2 = arg[1];

        arg[0] = int5;
        arg[1] = int6;
        arg[5] = int1;
        arg[4] = int2;
        return arg;
    }

    public static int[] right(int[] arg) {
        for (int i = 0; i < 3; i++) {
            arg = left(arg);
        }
        return arg;
    }

    public static int[] c(int[] arg) {
        int int1 = arg[0];
        int int2 = arg[1];
        int int3 = arg[2];
        int int4 = arg[3];

        arg[0] = int3;
        arg[1] = int4;
        arg[2] = int2;
        arg[3] = int1;
        return arg;
    }

    public static int[] u(int[] arg) {
        for (int i = 0; i < 3; i++) {
            arg = c(arg);
        }
        return arg;
    }



}
