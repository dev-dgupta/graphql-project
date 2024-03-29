package com.graphql.learn.graphqlproject.controllers;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public Book get(@PathVariable int bookId){
        return this.bookService.get(bookId);
    }
}
