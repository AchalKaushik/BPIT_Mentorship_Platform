// Controller for Library Page
app.controller('libraryController', function($scope, $rootScope, $http) {
    
    console.log("in library controller");
    console.log($rootScope.userRole);
    
    $scope.steps = [
    {companyName: true},
    {businessType: true},
    {physicalAddress: true}
];

$scope.checksem = function() {
	if($scope.selectedBranch != "Select Branch" && ($scope.selectedSemester==1 || $scope.selectedSemester=="First")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - I", "Applied Physics - I","Electrical Technology","Manufacturing Processes","Human Values & Professional Ethics - I","Fundamentals Of Computing","Applied Chemistry","Engineering Graphics Lab"];
	} else if($scope.selectedBranch != "Select Branch" && ($scope.selectedSemester==2 || $scope.selectedSemester=="Second")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - II", "Applied Physics - II", "Electronic Devices","Introduction To Programming","Engineering Mechanics","Communications Skills","Environmental Studies"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==3 || $scope.selectedSemester=="Third")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - III","Foundation Of Computer Science","Switching Theory And Logic Design","Circuits And Systems","Data Structure","Computer Graphics And Multimedia"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==4 || $scope.selectedSemester=="Fourth")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - IV","Computer Organization And Architecture","Theory Of Computation","Database Management Systems","Communication Systems","Object Oriented Programming"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==5 || $scope.selectedSemester=="Fifth")) {
	    $scope.subBranch = ["Select Subject", "Algorithms Design And Analysis","Communication Skills For Professionals","Software Engineering","Digital Communication","Java Programming","Industrial Management"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==6 || $scope.selectedSemester=="Sixth")) {
	    $scope.subBranch = ["Select Subject", "Compiler Design","Operating Systems","Computer Networks","Web Engineering","Artificial Intelligence"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==7 || $scope.selectedSemester=="Seventh")) {
	    $scope.subBranch = ["Select Subject", "Information Security","Software Testing and Quality Assurance","Wireless Communication","Complexity Theory","Intellectual Property Rights","Embedded Systems","Data Mining and Business Intelligence","Advanced Computer Architecture","Natural Language Processing","Digital Signal Processing","Simulation and Modelling","Advanced DBMS","Parallel Computing","Advanced Computer Networks","Control System","Sociology and Elements of Indian History for Engineers"];
	} else if($scope.selectedBranch == "CSE" && ($scope.selectedSemester==8  || $scope.selectedSemester=="Eigth")) {
	    $scope.subBranch = ["Select Subject", "Mobile Computing","Machine Learning","Human Values and Professional Ethics-II","Digital Image Processing","Microelectronics","Ad Hoc and Sensor Networks","Soft Computing","VLSI Design","Distributed Systems","Object Oriented Software Engineering","Computer Vision","Software Project Management","Human Computer Interaction","Information Theory and Coding","Web Intelligence and Big Data","Service Oriented Architecture","Multiagent Systems","Principles of Programming Languages","Telecommunication Networks","Selected Topics of Recent Trends in Computer Science and Engineering"];
    //IT Subjects
	} else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==3 || $scope.selectedSemester=="Third")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - III","Foundation Of Computer Science","Switching Theory And Logic Design","Circuits And Systems","Data Structure","Computer Graphics And Multimedia"];  
    } else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==4 || $scope.selectedSemester=="Fourth")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - IV","Computer Organization And Architecture","Theory Of Computation","Database Management Systems","Control Systems","Object Oriented Programming"];  
    } else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==5 || $scope.selectedSemester=="Fifth")) {
	    $scope.subBranch = ["Select Subject", "Algorithms Design And Analysis","Communication Skills For Professionals","Software Engineering","Digital Communication","Java Programming","Industrial Management"];  
    } else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==6 || $scope.selectedSemester=="Sixth")) {
	    $scope.subBranch = ["Select Subject", "Compiler Design","Operating Systems","Data Communication and Networks","Web Engineering","Artificial Intelligence"];  
    } else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==7 || $scope.selectedSemester=="Seventh")) {
	    $scope.subBranch = ["Select Subject", "Advanced Computer Networks","Cryptography and Network Security","Wireless Communication","Embedded Systems","Optoelectronics and Optical Communication","Cloud Computing","Distributed Databases","Semantic Web Technologies","Software Testing","Digital Signal Processing",".NET and C# Programming","Enterprise Computing in Java","System and Network Administration","Grid Computing","Advanced Database Administration","Probablistic Graphical Models","Sociology and Elements of Indian History for Engineers"];  
    } else if($scope.selectedBranch == "IT" && ($scope.selectedSemester==8  || $scope.selectedSemester=="Eigth")) {
	    $scope.subBranch = ["Select Subject", "Mobile Computing","Ad hoc and Sensor Networks","Human Values and Professional Ethics-II","Big Data Analytics","Social Network Analysis","Soft Computing","Bio Informatics","Web Application development using .NET","VLSI Design","Information Theory and Coding","Human Computer Interaction","Digital Image Processing","Next Generation Networks","GPS and GIS","Satellite Communication","E-Commerce and M-Commerce","Distributed Systems","Selected Topics of Recent Trends in Information Technology"];  
        //ECE
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==3 || $scope.selectedSemester=="Third")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - III","Analog Electronics - I","Switching Theory And Logic Design","Electronic Instruments and Measurements","Data Structure","Signals and Systems"];
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==4 || $scope.selectedSemester=="Fourth")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - IV","Computer Organization And Architecture","Analog Electronics – II","Network Analysis and Synthesis","Communication Systems","Electromagnetic Field Theory"];
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==5 || $scope.selectedSemester=="Fifth")) {
	    $scope.subBranch = ["Select Subject", "Digital Communication","Communication Skills For Professionals","Microprocessors and Microcontrollers","Control Systems ","Digital System Design","Industrial Management"]; 
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==6 || $scope.selectedSemester=="Sixth")) {
	    $scope.subBranch = ["Select Subject", "Microwave Engineering","Information Theory and Coding ","Digital Signal Processing","VLSI Design","Data Communication and Networks","Antenna and Wave Propagation"];  
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==7 || $scope.selectedSemester=="Seventh")) {
	    $scope.subBranch = ["Select Subject", "Embedded Systems","Optoelectronics and Optical Communication","Wireless Communication","Advanced DSP","Introduction to MEMS","Advanced VLSI Design","Biomedical Instrumentation ","PLC and SCADA Systems","Power Electronics","RF Devices and Circuits","Database Management System","Renewable Energy Resources","Radar and Navigation","Project Management","Economics for Engineers","Sociology and Elements of Indian History","Grid Computing","Parallel Computing","Selected topics in ECE**"];  
    } else if($scope.selectedBranch == "ECE" && ($scope.selectedSemester==8  || $scope.selectedSemester=="Eigth")) {
	    $scope.subBranch = ["Select Subject", "Ad Hoc and Sensor Networks","Satellite Communication","Human Values and Professional Ethics-II","Digital Image Processing","Consumer Electronics","ASIC Design","Mobile Computing","Introduction to Nanotechnology","GPS and GIS","Adaptive Signal Processing","Robotics","Computer Graphics and Multimedia","Next Generation Networks"];
    // EEE    
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==3 || $scope.selectedSemester=="Third")) {
	    $scope.subBranch = ["Select Subject", "Applied Mathematics - III","Analog Electronics-I","Materials in Electrical Systems","Circuits And Systems","Data Structure","Electrical Machines-I"];
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==4 || $scope.selectedSemester=="Fourth")) {
	    $scope.subBranch = ["Select Subject", "Electrical Machines-II","Analog Electronics–II","Power System– I","Electrical and Electronics Measuring Instruments","Electromagnetic Field Theory","Control Systems"];
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==5 || $scope.selectedSemester=="Fifth")) {
	    $scope.subBranch = ["Select Subject", "Power Electronics","Communication Skills For Professionals","Sensors and Transducers","Digital Communication","Switching Theory and Logic Design","Industrial Management"];
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==6 || $scope.selectedSemester=="Sixth")) {
	    $scope.subBranch = ["Select Subject", "Power System – II","Utilization  of  Electrical  Energy  and  Electric Traction","Digital Signal Processing","VLSI Design","Microprocessor and Microcontroller","Power Station Practice"];  
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==7 || $scope.selectedSemester=="Seventh")) {
	    $scope.subBranch = ["Select Subject", "Electrical Drives","Advanced Control Systems","EHV AC and HVDC Transmissions","Renewable Energy Resources","Power Distribution System","Telemetry and Data Acquisition Systems","PLC and SCADA System","Mechatronics","High Voltage Engineering","Selected topics in EEE**","Optoelectronics and Optical Communication","Database Management Systems","Biomedical Instrumentation","Digital System Design","Power line Carrier  Communication","Electrical Machines Design","Sociology and Elements of Indian History for Engineers"];
    } else if($scope.selectedBranch == "EEE" && ($scope.selectedSemester==8  || $scope.selectedSemester=="Eigth")) {
	    $scope.subBranch = ["Select Subject", "Neuro-Fuzzy Systems","Power System Operation and Control","Human Values and Professional Ethics-II","Application of Power Electronics to Power Systems","Reliability   Engineering   and   Application to Power System","Electrical Machine - III","Electrical Energy Conservation","Power System Analysis and Stability","Electrical System Design","Embedded Systems","Data Communication and Networks","Digital Image Processing","Object Oriented Programming Using C++","Power Plant Instrumentation","Intelligent and Smart Instrumentation","Digital Communication","Electrical Power Quality"];
    } else {
        $scope.subBranch = [];
    }
}

