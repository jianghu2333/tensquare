package com.tensquare.article.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: jiangyong
 * @date: 2018/12/26 15:22
 * @version:
 * @Copyright:
 * @modifier:
 */
public class aaa {
    private static boolean operate;
    public static String bytesToString(byte[] b) {
        StringBuffer result = new StringBuffer("");
        int length = b.length;
        for (int i=0; i<length; i++) {
            String s = b[i] + "";
        }
        return result.toString();
    }

    public static void main(String[] args) throws ParseException {
//        byte[] b = {1, 2, 3, 4};
//        System.out.println("b.length= " + b.length);
//        String str = bytesToString(b);
//        System.out.println("str= " + str);
//
//        System.out.println("Hello World!");
            Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        Date parse = formatter.parse(dateString);
        System.out.println(parse);
        int a= (int) 100.02;
        System.out.println(a);
        System.out.println(operate);
        String str = " ";
        System.out.println(str.length());
    }
    }
