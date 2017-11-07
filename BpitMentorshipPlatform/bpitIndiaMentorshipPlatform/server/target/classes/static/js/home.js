// Controller for Home Page
app.controller('homeController', function($scope, $rootScope) {
console.log("in home controller");
    $rootScope.userId = localStorage.getItem('user');
    $rootScope.userRole = localStorage.getItem('userRole');
    $rootScope.userCourse = localStorage.getItem('userCourse');
    console.log($rootScope.userRole);
    if($rootScope.userRole == null) {
        location.assign("#!/");
    }
});