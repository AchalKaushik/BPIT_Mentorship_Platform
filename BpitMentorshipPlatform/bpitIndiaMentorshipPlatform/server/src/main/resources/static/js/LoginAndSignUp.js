// Controller for Login Form



app.controller('navController', function($scope, $rootScope) {
	$scope.logoutToggle = false;
    $scope.navModel = "";
    console.log("in nav ctrl");
    console.log($rootScope.logoutToggle);
});

app.controller('loginController', function($scope, $rootScope, $http) {
    
	console.log("In login controller");
    $scope.signUp={};
    $scope.loginData={};
    
    $scope.signUp.firstName = "";
    $scope.signUp.lastName = "";
    $scope.loginError = false;
    
    $rootScope.userRole = "Teacher";
    
  //  $rootScope.userRole = "mentee";
    console.log($rootScope.userRole);
    
    /*
     *  Login page Angular Script Goes here
     */ 
    
    // Login Function
    $scope.loginFunction = function() {
/*        $scope.enrollmentValidate();
        $scope.loginPasswordLengthCheck();

        if($scope.enrollmentNumberError == false && $scope.passwordError==false) {*/
        	
        console.log("Login Success: Making Post Request");
        
        // Make post request from here 
        
        var loginURI = "/loginAuthenticate";
        var loginStatus;
        
        
       $http({
            url : loginURI,
            method : "POST",
            data : $scope.loginData,
             transformResponse: [function (data)  {
                console.log(data);
                loginStatus=data;
                return data;}]
         }).then(
                function(response)
                {
                    /*
                     * Check the returned response if doesnt contain any
                     * filename and libraryId then show no file exists
                     */
                	console.log("Search status :" + loginStatus);
                	
                     /* Null is returned in case any exception occurs while inserting data in database */
                     
                    if(loginStatus=="Success")
                        {
                        
                         /** 
                          * Authenticated user
                          * */ 
                         $rootScope.userId = $scope.loginData.userId;
                         console.log("userId in root scope is  :" + $rootScope.userId);
                        console.log("Authenticated user");
                        window.location.assign("#!/home");
                        
                        /*
                         * Making get request to  get userRole on whose basic routing will be done 
                         */
                        
                        /*
                         * Get request goes here
                         */
                        
                        /*
                         * Set userId 
                         */
                        var userRole;
                        
                        $http.get(
                                "/getUserRole?userId="+$rootScope.userId, {
                                    transformResponse: [function (data)  {
                                        console.log(data);
                                        userRole=data;
                                        $rootScope.userRole = userRole;
                                        
                                        //yha pe ni krna? undefined object aa jaaega
                                        // to kha pe kru set userRole? are tu phle useridd set kr jo login kei time dali thi 
                                        console.log($rootScope.userRole);
                                        return data;}]
                            }
                            ).then(function(response) {
                            	                            	
                            /*
                              * routing on basis of user role received
                              */        
                            	console.log("User role after login is  : "+ userRole+$rootScope.userRole);
                            $rootScope.logoutToggle = true;
                            	
                            });
                        
                        
                        
                        
//                        /*
//                         * Code to get user course 
//                         */
//                        
//                        console.log("Getting user course");
//                        
//                        var userCourse;
//                        
//                        $http.get(
//                                "/getUserCourse?userId="+"setUserIdHere", {
//                                    transformResponse: [function (data)  {
//                                        console.log(data);
//                                        userCourse=data;
//                                        return data;}]
//                            }
//                            ).then(function(response) {
//                             
//                            	console.log(userCourse);
//                             
//                            /*
//                              * routing on basis of user role received
//                              */        
//                            	
//                            	
//                            });
//                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        }
                    
                    else if(loginStatus=="Error")
                    	{
                    	/*
                    	 * Unauthenticated user take appropriate action here  
                    	 */
                        $scope.loginError = true;
                    	console.log("Unauthenticated user");
                    	}
                    else
                        {
                        
                         /** 
                          * Exception occurred  
                          */
                            window.location.assign("/#!/error");
                        console.log("Exception occurred");
                        }
                }
                );
        
/*        } 
        else {
            console.log("Error while login: Invalid Data");
        }*/
    };
    
    /*
     *  Login page Angular Script ends here
     */
    
    
    /*
     *  Sign up Angular script goes here 
     */
    
    // Setting Errors display as false 
    $scope.passwordError=false;
    $scope.confirmPasswordError=false;
    $scope.emailIdError=false;
    $scope.emptyFirstNameError = false;
    $scope.numberInFirstName = false;
    $scope.mobileNumberError = false;
    $scope.enrollmentNumberError = false;
    $scope.enrollmentNumberRegistered = false;
    $scope.successMsg = false;
    $scope.loginEmailIdError = false;
    
    $scope.loginActive = true;
    $scope.signupActive = false;


    $scope.confirmPasswordFlag = false;

	// Options for 'Post' & 'Courses' Field 
    $scope.post = ["Mentor", "Mentee"];
    $scope.courses = ["BTech", "MBA", "BBA"];
    
    // Initializing Dropdown menu options 
    $scope.signUp.registeredAs = "Mentee";
    $scope.signUp.course = "BTech";
    $scope.signUp.selectedBranch = "CSE";
    
    $scope.enroll = "teacher id";
    
    // Options for "Branch' Field in the Form
    $scope.branch = ["CSE", "IT", "ECE", "EEE"];
    // To toggle the visibility of 'Branch' Field
    $scope.toggleBranchField = "false";

	$scope.toggleLoginSignup = function(data) {
        console.log("toggle called");
        // Setting Errors display as false 
    $scope.passwordError=false;
    $scope.confirmPasswordError=false;
    $scope.emailIdError=false;
    $scope.emptyFirstNameError = false;
    $scope.numberInFirstName = false;
    $scope.mobileNumberError = false;
    $scope.enrollmentNumberError = false;
    $scope.enrollmentNumberRegistered = false;
    $scope.successMsg = false;
    $scope.loginEmailIdError = false;
		if(data==1) {
			$scope.loginActive = true;
			$scope.signupActive = false;
		} else if (data==2) {
			$scope.loginActive = false;
			$scope.signupActive = true;
		}
	}
    
    $scope.updateEnroll = function() {
        if($scope.signUp.registeredAs=="Teacher") {
            $scope.enroll = "teacher id";
        } else if ($scope.signUp.registeredAs=="Mentee" || $scope.signUp.registeredAs=="Mentor" ) {
            $scope.enroll = "enrollment number";
        }
    }
    
    $scope.firstNameValidate = function() {
        if($scope.signUp.firstName.length==0) {
            $scope.emptyFirstNameError = true;
            $scope.numberInFirstName = false;
        } else {
            if(/\d/.test($scope.signUp.firstName)) {
                $scope.numberInFirstName = true;
            } else {
                $scope.numberInFirstName = false;
            }
            $scope.emptyFirstNameError = false;
        }
    }
    
    $scope.lastNameValidate = function() {
        if($scope.signUp.lastName.length==0) {
            $scope.emptyLastNameError = true;
            $scope.numberInLastName = false;
        } else {
            if(/\d/.test($scope.signUp.lastName)) {
                $scope.numberInLastName = true;
            } else {
                $scope.numberInLastName = false;
            }
            $scope.emptyLastNameError = false;
        }
    }

    $scope.mobileValidate = function() {
        if($scope.signUp.mobileNumber==null) {
            $scope.mobileNumberError = true;
        } else {
            if($scope.signUp.mobileNumber.toString().length!=10) {
                $scope.mobileNumberError = true;
            } else {
                $scope.mobileNumberError = false;
            }
        }
    }

    $scope.enrollmentValidate = function() {
        if($scope.signUp.uniqueId==null) {
            $scope.enrollmentNumberError = true;
        } else {
            if($scope.signUp.uniqueId.toString().length!=10) {
                $scope.enrollmentNumberError = true;
            } else {
                $scope.enrollmentNumberError = false;
            }
        }
    }
    
    // Function to validate EmailId
    
    $scope.validateEmailId = function() {
        console.log("In validate function");
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        if( !re.test($scope.loginData.userId)) 
            $scope.loginEmailIdError=true;
        else
            $scope.loginEmailIdError=false;
        
        if(!re.test($scope.signUp.userId))
            $scope.emailIdError=true;
        else
            $scope.emailIdError=false;
        }
    // Email Validation function ends here

    
    
    // Function to check the length of the password
    $scope.checkLength = function() {

        if($scope.signUp.password.length<6) 
            $scope.passwordError=true; 
        else
            $scope.passwordError=false;

        if($scope.confirmPasswordFlag == true) {
            if($scope.signUp.confirmPassword!=$scope.signUp.password) 
               $scope.confirmPasswordError=true;
            else
               $scope.confirmPasswordError=false;
        }
    }
    // Password Length function ends here

    // Function to check the length of the password
    $scope.loginPasswordLengthCheck = function() {

        if($scope.signUp.password.length==0) 
            $scope.passwordError=true; 
        else
            $scope.passwordError=false;
    }
    // Password Length function ends here

    
    // Function to match the passwords
    $scope.matchPasswordAndConfirmPassword = function() {
        $scope.confirmPasswordFlag = true;
        if($scope.signUp.confirmPassword!=$scope.signUp.password) 
           $scope.confirmPasswordError=true;
        else
           $scope.confirmPasswordError=false;
    }
    // Passwords Matching function ends heres

    // Function to toggle the view of 'Branch' Field
    $scope.show = function() {
        $scope.toggleBranchField = "true";
    }

    // Function for submitting the form data
    $scope.submitFunction = function() {
	   $scope.firstNameValidate();
       $scope.lastNameValidate();
       $scope.checkLength();
       $scope.matchPasswordAndConfirmPassword();
       $scope.validateEmailId();
       $scope.enrollmentValidate();
       $scope.mobileValidate();
       $scope.enrollmentNumberRegistered = false;

       if($scope.passwordError==false && $scope.confirmPasswordError==false && $scope.emailIdError==false && $scope.emptyFirstNameError==false && $scope.numberInFirstName==false && $scope.mobileNumberError==false && $scope.enrollmentNumberError==false) {
            console.log("Submitted");
            
            var singUpURI = "/SignUp";
            var signUpStatus;
            
            
            
            $http({
                url : singUpURI,
                method : "POST",
                data : $scope.signUp,
                 transformResponse: [function (data)  {
                    console.log(data);
                    signUpStatus=data;
                    return data;}]
             }).then(
                    function(response)
                    {
                        
                         /* Null is returned in case any exception occurs while inserting data in database */
                         
                        if(signUpStatus=="")
                            {
                            
                             /** Error occurs*/ 
                             
                            console.log("UserId already exists");
                            $scope.enrollmentNumberRegistered = true;
                            }
                        else if(signUpStatus=="Error")
                            {
                            
                          /*   * Error occurs ( route to error page)*/ 
                             
                            window.location.assign("/#!/error");
                            console.log("Error occurs");
                            }
                        else
                            {
                            
                             /** Successfully registeered */
                             

                            $scope.toggleLoginSignup(1);
                            $scope.successMsg = true;
                            console.log("Success");
                            }
                    }
                    );
        } else {
            console.log("Error Submitting Form: Invalid Data"); 
        }
    }  
    
    /*
     *  Sign up Angular Script ends here 
     */
    
    });