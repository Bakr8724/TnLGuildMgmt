import { Routes } from '@angular/router';
import { LoginPageComponent } from './login-page/login-page.component';
import { ProfileComponent } from './profile/profile.component';

export const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch:'full'}, //default route
    {path: 'login', component: LoginPageComponent},
    {path: 'profile', component: ProfileComponent},
];
