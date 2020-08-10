package com.boya.test1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(run("这是啊啊啊呀"));
        System.out.println(run("叽叽汪汪汪喵喵喵喵喳喳"));
    }
    private static List<List<Integer>> run(String input) {
        List<List<Integer>> dc = new ArrayList<List<Integer>>();

        if (input.length() < 3) {//小于3个字符
            return null;
        } else {
            for (int i = 1; i < input.length() - 1; ) {
                if (input.charAt(i) == input.charAt(i - 1) && input.charAt(i) == input.charAt(i + 1)) {//如果前后3个连续相同才操作list
                    int st = i - 1;
                    int end = 0;
                    //while用于超过3个连续相同计算末位置
                    while (i < input.length() - 1 && input.charAt(i) == input.charAt(i - 1) && input.charAt(i) == input.charAt(i + 1)) {
                        end = i + 1;
                        i++;
                    }
                    List<Integer> r = new ArrayList<Integer>();//生成始末位置
                    r.add(st);
                    r.add(end);

                    dc.add(r);//大串始末位置加入List
                    i++;//没有超过连续3个以上相同
                } else {
                    i++;//没有超过连续2个以上相同}
                }
            }
            return dc;
        }
    }}
