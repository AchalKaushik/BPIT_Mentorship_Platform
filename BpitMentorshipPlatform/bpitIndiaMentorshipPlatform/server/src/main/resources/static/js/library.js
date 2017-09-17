// Controller for Library Page
app.controller('libraryController', function($scope, $http) {

	$scope.selectedBranch = 'Select Branch';
	$scope.selectedSemester = 'Select Semester';
	$scope.selectedSubject = 'Select Subject';
    $scope.selectedCategory = "Select Category";
    
    $scope.subjectError = false;
    $scope.semesterError = false;
    $scope.categoryError = false;
    $scope.branchError = false;
    $scope.fileNameError = false;
    $scope.uploadFileError = false;

	$scope.branch = ['Select Branch', 'CSE','IT','ECE','EEE'];
	$scope.semester = ['Select Semester','First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth', 'Seventh', 'Eighth'];
	$scope.subject = ['Select Subject', 'Bot saare'];
    $scope.categories = ['Select Category', 'E-Books', 'E-Notes'];
    
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
        if($scope.selectedBranch!='Select Branch' && $scope.selectedSemester!='Select Semester' && $scope.selectedSubject!='Select Subject' && $scope.selectedCategory!='Select Category' && $scope.fileNameError == false) {
            console.log("uploaded");
        } else {
            console.log("file not uploded");
            if($scope.selectedBranch=='Select Branch')
                $scope.branchError = true;
            if($scope.selectedSemester=='Select Semester')
                $scope.semesterError = true;
            if($scope.selectedSubject=='Select Subject')
                $scope.subjectError = true;
            if($scope.selectedCategory=='Select Category')
                $scope.categoryError = true;
        }
    }
    
    $scope.searchFunction = function() {
    	$scope.subjectError = false;
	    $scope.semesterError = false;
	    $scope.categoryError = false;
	    $scope.branchError = false;
	    
	    $scope.fileNameErrorFunction();
        if($scope.selectedBranch!='Select Branch' && $scope.selectedSemester!='Select Semester' && $scope.selectedSubject!='Select Subject' && $scope.selectedCategory!='Select Category') {
            console.log("searching");
        } else {
            console.log("not searching");
            if($scope.selectedBranch=='Select Branch')
                $scope.branchError = true;
            if($scope.selectedSemester=='Select Semester')
                $scope.semesterError = true;
            if($scope.selectedSubject=='Select Subject')
                $scope.subjectError = true;
            if($scope.selectedCategory=='Select Category')
                $scope.categoryError = true;
        }
    }
});