package com.graphql.learn.graphqlproject;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1= new Book();
		b1.setTitle("Complete Reference");
		b1.setAuthor("Jang Xu");
		b1.setDesc("Java complete reference book");
		b1.setPages(2000);
		b1.setPrice(23.45D);

		Book b2= new Book();
		b2.setTitle("Design Complete Reference");
		b2.setAuthor("Alex Xu");
		b2.setDesc("System Design complete reference book");
		b2.setPages(2400);
		b2.setPrice(4555.45D);

		Book b3= new Book();
		b3.setTitle("ML Complete Reference");
		b3.setAuthor("Alex Hiu");
		b3.setDesc("Machine Learning complete reference book");
		b3.setPages(5000);
		b3.setPrice(6000);

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
