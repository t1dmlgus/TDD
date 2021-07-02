package com.s1dmlgus.tdd.stringCalculator;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * 리펙토링
 * 
 * 1. indent를 줄여라
 * 2. else 를 쓰지마라
 * 3. 메소드에 한가지 일만 하도록 하여라
 *
 *
 * ### 기능 요구사항
 *
 * - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한다, 각 숫자의 합을 반환한다.
 *
 *      1. null_빈칸
 *          "" -> 0, null -> 0
 *
 *      2. 숫자 하나
 *
 *      3. 쉼표 하나
 *
 *      4. 쉼표 + 클론
 *
 *      5. 클론 하나
 *
 *
 * - 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
 *   커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
 *
 *      1. 커스텀 구분자 테스트
 *
 * 
 * - 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
 * 
 *      1. 음수 값 테스트 -> 예외처리
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


    private boolean isBlank(String s) {
        return s == null || s.isEmpty();
    }

    private String[] split(String s) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);
        if(matcher.find()){
            String[] split = matcher.group(2).split(matcher.group(1));
            return split;
        }


        return s.split(",|:");
    }

    private int[] toInt(String[] split) {

        int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        for (int anInt : ints) {
            if (anInt < 0) {
                throw new RuntimeException("음수 값은 넣을 수 없습니다.");
            }
        }
        return ints;
    }

    private int sum(int[] ints) {
        return Arrays.stream(ints).sum();
    }

}


