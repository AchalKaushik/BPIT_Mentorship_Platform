// Controller for Library Page
app.controller('libraryController', function($scope, $http) {

$scope.checksem = function() {
	if($scope.selectedBranch == "CSE" && $scope.selectedSemester==1) {
	    $scope.subBranch = ["Applied Mathematics - I", "Applied Physics - I","Electrical Technology","Manufacturing Processes","Human Values & Professional Ethics - I","Fundamentals Of Computing","Applied Chemistry","Engineering Graphics Lab"];
	}
}
    
$scope.sem = function(i) {
    console.log("aaya");
    $scope.selectedSemester =  i;
    $scope.checksem();
}

$scope.cses2 = ["Applied Mathematics - II", "Applied Physics - II", "Electronic Devices","Introduction To Programming","Engineering Mechanics","Communications Skills","Environmental Studies"];

$scope.cses3 = ["Applied Mathematics - III","Foundation Of Computer Science","Switching Theory And Logic Design","Circuits And Systems","Data Structure","Computer Graphics And Multimedia"];

$scope.cses4 = ["Applied Mathematics - IV","Computer Organization And Architecture","Theory Of Computation","Database Management Systems","Communication Systems","Object Oriented Programming"];

$scope.cses5 = ["Algorithms Design And Analysis","Communication Skills For Professionals","Software Engineering","Digital Communication","Java Programming","Industrial Management"];

$scope.cses6 = ["Compiler Design","Operating Systems","Computer Networks","Web Engineering","Artificial Intelligence"];

$scope.cses7 = ["Information Security","Software Testing and Quality Assurance","Wireless Communication","Complexity Theory","Intellectual Property Rights","Embedded Systems","Data Mining and Business Intelligence","Advanced Computer Architecture","Natural Language Processing","Digital Signal Processing","Simulation and Modelling","Advanced DBMS","Parallel Computing","Advanced Computer Networks","Control System","Sociology and Elements of Indian History for Engineers"];

$scope.cses8 = ["Mobile Computing","Machine Learning","Human Values and Professional Ethics-II","Digital Image Processing","Microelectronics","Ad Hoc and Sensor Networks","Soft Computing","VLSI Design","Distributed Systems","Object Oriented Software Engineering","Computer Vision","Software Project Management","Human Computer Interaction","Information Theory and Coding","Web Intelligence and Big Data","Service Oriented Architecture","Multiagent Systems","Principles of Programming Languages","Telecommunication Networks","Selected Topics of Recent Trends in Computer Science and Engineering"];


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