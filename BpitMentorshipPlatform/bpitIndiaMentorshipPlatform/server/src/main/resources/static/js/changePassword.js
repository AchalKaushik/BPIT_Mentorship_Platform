// Controller for Home Page
app.controller('passwordController', function($scope, $http, $rootScope, $route, $location, $window) {
    
	if(localStorage.getItem("userId")==null) {
		console.log("set ni h bhai, phele set kr k aa");
		window.location.assign("#!/login");
	}
	
    $scope.currentPasswordError = false;
    $scope.currentPasswordLengthError = false;
    
    $scope.passwordError = false;
    $scope.confirmPasswordError = false;
    
    $scope.recoverPass = {};
    $scope.recoverPass.currentPassword = "";
    $scope.recoverPass.password = "";
    $scope.recoverPass.confirmPassword = "";
    
    // Function to check the length of the password
    $scope.checkLengthCurrent = function() {
        if(($scope.recoverPass.currentPassword).length<6)
            $scope.currentPasswordLengthError=true;
        else
            $scope.currentPasswordLengthError=false;
    }
    // Password Length function ends here

    // Function to check the length of the password
    $scope.checkLengthNewPass = function() {
        if(($scope.recoverPass.password).length<6)
            $scope.passwordError=true;
        else
            $scope.passwordError=false;
    }
    // Password Length function ends here
    
    $scope.checkCnfStatus = false;
    
    $scope.changeCnfStatus = function() {
    	$scope.checkCnfStatus = true;
    }

    // Function to check the length of the password
    $scope.matchPasswordAndConfirmPasswordNew = function() {
        if((($scope.recoverPass.confirmPassword).length<6 || $scope.recoverPass.confirmPassword != $scope.recoverPass.password) && $scope.checkCnfStatus == true )
            $scope.confirmPasswordError=true;
        else
            $scope.confirmPasswordError=false;
    }
    // Password Length function ends here
    
    
    $scope.changePassFunc = function() {
    	
    	$scope.checkLengthCurrent();
    	$scope.checkLengthNewPass();
    	$scope.matchPasswordAndConfirmPasswordNew();
    	
    	if($scope.passwordError==false && $scope.confirmPasswordError == false && $scope.currentPasswordLengthError==false) {

    	    $scope.recoverData = {};
    		$scope.recoverData.userId = localStorage.getItem("userId");
	    	$scope.recoverData.currentPassword = $scope.recoverPass.currentPassword;
	    	$scope.recoverData.newPassword = $scope.recoverPass.password;
	    	
	    	 var changePassURI = "/changePassword";
	         var changePassStatus;

	         $http({
	             url : changePassURI,
	             method : "POST",
	        	 	data : $scope.recoverData,
	              transformResponse: [function (data)  {
	                 console.log(data);
	                 changePassStatus=data;
	                 return data;}]
	          }).then(
	                 function(response)
	                 {
	                     /* Null is returned in case any exception occurs while inserting data in database */
	                     if(changePassStatus=="1"){
	                          console.log("ho gya bhai");
	                          document.getElementById('myModalTrig').click();
	                          //$rootScope.logoutFunction();
	                          //local storage clear kr vhi kr rah hu
	                      } else if(changePassStatus=="0") {
	                    	  //yha pe kya hoga? 
	                    	  //0 ni h na kuch? unathenticated user detected..  clear local storage throw out on login page]
	                    	  // aisa possible kaiseh?  hai possible.. bataunga baadme filhaal krde yh..ok
	                    	  $rootScope.logoutFunction();
	                    	  //koi msg to show ni krna na? rhne de.. kaam na bada jyada..ok
	                    	  
	                      } else if(changePassStatus=="-1") {
	                    	  //yha kya krna h?
	                    	  $scope.currentPasswordError = true;
	                      } else if(changePassStatus=="-2") {
	                    	  //yha kya krna h?

	                  		window.location.assign("#!/error");
	                      }
	                 }
	                 );
    	}
    	 
    }
});