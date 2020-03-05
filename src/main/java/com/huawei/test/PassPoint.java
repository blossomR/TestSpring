package com.huawei.test;

import java.util.*;

public class PassPoint {

    /**
     * 描述：10个学生考完期末考试评卷完成后，A老师需要划出及格线，要求如下：
     * (1) 及格线是10的倍数；
     * (2) 保证至少有60%的学生及格；
     * (3) 如果所有的学生都高于60分，则及格线为60分
     * 输入：输入10个整数，取值0~100
     * 输出：输出及格线，10的倍数
     * 输入样例：61 51 49 30 20 10 70 80 90 99
     * 输出样例：50
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrys = str.split(" ");
        List<Integer> list = new ArrayList<>();
        int count = arrys.length;
        int maxUnpassIndex = (int) ((count*0.4)/1)-1;

        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(arrys[i]));
        }
        //升序排序
        Collections.sort(list);

        if(list.get(0)>=60){
            System.out.println(60);
            return;
        }

        if(list.get(maxUnpassIndex)<60){
            System.out.println(("最高分数线: "+(list.get(maxUnpassIndex+1)-list.get(maxUnpassIndex+1)%10)));
            System.out.println(("最低分数线: "+(list.get(maxUnpassIndex)-list.get(maxUnpassIndex)%10+10)));
            return;
        }else{
            System.out.println("60");
        }

    }

    public static int unpassCount(int count) {
        int i = 0;
        while (i <= count * 0.4) {
            i++;
        }
        return i;
    }
}
