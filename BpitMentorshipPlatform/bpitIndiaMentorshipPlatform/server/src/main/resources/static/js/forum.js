// Controller for Forum
app.controller('forumController', function($scope, $rootScope) {

	if(localStorage.getItem("userid")==null) {
		console.log("set ni h bhai, phele set kr k aa");
		window.location.assign("#!/login");
	}
    
});