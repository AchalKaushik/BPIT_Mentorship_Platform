// Controller for Home Page
app.controller('navController', function($scope, $rootScope) {
    $scope.logoutToggle = false;
    $rootScope.manageToggle = false;
	
	// aap bs mujhe vha pocha do jha pe login succes ho rha hok
    $scope.navModel = "";
    console.log("in nav ctrl");
    console.log($rootScope.logoutToggle);

    $scope.logoutFunction = function(){
        localStorage.removeItem('user');
        localStorage.removeItem('userRole');
        localStorage.removeItem('userCourse');
    }
});