$scope.searchData = {};
$scope.fileUploadData = {};
$scope.fileNameCheck = {};
$scope.downloadListData = {};
$scope.toggleSearchDownload = false;

$scope.searchDownload = "abc";
    
$scope.sem = function(i) {
    $scope.selectedSemester =  i;
    if($scope.selectedBranch=='Select Branch') {
        $scope.branchError = true;
    } else {
        $scope.checksem();
    }
}

$scope.subDownloadListFunction = function(subi) {
    $scope.selectedSubject = $scope.subBranch[subi];
    console.log($scope.selectedSubject);
    
    /*
     * Get course from root scope 
     */
    
    //$scope.downloadListData.course = "Btech";
    
    
    $scope.downloadListData.subject = $scope.selectedSubject;
    $scope.downloadListData.semester = $scope.selectedSemester;
    $scope.downloadListData.branch = $scope.selectedBranch;
    
    /*
     *get type from the head selected E-Books or E-Notes 
     */
    
    $scope.downloadListData.type = "E-Books";
    
    
    /*
     * Getting user role as per userId 
     */
    
  /*
  * Code to get user course 
  */
 
// console.log("Getting user course");
// 
// var userCourse;
// 
// $http.get(
//         "/getUserCourse?userId="+"ruchit.jain15@gmail.com", {
//             transformResponse: [function (data)  {
//                 console.log(data);
//                 userCourse=data;
//                 return data;}]
//     }
//     ).then(function(response) {
//    	 console.log("then response : " +userCourse);
//     });
//
// $scope.downloadListData.course = userCourse;
//    
//    console.log("user course for search : " + $scope.downloadListData.course );
//    
    /*
     * filename & lib id post goes here 
     * making exactly the same request as made in search
     * code is same..
     */
    
    $scope.downloadListData.userId = "ruchit.jain15@gmail.com";
    
    
    console.log($scope.downloadListData.userId);
    
    var searchURI = "/searchForFile";
    var searchStatus;
    
   $http({
        url : searchURI,
        method : "POST",
        data : $scope.downloadListData,
         transformResponse: [function (data)  {
            console.log(data);
            searchStatus=data;
            return data;}]
     }).then(
            function(response)
            {
                /*
                 * Check the returned response if doesnt contain any
                 * filename and libraryId then show no file exists
                 */
            	console.log("Search status :" + searchStatus);
            	
                 /* Null is returned in case any exception occurs while inserting data in database */
                 
                if(searchStatus=="")
                    {
                    
                     /** Error occurs*/ 
                     
//                    window.location.assign("/#!/error");
                console.log("An exception occurred ");
                    }
                else
                    {
                    
                     /** Successfully got filenames and libraryid */

                    console.log("Success");
                    }
            }
            );
   
   console.log("user course for search After post: " + $scope.downloadListData.course );
    
}

