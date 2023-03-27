package com.graphql.learn.graphqlproject.services;

import com.graphql.learn.graphqlproject.entites.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);


}
