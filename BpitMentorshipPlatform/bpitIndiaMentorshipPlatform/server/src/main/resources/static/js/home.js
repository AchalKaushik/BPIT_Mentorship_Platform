// Controller for Home Page
app.controller('homeController', function($scope, $rootScope) {
	console.log("in home ", $rootScope.userRole);
	
	$rootScope.manageToggle = false;
	
	if(localStorage.getItem("userId")==null) {
		console.log("set ni h bhai, phele set kr k aa");
		window.location.assign("#!/login");
	}
});