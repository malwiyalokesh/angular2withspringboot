import {Component,OnInit} from "@angular/core";
import { Book } from "./book";
import { BooksService } from "./books.service";

@Component({
    selector:"my-books",
    templateUrl:"./books.component.html"
})
export class BooksComponent implements OnInit {

    selectedBook:Book;

    books: Book[];
    ngOnInit(): void {
        this.bookService.getBooks().subscribe(books => this.books = books);
    }   

    constructor(private bookService:BooksService) {

    }

    showBookDetails(book:Book): void {
        this.selectedBook = book;
    }

}