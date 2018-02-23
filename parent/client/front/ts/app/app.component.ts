import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"blog_app",
    template:`<h1> text is {{text}}</h1>`
})
export class AppComponent implements OnInit {
    private text:string;

    ngOnInit(): void {
        this.httpService.get("/getMainText").toPromise().then(
            result =>{

                this.text=result.json().text;
            },
            error =>{
                this.text="Something is wrong";

            }
        )
    }
    constructor (private httpService:HttpService){
    }
}