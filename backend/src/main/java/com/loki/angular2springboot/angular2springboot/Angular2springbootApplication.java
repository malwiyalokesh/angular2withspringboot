package com.loki.angular2springboot.angular2springboot;

import com.loki.angular2springboot.angular2springboot.model.Book;
import com.loki.angular2springboot.angular2springboot.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Angular2springbootApplication {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(Angular2springbootApplication.class, args);
	}

	@Bean
	public CommandLineRunner createSomeBooks() {
		Arrays.asList(new Book[]{new Book("bk01","Immortals of meluha","Amish Tripathi","The_Immortals_Of_Meluha.jpg"),
				new Book("bk02","2 States","Chetan Bhagat","2states.jpg"),
				new Book("bk03","DaVinci Code","Dan Brown","DaVinciCode.jpg")}).stream().forEach(book -> bookRepository.save(book));

		return null;
	}
}
