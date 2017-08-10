import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Rx';
import {Http,Response} from '@angular/http';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Book } from "./Book";

@Injectable()
export class BooksService {

    constructor(private http:Http) {

    }

    books:Book[];

    private books_api_url = "/api/books";

    getBooks() : Observable<Book[]> {

         // ...using get request
         return this.http.get(this.books_api_url)
                        // ...and calling .json() on the response to return data
                         .map((res:Response) => <Book[]>res.json())
                         //...errors if any
                         .catch((error:any) => Observable.throw(error.json().error || 'Server error'));

     }
}