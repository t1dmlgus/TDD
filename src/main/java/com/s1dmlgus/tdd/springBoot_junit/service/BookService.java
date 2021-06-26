package com.s1dmlgus.tdd.springBoot_junit.service;

import com.s1dmlgus.tdd.springBoot_junit.domain.Book;
import com.s1dmlgus.tdd.springBoot_junit.domain.BookRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRespository bookRespository;


    @Transactional
    public Book 저장하기(Book book) {
        Book saveBook = bookRespository.save(book);

        return saveBook;
    }

    public List<Book> 모두가져오기(){

        List<Book> all = bookRespository.findAll();

        return all;
    }

}
