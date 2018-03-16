import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";
import {User} from "./user";


@Component({
    selector:"blog_app",
    template:`<h1> response code is {{responseCode}}</h1>
    <h1> response message is {{responseMessage}}</h1>
    <div class="wrapper fadeInDown">
        <div id="formContent" >
            <!-- Tabs Titles -->
            <h2 class="active"> Sign In </h2>
            <h2 class="inactive underlineHover">Sign Up </h2>

            <!-- Icon -->
            <div class="fadeIn first">
                <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon" />
            </div>

            <!-- Login Form -->
            <form  (submit)="onSubmitButtonClicked()">
                <input type="text" id="login" class="fadeIn second" name="login" placeholder="login" [(ngModel)]="User.username" >
                <input type="text" id="password" class="fadeIn third" name="password" placeholder="password" [(ngModel)]="User.password">
                <input type="submit" class="fadeIn fourth" value="Log In" >
            </form>

            <!-- Remind Passowrd -->
            <div id="formFooter">
                <a class="underlineHover" href="#">Forgot Password?</a>
            </div>

        </div>
    </div>`
})
export class AppComponent implements OnInit {
    private responseCode:string;
    private responseMessage:string;

    User: any={};
    parameters : { [key: string]: string} = {};

    ngOnInit(): void {
        // this.httpService.get("/getMainText").toPromise().then(
        //     result =>{
        //         this.text=result.json();
        //     },
        //     error =>{
        //         this.text="Something is wrong";
        //
        //     }
        // )
    }
    onSubmitButtonClicked():void{
        this.parameters["username"]=this.User.username;
        this.parameters["password"]=this.User.password;

        this.httpService.get("/getMainText",this.parameters).toPromise().then(
            result =>{
                this.responseCode=result.json().responseCode;
                this.responseMessage=result.json().responseMessage;
            },
            error =>{
                this.responseMessage="Something is wrong";

            }
        )
    }
    constructor (private httpService:HttpService){
    }
}