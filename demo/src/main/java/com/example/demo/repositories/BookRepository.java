package com.example.demo.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.domain.Book;

public interface BookRepository extends Neo4jRepository<Book, Long> {
}
