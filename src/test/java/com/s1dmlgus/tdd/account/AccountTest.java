package com.s1dmlgus.tdd.account;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;


class AccountTest {


    private Account account;


    // 계좌 생성 리펙토링
    @BeforeEach
    public void setUp() {
        account = new Account(10000);
    }


    // 계좌 생성 테스트 메소드
    @Test
    public void testAccount() throws Exception {

    }


    // 계좌 조회 테스트 메서드
    @Test
    public void testGetBalence() throws Exception{



        assertThat(account.getBalance()).isEqualTo(10000);

        account = new Account(1000);
        assertThat(this.account.getBalance()).isEqualTo(1000);

        account = new Account(0);
        assertThat(this.account.getBalance()).isEqualTo(0);


    }

    // 계좌 입금 테스트
    @Test
    public void testDeposit() throws Exception{
        //given

        //when
        account.deposit(1000);

        //then
        assertThat(account.getBalance()).isEqualTo(11000);
    }



}