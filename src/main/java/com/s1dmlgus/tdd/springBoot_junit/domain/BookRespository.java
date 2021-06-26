package com.s1dmlgus.tdd.springBoot_junit.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Long> {
}
