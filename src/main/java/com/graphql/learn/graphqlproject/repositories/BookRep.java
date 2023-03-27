package com.graphql.learn.graphqlproject.repositories;

import com.graphql.learn.graphqlproject.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book,Integer> {
}
