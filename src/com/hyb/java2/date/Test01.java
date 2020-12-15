package com.hyb.java2.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {

        //空参构造方法
        Date d = new Date(3000L);
        System. out. println(d.toLocaleString()); // 1970-1-1 8:00:03

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String format = sdf.format(d);
        System. out. println(format); // 1970年01月01日08:00:03

        String str ="2088年08月08日08:08:08";
        Date parse = sdf.parse(str);
        System.out.println(parse);
    }
}

