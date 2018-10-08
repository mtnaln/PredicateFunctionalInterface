package com.metin.built.in.functional.interfac;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestPredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<Integer> result = x -> x > 10;
        System.out.println("5 > 10 ==> " + result.test(5));
        System.out.println("15 > 10 ==> " + result.test(15));

        System.out.println("--------------");

        IntPredicate resultIntPredicate = x -> x > 10;
        System.out.println("5 > 10 ==> " + resultIntPredicate.test(5));
        System.out.println("15 > 10 ==> " + resultIntPredicate.test(15));

        System.out.println("--------------");
        // Stream<T> filter(Predicate<? super T> predicate);

        Integer[] list = new Integer[]{5, 7, 11, 10, 17, 25};
        Arrays.stream(list).filter(x -> x > 10).forEach(System.out::println);

        System.out.println("--------------");

        Predicate<Integer> greaterThan10 = x -> x < 10;
        Stream<Integer> integerList = Arrays.stream(list).filter(greaterThan10);
        integerList.forEach(System.out::println);

        System.out.println("--------------");

        String[] nameList = new String[]{"Ahmet", "Mehmet", "Cemal", "Yusuf", "Metin", "Dilek", "Ahmet"};
        Arrays.stream(nameList).filter(x -> x.startsWith("M")).forEach(System.out::println);
    }
}
