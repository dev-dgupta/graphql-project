package com.graphql.learn.graphqlproject.impl;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.repositories.BookRep;
import com.graphql.learn.graphqlproject.services.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRep bookRep;

    public BookServiceImpl(BookRep bookRep){
        this.bookRep=bookRep;
    }
    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found on server"));
    }
}
