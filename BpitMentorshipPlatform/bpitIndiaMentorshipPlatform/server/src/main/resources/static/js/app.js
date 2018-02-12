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
    .when("/manage", {
        templateUrl : "partials/manage.html"
    })
    .when("/forum", {
        templateUrl : "partials/forum.html"
    })
    .when("/forum/sem", {
        templateUrl : "partials/forum_sem.html"
    })
    .when("/forum/post", {
        templateUrl : "partials/forum_post.html"
    })
    .otherwise({
        redirectTo: '/'
    });
    
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
    
});