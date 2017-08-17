package com.loki.angular2springboot.angular2springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Lokesh on 03-08-2017.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String isbn;
    private String title;
    private String author;
    private String image;

    public Book() {
    }

    public Book(String isbn, String title, String author, String image) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
