//Declaring the app
var app = angular.module('bpit', ["ngRoute"]);

app.config(function($routeProvider, $httpProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "partials/login.html"
    })
    .when("/signup", {
        templateUrl : "partials/signup.html"
    })
    .when("/home", {
        templateUrl : "partials/home.html"
    })
    .when("/library", {
        templateUrl : "partials/library.html"
    })
    .otherwise({
        redirectTo: '/'
    });
    
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    
});