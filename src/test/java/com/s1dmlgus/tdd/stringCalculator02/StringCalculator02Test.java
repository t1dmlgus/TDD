package com.s1dmlgus.tdd.stringCalculator02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class StringCalculator02Test {

    StringCalculator02 stringCalculator02;


    @BeforeEach
    public void setUp(){
        stringCalculator02 = new StringCalculator02();
    }



    @Test
    public void plus() throws Exception{

        //then
        Assertions.assertThat(stringCalculator02.plus(2, 3)).isEqualTo(5);

    }





}