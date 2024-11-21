package com.my.exam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringBufferTests {

    @Test
    void StringBufferTest() {
        StringBuffer a = new StringBuffer("Hello");
        StringBuffer b = new StringBuffer("World");
        a.append(" sda");
        b.append("\nsda");
        if (a.hashCode() == b.hashCode()) {
            System.out.println("ok");
            System.out.println(a);
        } else {
            System.out.println("not ok");
            System.out.println(a);
            System.out.println(b);
        }
    }



}
