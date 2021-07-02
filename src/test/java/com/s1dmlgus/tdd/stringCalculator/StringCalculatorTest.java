package com.s1dmlgus.tdd.stringCalculator;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


/**
 * 리펙토링
 * <p>
 * 1. indent를 줄여라
 * 2. else 를 쓰지마라
 * 3. 메소드에 한가지 일만 하도록 하여라
 *
 *
 *
 * ### 기능 요구사항
 * - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한다, 각 숫자의 합을 반환한다.
 * <p>
 * 1. null_빈칸
 * <p>
 * 2. 숫자 하나
 * <p>
 * 3. 쉼표 하나
 * <p>
 * 4. 쉼표 + 클론
 * <p>
 * 5. 클론 하나
 * <p>
 * <p>
 * - 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다.
 * 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
 *
 *
 * 1. 커스텀 구분자 테스트
 * <p>
 * <p>
 * - 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
 * <p>
 * 1. 음수 값 테스트 -> 예외처리
 */


class StringCalculatorTest {


    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void null_빈칸() throws Exception {

        //then
        Assertions.assertThat(stringCalculator.add("")).isEqualTo(0);
        Assertions.assertThat(stringCalculator.add(null)).isEqualTo(0);

    }

    @Test
    public void 숫자하나() throws Exception{

        //then
        assertThat(stringCalculator.add("1")).isEqualTo(1);
    }
    
    @Test
    public void 쉼표하나() throws Exception{
        //then
        assertThat(stringCalculator.add("1,2")).isEqualTo(3);
    }


    @Test
    public void 쉼표_또는_클론() throws Exception{

        //then
        assertThat(stringCalculator.add("1,2:4")).isEqualTo(7);
    }
    @Test
    public void 클론하나() throws Exception{
        //then
        assertThat(stringCalculator.add("1:2:5")).isEqualTo(8);
    }


    @Test
    public void 커스텀문자열() throws Exception{

        //then
        assertThat(stringCalculator.add("//s\n2s5s7")).isEqualTo(14);
    }


    @Test
    public void 음수_값_테스트() {

        //then
        assertThatThrownBy(()->{
                    stringCalculator.add("-1:2,3");
                })
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("음수 값은 넣을 수 없습니다.");
    }
    


}