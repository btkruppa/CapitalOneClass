import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  yup: string;

  constructor() {
    this.yup = 'yes';
  }

  change() {
    this.yup = 'no';
  }
}
