package com.s1dmlgus.tdd.springBoot_junit.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    private Long id;
    private String title;
    private String author;


}
