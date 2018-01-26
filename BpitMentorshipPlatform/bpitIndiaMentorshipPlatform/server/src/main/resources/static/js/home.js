// Controller for Home Page
app.controller('homeController', function($scope, $rootScope) {
	console.log("in home ", $rootScope.userRole);
	
	if(localStorage.getItem("userid")==null) {
		console.log("set ni h bhai, phele set kr k aa");
		window.location.assign("#!/login");
	}
});