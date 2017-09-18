// Controller for Library Page
app.controller('libraryController', function($scope, $http) {

	$scope.library={};
	
	$scope.library.branch = 'Select Branch';
	$scope.library.semester = 'Select Semester';
	$scope.library.subject = 'Select Subject';
    $scope.library.category = "Select Category";
    
    $scope.subjectError = false;
    $scope.semesterError = false;
    $scope.categoryError = false;
    $scope.branchError = false;
    $scope.fileNameError = false;
    $scope.uploadFileError = false;

	$scope.selectBranch = ['Select Branch', 'CSE','IT','ECE','EEE'];
	$scope.selectSemester = ['Select Semester','First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth', 'Seventh', 'Eighth'];
	$scope.selectSubject = ['Select Subject', 'Bot saare'];
    $scope.selectCategories = ['Select Category', 'E-Books', 'E-Notes'];
    
    $scope.changeText = function() {
    	var labelText = document.getElementById('fileUploadLabel');
    	var fullPath = document.getElementById('fileUpload').value;
        if (fullPath) {
            var startIndex = (fullPath.indexOf('\\') >= 0 ? fullPath.lastIndexOf('\\') : fullPath.lastIndexOf('/'));
            var filename = fullPath.substring(startIndex);
            if (filename.indexOf('\\') === 0 || filename.indexOf('/') === 0) {
                filename = filename.substring(1);
            }
            labelText.innerHTML = filename.substring(0,15)+"..";
        	alert($scope.fileUploaded);
        }
    }
    
    $scope.fileNameErrorFunction = function() {
        var format = /[ !@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/;
        if(format.test($scope.fileName)) {
            $scope.fileNameError = true;
        } else {
        	$scope.fileNameError = false;
        }
    }
    
    $scope.uploadFunction = function() {
    	$scope.subjectError = false;
	    $scope.semesterError = false;
	    $scope.categoryError = false;
	    $scope.branchError = false;
	    $scope.fileNameError = false;
	    $scope.uploadFileError = false;
	    
	    $scope.fileNameErrorFunction();
    
            if($scope.library.branch=='Select Branch')
                $scope.branchError = true;
            if($scope.library.semester=='Select Semester')
                $scope.semesterError = true;
            if($scope.library.subject=='Select Subject')
                $scope.subjectError = true;
            if($scope.library.category=='Select Category')
                $scope.categoryError = true;
            
            if($scope.branchError==false && $scope.semesterError==false && $scope.subjectError==false && $scope.categoryError==false)
            	{
        
            	/*
            	 * Code to upload the Incoming file and making the post request
            	 */
					var uploadUrl="/hello";
					var formData = new FormData();
					formData.append('uploadedFile',document.getElementById("fileUpload").files[0]);
            		formData.append('fileDetails', $scope.library);
            		console.log(formData+ "   " +$scope.library );
					 $http({
						 method: 'POST',
						 url: uploadUrl,
						 data: formData,
						 headers: {'Content-Type': undefined},
            
						 transformRequest: angular.identity,
						 transformResponse: [function (data) {
							 console.log(data);
							 thisIsResponse=data;
							 console.log(thisIsResponse);
							 return data;
						 }]
					 }).then(function(response) {
            
					console.log("response of success -----");
        			console.log(thisIsResponse);
        			responseOfUpload(thisIsResponse);
            		return response.data;
            
					 }, function errorCallback(response) {
        			console.log("Error in receiving response from backend------" +response);
            		console.log('Error: '+response);
         			});
        
            	
            	}
        
        
    }
    
    $scope.searchFunction = function() {
    	$scope.subjectError = false;
	    $scope.semesterError = false;
	    $scope.categoryError = false;
	    $scope.branchError = false;
	    
	    $scope.fileNameErrorFunction();
        if($scope.library.branch!='Select Branch' && $scope.library.semester!='Select Semester' && $scope.library.subject!='Select Subject' && $scope.library.category!='Select Category') {
            console.log("searching");
        } else {
            console.log("not searching");
            if($scope.library.branch=='Select Branch')
                $scope.branchError = true;
            if($scope.library.semester=='Select Semester')
                $scope.semesterError = true;
            if($scope.library.subject=='Select Subject')
                $scope.subjectError = true;
            if($scope.library.category=='Select Category')
                $scope.categoryError = true;
        }
    }
});