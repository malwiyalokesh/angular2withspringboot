import {Component,Input} from '@angular/core';
import { Book } from "./book";

@Component({
    selector: "book-detail",
    //styleUrls: ["book-detail.component.css"],
    templateUrl:"./book-detail.component.html"
    
    //styles: [require('book-detail.component.css')]
})
export class BookDetailComponent {
    @Input()
    book:Book;

}