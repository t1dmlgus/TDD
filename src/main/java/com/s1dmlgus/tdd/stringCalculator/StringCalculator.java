package com.s1dmlgus.tdd.stringCalculator;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 리펙토링
 * 
 * 1. indent를 줄여라
 * 2. else 를 쓰지마라
 * 3. 메소드에 한가지 일만 하도록 하여라
 * 
 * 
 */


// 프로덕션 코드
public class StringCalculator {
    public int add(String s) {

        if (isBlank(s)) {
            return 0;
        }

        return sum(toInt(split(s)));
    }

    private int sum(int[] ints) {
        int sum = 0;
        for (int int01 : ints) {
            sum += int01;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    private String[] split(String s) {

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);
        if (matcher.find()) {

            return matcher.group(2).split(matcher.group(1));
        }

        return s.split(",|:");
    }


    private int[] toInt(String[] s1) {

        return Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
    }


    private boolean isBlank(String s) {
        return s == null || s.isEmpty();
    }


    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.add("3:6,4");
    }

}
