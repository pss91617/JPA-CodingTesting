package com.my.exam.demo.structure;

import com.my.exam.demo.dao.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.apache.coyote.http11.Constants.a;

@SpringBootTest
class ArrayTest {

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
a.append("");
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

        // arr는 이미 Arrays()를 오버라이딩 하므로 배열의 크기 length
        System.out.println(arr2.length);
        //String은 length()메소드를 참조 문자열의 길이 length()
        System.out.println(arr2[0].length());
        // ++ ArrayList.size() 기본 저장용량 10 초과시 1.5배할당, 인덱스 용이
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(3);
        //integer는 null가능한 자료형
        list.add(1 ,null);
        list.add(1 ,6);
        list2.add(4);
        list2.add(2);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator :: "+iterator.next()+" ");
        }

        System.out.println(list.size());
        System.out.println(list.get(2));
        list.addAll(2, list2);
        System.out.println(list);
        int i = list.get(1);
        int i2 = i + 2;
        System.out.println(i2);
//        NullPointerException (Integer null + int)
//        System.out.println(i+list.get(4));

        //LinkedList 인접 링크 참조 추가 빈번한 제거 용이, 값이 아닌 노드를 가진다.
        LinkedList<Integer> lList1 = new LinkedList<>();
        lList1.add(3);
        lList1.add(1);
        lList1.add(2);
        lList1.add(3);
        lList1.set(1, 2);
        System.out.println(lList1.size());
        lList1.clear();


        Vector<Object> v1 = new Vector<>();
        v1.add(new User());

    }

}
