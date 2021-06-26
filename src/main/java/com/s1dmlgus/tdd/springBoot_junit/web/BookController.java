package com.s1dmlgus.tdd.springBoot_junit.web;

import com.s1dmlgus.tdd.springBoot_junit.domain.Book;
import com.s1dmlgus.tdd.springBoot_junit.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;



    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book) {


        Book SaveBook = bookService.저장하기(book);


        return new ResponseEntity<>(SaveBook, HttpStatus.OK);
    }


}
