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
    .when("/error", {
        templateUrl : "partials/error.html"
    })
    .when("/library/search", {
        templateUrl : "partials/search.html"
    })
    .when("/library/upload", {
        templateUrl : "partials/upload.html"
    })
    .when("/construction", {
        templateUrl : "partials/construction.html"
    })
    .otherwise({
        redirectTo: '/'
    });
    
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    
});