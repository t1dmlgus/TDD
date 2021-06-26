package com.s1dmlgus.tdd.springBoot_junit.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.s1dmlgus.tdd.springBoot_junit.domain.Book;
import com.s1dmlgus.tdd.springBoot_junit.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.springframework.http.RequestEntity.get;
import static org.springframework.http.RequestEntity.post;



@WebMvcTest
class BookControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private BookService bookService;
    

    @Test
    public void save_테스트() throws Exception{

        //given

            Book book = new Book(null, "스프링02", "코2");
            // java object -> json
            String s = new ObjectMapper().writeValueAsString(book);

    

        //when(스텁, 실행)
//        mockMvc.perform(post("/book").contentType()
//
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content()
//
        //then
    }
    
    
    @Test
    public void findAll_테스트() throws Exception{
        //given

            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book(1L, "스프링02", "코0"));
            books.add(new Book(2L, "스프링03", "코3"));

            // 스텁
            when(bookService.모두가져오기()).thenReturn(books);


        //when
        ResultActions perform = mockMvc.perform((RequestBuilder) get("/book")
                .accept(MediaType.APPLICATION_JSON_UTF8));

        //then

    }

}