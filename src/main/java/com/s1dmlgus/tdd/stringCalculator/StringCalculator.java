package com.s1dmlgus.tdd.stringCalculator;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. indent를 줄여라
 * 2. else 를 쓰지마라
 * 3. 메소드에 한가지 일만 하도록 하여라
 * 
 * 
 */



// 프로덕션 코드
public class StringCalculator {

    public int splitAndSum(String s) {

        if (isBlank(s)) {
            return 0;
        }



        return sum(toInt(split(s)));

    }

    private String[] split(String s) {

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);
        if (matcher.find()) {
            String group1 = matcher.group(1);

            return matcher.group(2).split(group1);
        }

        return s.split(",|:");
    }



    private boolean isBlank(String s) {
        return s.equals("") || s.isEmpty();
    }

    private int[] toInt(String[] split) {

        return Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
    }


    private int sum(int[] ints) {
        int result = 0;
        for (int anInt : ints) {
            result += anInt;
        }
        return result;
    }




    public void matcher2(String s) {

        //;\n1;2;4

        int sum = 0;

        System.out.println("s = " + s);
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);

        if (matcher.find()) {

            String group1 = matcher.group(1);
            String group2 = matcher.group(2);

            String[] split = group2.split(group1);

            for (String s1 : split) {
                sum += Integer.parseInt(s1);
            }

        }
    }


    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.matcher2("//;\n1;2;4");
    }

}
