package com.my.exam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;

@SpringBootTest
class DemoApplicationTests {

    // 값 비교 test StringBuffer = 멀티스레드 환경
    @Test
    void contextLoads() {
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        a.append("sda");
        b.append("sda");
        if (a.hashCode() == b.hashCode()) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }

    }

    @Test
    void myArrayTest() {
        int[] arr1 = new int[5];
        arr1 = new int[]{1, 2, 3, 4, 5};
        String[] arr2 = {"a", "b", "c", "d"};
        Arrays.sort(arr2);
        Arrays.sort(arr2, Collections.reverseOrder());
        Arrays.sort(arr1, 1, 2);
        //	StringBuffer[] arr3 = new StringBuffer[5];
        //	StringBuilder[] arr4 = new StringBuilder[5];

/*
arr에 StringBuilder, Buffer 담기 불가능 이유는 영속성이없어 메모리값을 arr에 저장하는 것은 가능하지만 arr값 안에 메모리 안에 값을 append하기가 힘듦.
오류메시지 :: arr3, arr4에는 읽기만 가능하고 쓰기가 불가능하다.
굳이 하겠다? 굳이 나중에 toString 할거면 하지 않는게 낫다 StringBuilder로 String 만든 이후
StringBuilder a = new StringBuilder();
a.append("어쩌고");
String[] arr = {a.toString, - - }
하면된다.
*/

//	arr3[0].append("a");
//	arr4[0].append("a");
//	System.out.println(Arrays.toString(Arrays.toString(arr3).toCharArray()));
//	System.out.println(Arrays.toString(arr3));
//	System.out.println(Arrays.toString(Arrays.stream(arr4).toArray()));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}
