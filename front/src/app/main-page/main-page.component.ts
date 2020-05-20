import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.scss']
})
export class MainPageComponent implements OnInit {
  mainPageMenu: MenuItem[] = [
    {
      label: 'ГЛАВНАЯ',
      id: 'main-page',
      command: (event) => this.goToMainPage(),
      icon: ''
    },
    {
      label: 'РАСПИСАНИЕ',
      id: 'schedule',
      command: (event) => this.goToSchedule(),
      icon: ''
    },
    {
      label: 'НАШИ ДОСТИЖЕНИЯ',
      id: 'achievements',
      command: (event) => this.goToAchievements(),
      icon: ''
    },
    {
      label: 'КОНТАКТЫ',
      id: 'contacts',
      command: (event) => this.goToContacts(),
      icon: ''
    }

  ]
  constructor() { }

  ngOnInit() {
  }


  // change to route
  private goToMainPage() {}

  private goToSchedule() {}

  private goToAchievements() {}

  private goToContacts() {}


}
