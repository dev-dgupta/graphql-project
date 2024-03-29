package com.graphql.learn.graphqlproject.controllers;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.entites.BookInput;
import com.graphql.learn.graphqlproject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookGraphQlController {

    @Autowired
    private BookService bookService;

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        b.setDesc(book.getDesc());
        b.setTitle(book.getTitle());
        b.setPages(book.getPages());
        return this.bookService.create(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}
