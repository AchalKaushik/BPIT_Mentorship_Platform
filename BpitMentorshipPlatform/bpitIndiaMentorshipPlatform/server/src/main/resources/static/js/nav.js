// Controller for Home Page
app.controller('navController', function($scope, $http, $rootScope, $route, $location, $window) {
    console.log("In NavBar Controller");
    
    $scope.logoutFunction = function(){
        console.log("In logout");
        $scope.logoutToggle = false;
        $rootScope.manageToggle = false;
        $rootScope.userId=null;
        $rootScope.userRole=null;
        $rootScope.userCourse=null;
        $location.path('partials/login.html');
        $window.location.reload();
    }
});