// Declaring the app
var app = angular.module('bpit', ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "login.html"
    })
    .when("/signup", {
        templateUrl : "signup.html"
    })
    .otherwise({
        redirectTo: '/'
    });
});





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
        // Make post request from here 
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
    


	// Options for 'Post' & 'Courses' Field 
    
    $scope.post = ["Teacher", "Mentor", "Mentee"];
    $scope.courses = ["BTech", "MBA", "BBA"];
    
    // Initializing Dropdown menu options 
    
    $scope.selectedPost = "Teacher";
    $scope.selectedCourse = "BTech";
    $scope.selectedBranch = "CSE";

    
    
    // Options for "Branch' Field in the Form
    $scope.branch = ["CSE", "IT", "ECE", "EEE"];
    // To toggle the visibility of 'Branch' Field
    $scope.toggleBranchField = "true";

    
    
    
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
        }
    // Password Length function ends here

    
    // Function to match the passwords
    $scope.matchPasswordAndConfirmPassword = function() {
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
       console.log("Submitted");
        //  Submit the data
    }  
    
    /*
    Sign up Angular Script ends here 
    */
    
    });