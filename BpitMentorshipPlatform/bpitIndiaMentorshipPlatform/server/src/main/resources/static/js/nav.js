// Controller for Home Page
app.controller('navController', function($scope, $http, $rootScope, $route, $location, $window) {
    
    // $scope.logoutToggle = localStorage.getItem("logoutToggle");
    
    console.log("in nav controller");
    $rootScope.logoutToggle=localStorage.getItem("logoutToggle");
    console.log("logout toggle local wala: ", localStorage.getItem("logoutToggle"));
    console.log("logout toggle rootscope wala: ", $rootScope.logoutToggle);
    
    $scope.logoutFunction = function(){
        console.log("In logout");
        $rootScope.manageToggle = false;
        $rootScope.userId=null;
        $rootScope.userRole=null;
        $rootScope.userCourse=null;
        localStorage.removeItem("userId");
        localStorage.removeItem("userRole");
        localStorage.removeItem("logoutToggle");
        localStorage.removeItem("manageToggle");
        localStorage.removeItem("userCourse");
        $scope.logoutToggle = localStorage.getItem("logoutToggle");
        $scope.manageToggle = localStorage.getItem("manageToggle");
        $location.path('partials/login.html');
        $window.location.reload();
    }
});