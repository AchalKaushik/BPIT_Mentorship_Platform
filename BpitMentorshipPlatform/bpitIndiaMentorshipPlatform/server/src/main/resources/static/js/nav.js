// Controller for Home Page
app.controller('navController', function($scope, $http, $rootScope) {
    //$scope.logoutToggle = false;
    //$rootScope.manageToggle = false;
	
	// aap bs mujhe vha pocha do jha pe login succes ho rha hok
    //$scope.navModel = "";
    console.log("in nav ctrl");
    //console.log($rootScope.logoutToggle);

    $scope.logoutFunction = function(){
    	console.log("In logout");
        localStorage.removeItem('user');
        console.log("user is :" +localStorage.getItem('user'));
        localStorage.removeItem('userRole');
        localStorage.removeItem('userCourse');
        $scope.logoutToggle = false;
        $rootScope.manageToggle = false;
    }
});