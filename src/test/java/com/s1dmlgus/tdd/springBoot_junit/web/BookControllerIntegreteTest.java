package com.s1dmlgus.tdd.springBoot_junit.web;


import com.s1dmlgus.tdd.springBoot_junit.domain.Book;
import com.s1dmlgus.tdd.springBoot_junit.domain.BookRespository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
public class BookControllerIntegreteTest {


    @Autowired
    private BookRespository bookRespository;

    @Autowired
    private EntityManager entityManager;

    @BeforeEach
    public void init(){
        entityManager.createNativeQuery("ALTER TABLE AUTO_INCREMENT =1").executeUpdate();

    }





}
