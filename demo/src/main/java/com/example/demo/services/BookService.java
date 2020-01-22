package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional(readOnly = true)
    public Collection<Book> getAll() {
        return (Collection<Book>) bookRepository.findAll();
    }
}
