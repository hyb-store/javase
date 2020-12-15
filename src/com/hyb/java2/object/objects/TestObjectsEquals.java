package com.hyb.java2.object.objects;
/*
Objects类
equals()方法
比较两个对象是否相同,但是加了- -些健壮性的判断!

 */
import java.util.Objects;

public class TestObjectsEquals {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
      //  System.out.println(s1.equals(s2));  // NullPointerException
        boolean result = Objects.equals(s1,s2);
        System.out.println(result);    //false

    }
}
