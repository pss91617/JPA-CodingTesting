package com.my.exam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringMethodTest {

    // String.java 기본 메소드
    @Test
    void stringMethodTest1() {
        String a = "l";
        String b = "Hello";
        String c = "World";
        String d = b+" "+c;

        String[] aArray = d.split(" ");
        System.out.println(aArray[0]);

        a = b.toUpperCase();
        a = a.toLowerCase();
        //hello > ello
        a = a.substring(1);
        //el + llo
        a = a.substring(0, 2)+ a.substring(1);
        System.out.println(a);


    }
}
