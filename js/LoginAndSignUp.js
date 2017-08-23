// Controller for Login Form
app.controller('loginController', function($scope) {
    
    
    /*
    Common Js function goes here for Login & Sign up page
    */
        
    /*
    Validate enrollment Number & password length here 
    */
    
    /*
    Common Js function ends here for Login & Sign up page
    */
    
    
    
    /*
    Login page Angular Script Goes here
    */

   /*
    Login function 
    */
    $scope.loginFunction = function() {
        $scope.enrollmentValidate();
        $scope.loginPasswordLengthCheck();

        if($scope.enrollmentNumberError == false && $scope.passwordError==false) {
            console.log("Login Success: Making Post Request");
        // Make post request from here 
        } else {
            console.log("Error while login: Invalid Data");
        }
    };

    
    /*
    Login page Angular Script ends here
    */
    
    
    
    /*
    Sign up Angular script goes here 
    */
    
    // Setting Errors display as false 
    
    $scope.passwordError=false;
    $scope.confirmPasswordError=false;
    $scope.emailIdError=false;
    $scope.emptyFirstNameError = false;
    $scope.numberInFirstName = false;
    $scope.mobileNumberError = false;
    $scope.enrollmentNumberError = false;


    $scope.confirmPasswordFlag = false;
    


	// Options for 'Post' & 'Courses' Field 
    
    $scope.post = ["Teacher", "Mentor", "Mentee"];
    $scope.courses = ["BTech", "MBA", "BBA"];
    
    // Initializing Dropdown menu options 
    $scope.firstName = "";
    $scope.lastName = "";
    $scope.password = "";
    $scope.confirmPassword = "";
    $scope.mobileNumber = null;
    $scope.enrollmentNumber = null;
    $scope.selectedPost = "Teacher";
    $scope.selectedCourse = "BTech";
    $scope.selectedBranch = "CSE";

    
    
    // Options for "Branch' Field in the Form
    $scope.branch = ["CSE", "IT", "ECE", "EEE"];
    // To toggle the visibility of 'Branch' Field
    $scope.toggleBranchField = "true";

    
    $scope.firstNameValidate = function() {
        if($scope.firstName.length==0) {
            $scope.emptyFirstNameError = true;
            $scope.numberInFirstName = false;
        } else {
            if(/\d/.test($scope.firstName)) {
                $scope.numberInFirstName = true;
            } else {
                $scope.numberInFirstName = false;
            }
            $scope.emptyFirstNameError = false;
        }
    }
    
    $scope.lastNameValidate = function() {
        if($scope.lastName.length==0) {
            $scope.emptyLastNameError = true;
            $scope.numberInLastName = false;
        } else {
            if(/\d/.test($scope.lastName)) {
                $scope.numberInLastName = true;
            } else {
                $scope.numberInLastName = false;
            }
            $scope.emptyLastNameError = false;
        }
    }

    $scope.mobileValidate = function() {
        if($scope.mobileNumber==null) {
            $scope.mobileNumberError = true;
        } else {
            if($scope.mobileNumber.toString().length!=10) {
                $scope.mobileNumberError = true;
            } else {
                $scope.mobileNumberError = false;
            }
        }
    }

    $scope.enrollmentValidate = function() {
        if($scope.enrollmentNumber==null) {
            $scope.enrollmentNumberError = true;
        } else {
            if($scope.enrollmentNumber.toString().length!=10) {
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
        if(!re.test($scope.emailId)) 
            $scope.emailIdError=true;
        else
            $scope.emailIdError=false;
        }
    // Email Validation function ends here

    
    
    // Function to check the length of the password
    $scope.checkLength = function() {

        if($scope.password.length<6) 
            $scope.passwordError=true; 
        else
            $scope.passwordError=false;

        if($scope.confirmPasswordFlag == true) {
            if($scope.confirmPassword!=$scope.password) 
               $scope.confirmPasswordError=true;
            else
               $scope.confirmPasswordError=false;
        }
    }
    // Password Length function ends here

    // Function to check the length of the password
    $scope.loginPasswordLengthCheck = function() {

        if($scope.password.length==0) 
            $scope.passwordError=true; 
        else
            $scope.passwordError=false;
    }
    // Password Length function ends here

    
    // Function to match the passwords
    $scope.matchPasswordAndConfirmPassword = function() {
        $scope.confirmPasswordFlag = true;
        if($scope.confirmPassword!=$scope.password) 
           $scope.confirmPasswordError=true;
        else
           $scope.confirmPasswordError=false;
    }
    // Passwords Matching function ends heres

    // Function to toggle the view of 'Branch' Field
    $scope.show = function() {
        $scope.toggleBranchField = "false";
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

       if($scope.passwordError==false && $scope.confirmPasswordError==false && $scope.emailIdError==false && $scope.emptyFirstNameError==false && $scope.numberInFirstName==false && $scope.mobileNumberError==false && $scope.enrollmentNumberError==false) {
            console.log("Submitted");
            //  Submit the data
        } else {
            console.log("Error Submitting Form: Invalid Data");
        }
    }  
    
    /*
    Sign up Angular Script ends here 
    */
    
    });