$scope.clear = function() {
    $scope.selectedSemester = "";
    if($scope.selectedBranch!='Select Branch') {
        $scope.branchError = false;
    } else {
        $scope.branchError = true;
    }
    $scope.checksem();
}


$scope.scrollTop = function(){
	if($scope.selectedBranch=='Select Branch') {
	    $('html, body').animate({ scrollTop: 300 }, 550);
	   }
	}

	$scope.selectedBranch = 'Select Branch';
	$scope.selectedSemester = 'Select Semester';
	$scope.selectedSubject = 'Select Subject';
    $scope.selectedCategory = "E-Notes";
    $scope.fileName = "";
    
    $scope.subjectError = false;
    $scope.semesterError = false;
    $scope.categoryError = false;
    $scope.branchError = false;
    $scope.fileNameError = false;
    $scope.fileNameEmptyError = false;
    $scope.uploadFileError = false;
    $scope.allSelected = false;

    $scope.semester = ['Select Semester','First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth', 'Seventh', 'Eighth'];
    $scope.branchEnotes = ['Select Branch', 'CSE','IT','ECE','EEE'];
    $scope.branch = ['Select Branch'];
    $scope.subBranch = ['Select Subject'];
    $scope.categories = ['Select Category'];
    
    $scope.arrayList = function(check) {
        if($scope.selectedSemester!="Select Semester") {
        if(check==1) {
        		$scope.selectedBranch = 'Select Branch';
        	}
            $scope.branch = ['Select Branch', 'CSE','IT','ECE','EEE'];
            document.getElementsByTagName("select")[1].removeAttribute("disabled");
        } else {
            $scope.branch = ['Select Branch']; 
            $scope.selectedBranch = 'Select Branch';
            document.getElementsByTagName("select")[1].setAttribute("disabled", "");
        }
        if($scope.selectedSemester!="Select Semester" && $scope.selectedBranch!="Select Branch") {
        	if(check==2) {
        		$scope.selectedSubject = 'Select Subject';
        	}
            $scope.checksem();
            document.getElementsByTagName("select")[2].removeAttribute("disabled");
        } else {
            $scope.subject = ['Select Subject']; 
            $scope.selectedSubject = 'Select Subject';
            document.getElementsByTagName("select")[2].setAttribute("disabled","");
        }
        if($scope.selectedSemester!="Select Semester" && $scope.selectedBranch!="Select Branch" && $scope.selectedSubject!="Select Subject") {
            $scope.categories = ['Select Category', 'E-Books', 'E-Notes'];
            document.getElementsByTagName("select")[3].removeAttribute("disabled");
        } else {
            $scope.categories = ['Select Category']; 
            $scope.selectedCategory = "Select Category";
            document.getElementsByTagName("select")[3].setAttribute("disabled","");
        }
        if($scope.selectedCategory != 'Select Category') {
            $scope.allSelected = true;
        } else {
            $scope.allSelected = false;
        }
        if($scope.allSelected==true) {
           // $scope.fileNameCheck.course = "";
            $scope.fileNameCheck.semester = $scope.selectedSemester;
            $scope.fileNameCheck.branch = $scope.selectedBranch;
            $scope.fileNameCheck.subject = $scope.selectedSubject;
       
            /* 
             * getting file names 
             */
            
            console.log('getting file name array');
            
            
            var fileNamesURI = "/getFileNameAndLibraryId";
            var fileNamesStatus;
            
            console.log("Sem "+  $scope.searchData.semester+"sub " + $scope.searchData.subject);
            
            
            $http({
                url : fileNamesURI,
                method : "POST",
                data : $scope.fileNameCheck,
                 transformResponse: [function (data)  {
                    console.log(data);
                    fileNamesStatus=data;
                    return data;}]
             }).then(
                    function(response)
                    {
                        /*
                         * Check the returned response if doesnt contain any
                         * filename and libraryId then show no file exists
                         */
                    	console.log("Search status :" + fileNamesStatus);
                    	
                         /* Null is returned in case any exception occurs while inserting data in database */
                         
                        if(fileNamesStatus=="")
                            {
                            
                             /** Error occurs*/ 
                             console.log("all wale m");
                                
//                            window.location.assign("/#!/error");
                            console.log("An exception occurred ");
                            }
                        else
                            {
                            
                             /** Successfully got filenames and libraryid */

                            console.log("Success");
                            }
                    }
                    );
            
            
        }
    }
    
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
        }
    }
    
    $scope.fileNameErrorFunction = function() {
        var format = /[ !@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/;
        if(format.test($scope.fileName)) {
            $scope.fileNameError = true;
        } else {
        	$scope.fileNameError = false;
        }
        if($scope.fileName.length == 0) {
            $scope.fileNameEmptyError = true;
        } else  {
            $scope.fileNameEmptyError = false;
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
        if($scope.selectedBranch!='Select Branch' && $scope.selectedSemester!='Select Semester' && $scope.selectedSubject!='Select Subject' && $scope.selectedCategory!='Select Category' && $scope.fileNameError == false && ($scope.fileName).length!=0) {
            $scope.fileUploadData.branch = $scope.selectedBranch;
            $scope.fileUploadData.type = $scope.selectedCategory;
            $scope.fileUploadData.fileName = $scope.fileName;
            $scope.fileUploadData.semester = $scope.selectedSemester;
            $scope.fileUploadData.subject = $scope.selectedSubject;
            $scope.fileUploadData.miltipartFile = "";
            
            /*
             * post goes here ...
             */
            
            var formData = new FormData();
            console.log('File is :'+file);
            var file = document.getElementById('fileUpload').files[0];
            formData.append('branch', $scope.fileUploadData.branch);
            formData.append('type', $scope.fileUploadData.type);
            formData.append('fileName',$scope.fileUploadData.fileName);
            formData.append('semester',$scope.fileUploadData.semester);
            formData.append('subject',$scope.fileUploadData.subject);
            formData.append('userId',"ruchit.jain15@gmail.com");
            formData.append('file',  document.getElementById('fileUpload').files[0]);
            var uploadUrl= "/uploadFile";
            
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
                
            }, function errorCallback(response) {
            	console.log("Error in receiving response from backend------" +response);
                console.log('Error: '+response);
             });
            
            
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
            if($scope.fileName.length == 0) {
                $scope.fileNameEmptyError = true;
            }
        }
    }
    
    $scope.searchFunction = function() {
    	$scope.subjectError = false;
	    $scope.semesterError = false;
	    $scope.categoryError = false;
	    $scope.branchError = false;
	    
	    $scope.fileNameErrorFunction();
        if($scope.selectedBranch!='Select Branch' && $scope.selectedSemester!='Select Semester' && $scope.selectedSubject!='Select Subject' && $scope.selectedCategory!='Select Category') {
            $scope.searchData.semester = $scope.selectedSemester;
            $scope.searchData.subject = $scope.selectedSubject;
            $scope.searchData.type = $scope.selectedCategory;
            $scope.searchData.branch = $scope.selectedBranch;
           // $scope.searchData.course = "";
            
            var searchURI = "/searchForFile";
            var searchStatus;
            
            $scope.searchData.userId = "ruchit.jain15@gmail.com";
            
            console.log("Sem "+  $scope.searchData.semester+"sub " + $scope.searchData.subject);
            console.log("iski maa ka bhosda");
            
            $http({
                url : searchURI,
                method : "POST",
                data : $scope.searchData,
                 transformResponse: [function (data)  {
                    console.log(data);
                    searchStatus=data;
                    return data;}]
             }).then(
                    function(response)
                    {
                        /*
                         * Check the returned response if doesnt contain any
                         * filename and libraryId then show no file exists
                         */
                    	console.log("Search status :" + searchStatus);
                    	
                         /* Null is returned in case any exception occurs while inserting data in database */
                         
                        if(searchStatus=="")
                            {
                            
                             /** Error occurs*/ 
                             
//                            window.location.assign("/#!/error");
                            console.log("An exception occurred ");
                            }
                        else
                            {
                            
                             /** Successfully got filenames and libraryid */
//                            $scope.searchStatus = {"libraryId":"6", "filename":"hey"};
                                $scope.toggleSearchDownload = true;
                                console.log(searchStatus.fileName);
                                $scope.searchDownload = searchStatus.fileName;
                            console.log("Success");
                            }
                    }
                    );
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

/*
 * The following code has been tested just change the name of function and adjust it in code 
 * and set libraryId and fileName
 * 
 *  $scope.foc= function()
    {
    	 
          
        var downloadFileURI = "/downloadFile";
      	
        var libraryIdAndFileName = "?libraryId="+"setLibraryIdhere"+"&fileName="+"setfileNamehere";
      	
        var urldata = downloadFileURI+libraryIdAndFileName;
        
        window.open(urldata);
    }
 */



