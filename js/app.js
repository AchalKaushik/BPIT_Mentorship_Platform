// Declaring the app
var app = angular.module('bpit', ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "login.html"
    })
    .when("/signup", {
        templateUrl : "signup.html"
    })
    .when("/home", {
        templateUrl : "home.html"
    })
    .when("/library", {
        templateUrl : "library.html"
    })
    .otherwise({
        redirectTo: '/'
    });
});