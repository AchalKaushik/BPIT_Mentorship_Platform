// Controller for Home Page
app.controller('navController', function($scope, $http, $rootScope, $route, $location, $window) {
    //$scope.logoutToggle = false;
    //$rootScope.manageToggle = false;
	
	// aap bs mujhe vha pocha do jha pe login succes ho rha hok
    //$scope.navModel = "";
    console.log("in nav ctrl");
    //console.log($rootScope.logoutToggle);
    
    if(localStorage.getItem('user')==null)
    	{
    	$rootScope.logoutToggle=false;
    	}
    else
    	$rootScope.logoutToggle=true;
    

    $scope.logoutFunction = function(){
    	console.log("In logout");
        localStorage.removeItem('user');
//        localStorage.removeItem('userRole'); haan dikh gya tha tabhi to commennt kra :P
        console.log("user is :" +localStorage.getItem('user'));
        localStorage.removeItem('userRole');
        localStorage.removeItem('userCourse');
        $scope.logoutToggle = false;
        $rootScope.manageToggle = false;
        $rootScope.userId=null;
        $rootScope.userRole=null;
        $rootScope.userCourse=null;
        $location.path('partials/login.html');
        $window.location.reload();
        //$route.reload();
        //window.location.assign("#!/");
        // theek ab ? kya theek?   i think user course ki value in rootscope purani wali persisit kr rhi hogi .. becoz page refresh hua tha ni 
        //islie kuch chutyaap  mch rha hoga..i guess.... test kr lo
       //lol kya hua? patani meko kuch lg rha h but shyad vo glt ho kahri
    }
});