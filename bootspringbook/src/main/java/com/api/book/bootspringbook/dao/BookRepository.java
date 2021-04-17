package com.api.book.bootspringbook.dao;

import com.api.book.bootspringbook.entities.Books;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {
    public Books findById(int id);

}
