package com.graphql.learn.graphqlproject.entites;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {

    private String title;
    private String desc;
    private String author;
    private int pages;
    private double price;

}
