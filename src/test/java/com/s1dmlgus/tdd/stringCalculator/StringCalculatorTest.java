package com.s1dmlgus.tdd.stringCalculator;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


/**
 *
 * 요구사항
 *
 * 1.쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분 리한 각 숫자의 합을 반환
 *  (예:
 *    “” => 0,
 *    "1,2" => 3,
 *    "1,2,3" => 6,
 *    “1,2:3” => 6)
 *
 * 2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값 은 6이 반환되어야 한다.

 * 3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외 를 throw한다.
 *
 *
 *
 *
 */




class StringCalculatorTest {

    private StringCalculator stringCalculator;


    @BeforeEach
    void setUp() {

        stringCalculator = new StringCalculator();
    }


    @Test
    public void null_또는_빈칸() throws Exception{
        //given
        //when
        //then
        assertThat(stringCalculator.add("")).isEqualTo(0);
        assertThat(stringCalculator.add(null)).isEqualTo(0);

    }

    @Test
    public void 값_하나() throws Exception{
        //given
        //when
        //then
        assertThat(stringCalculator.add("1")).isEqualTo(1);

    }

    @Test
    public void 쉼표() throws Exception{
        //given
        //when
        //then

        Assertions.assertThat(stringCalculator.add("1,2")).isEqualTo(3);
    }

    
    @Test
    public void 쉼표_또는_클론() throws Exception{
        //given
        //when
        //then
        Assertions.assertThat(stringCalculator.add("1,2:4")).isEqualTo(7);
    }
    
    
    @Test
    public void 커스텀구분자() throws Exception{
        //given
        
        //when
        //then
        Assertions.assertThat(stringCalculator.add("//;\n1;2;5")).isEqualTo(8);
    }
    

}