package com.loki.angular2springboot.angular2springboot.controller;

import com.loki.angular2springboot.angular2springboot.model.Book;
import com.loki.angular2springboot.angular2springboot.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lokesh on 03-08-2017.
 */
@RestController
@RequestMapping("/api/books")
public class BooksController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<List<Book>>((List<Book>) bookRepository.findAll(), HttpStatus.OK);
    }
}
