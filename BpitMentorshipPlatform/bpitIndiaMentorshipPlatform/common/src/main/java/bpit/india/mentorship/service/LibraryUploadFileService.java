package bpit.india.mentorship.service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import bpit.india.mentorship.dto.BTechSemester1And2FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester3And4FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester5And6FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester7And8FolderPathsDto;

@Service
public class LibraryUploadFileService {

	@Autowired
	private LibrarySaveFileService librarySaveFileService;
	
	@Autowired
	private CreateBTechFolderStructureForLibraryService createBTechFolderStructureForLibraryService;
	
	@Autowired
	private BTechSemester1And2FolderPathsDto bTechSemester1And2FolderPathsDto;
	
	@Autowired
	private BTechSemester3And4FolderPathsDto bTechSemester3And4FolderPathsDto;
	
	@Autowired
	private BTechSemester5And6FolderPathsDto bTechSemester5And6FolderPathsDto;
	
	@Autowired
	private BTechSemester7And8FolderPathsDto bTechSemester7And8FolderPathsDto;
	
	public String uploadFile(MultipartFile file,String branch,String subject,String category,String fileName,String semester)
	{
		HashMap<String, Object> getPathsOfFolders = new HashMap<String, Object>();
		
		String course="";
		/*
		 * Get couse corresponding to userId from session
		 */
		
		Path path=Paths.get("");
		
		if(course.equalsIgnoreCase("BTech"))
		{
			getPathsOfFolders = createBTechFolderStructureForLibraryService.createFolderStructureForLibrary();
		switch (semester) {
		case "1":
			bTechSemester1And2FolderPathsDto = (BTechSemester1And2FolderPathsDto)getPathsOfFolders.get("Semester1And2");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - I":
					/*
					 * Get path of Btech->Sem1->cse->AM1 folder from dto
					 * Set Path variable using that path 
					 */
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEAMFolder()+ file.getOriginalFilename());
					break;
				case "Applied Physics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEAPFolder()+file.getOriginalFilename());
					break;
				case "Electrical Technology":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEETFolder()+file.getOriginalFilename());
					break;
				case "Manufacturing Processes":
					path=Paths.get(""+file.getOriginalFilename());
					break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Fundamentals Of Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Chemistry":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Graphics Lab":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Technology":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Manufacturing Processes":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Fundamentals Of Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Chemistry":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Graphics Lab":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Technology":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Manufacturing Processes":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Fundamentals Of Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Chemistry":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Graphics Lab":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Technology":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Manufacturing Processes":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Fundamentals Of Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Chemistry":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Graphics Lab":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break; // End of case 1 (semester)
		
		case "2":
			bTechSemester1And2FolderPathsDto = (BTechSemester1And2FolderPathsDto)getPathsOfFolders.get("Semester1And2");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Devices":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction To Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Mechanics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communications Skills":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Environmental Studies":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Devices":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction To Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Mechanics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communications Skills":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Environmental Studies":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Devices":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction To Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Mechanics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communications Skills":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Environmental Studies":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Applied Physics - II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Devices":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction To Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Engineering Mechanics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communications Skills":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Environmental Studies":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break;
		
		case "3":
			bTechSemester3And4FolderPathsDto = (BTechSemester3And4FolderPathsDto)getPathsOfFolders.get("Semester3And4");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Foundation Of Computer Science":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Switching Theory And Logic Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Circuits And Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Structure":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Graphics And Multimedia":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Foundation Of Computer Science":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Switching Theory And Logic Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Circuits And Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Structure":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Graphics And Multimedia":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Analog Electronics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Switching Theory And Logic Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Instruments and Measurements":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Structure":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Signals and Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Analog Electronics - I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Switching Theory And Logic Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electronic Instruments and Measurements":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Structure":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Signals and Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
				
			default:
				break;
			}
			break;
		
		case "4":
			bTechSemester3And4FolderPathsDto = (BTechSemester3And4FolderPathsDto)getPathsOfFolders.get("Semester3And4");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - IV":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Organization And Architecture":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Theory Of Computation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Database Management Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Object Oriented Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - IV":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Organization And Architecture":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Theory Of Computation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Database Management Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Object Oriented Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - IV":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Organization And Architecture":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Analog Electronics – II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Network Analysis and Synthesis":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electromagnetic Field Theory":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Electrical Machines-II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power System– I":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical   and   Electronics   Measuring Instruments":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Database Management Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electromagnetic Field Theory":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Control Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break;
		
		case "5":
			bTechSemester5And6FolderPathsDto = (BTechSemester5And6FolderPathsDto)getPathsOfFolders.get("Semester5And6");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Algorithms Design And Analysis":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Skills For Professionals":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Software Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Java Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Industrial Management":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Algorithms Design And Analysis":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Skills For Professionals":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Software Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Java Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Industrial Management":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Microprocessors and Microcontrollers":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Skills For Professionals":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Control Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital System Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Industrial Management":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Power Electronics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Communication Skills For Professionals":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Sensors and Transducers":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Switching Theory and Logic Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Industrial Management":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;
		
		case "6":
			bTechSemester5And6FolderPathsDto = (BTechSemester5And6FolderPathsDto)getPathsOfFolders.get("Semester5And6");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Compiler Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Operating Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Web Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Artificial Intelligence":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Compiler Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Operating Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Communication and Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Web Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Artificial Intelligence":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Microwave Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Information Theory and Coding":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Signal Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "VLSI Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Communication and Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Antenna and Wave Propagation":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;
			case "EEE":
				switch (subject) {
				case "Power System – II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Utilization  of  Electrical  Energy  and  Electric Traction":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Signal Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "VLSI Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Microprocessor and Microcontroller":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power Station Practice":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;

				
			default:
				break;
			}
			break;
		
		case "7":
			bTechSemester7And8FolderPathsDto = (BTechSemester7And8FolderPathsDto)getPathsOfFolders.get("Semester7And8");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Information Security":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Software Testing and Quality Assurance":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Wireless Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Complexity Theory":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Intellectual Property Rights":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Embedded Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Mining and Business Intelligence":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced Computer Architecture":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Natural Language Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Signal Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Simulation and Modelling":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced DBMS":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Parallel Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced Computer Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Control System":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Cryptography and Network Security":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Wireless Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Cloud Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Distributed Databases":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Embedded Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Semantic Web Technologies":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Software Testing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case ".NET and C# Programming":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Signal Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Enterprise Computing in Java":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "System and Network Administration":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Grid Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced Computer Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced Database Administration":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Probablistic Graphical Models":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Advanced DSP":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Wireless Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction to MEMS":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced VLSI Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Embedded Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Biomedical Instrumentation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "PLC and SCADA Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power Electronics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "RF Devices and Circuits":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Database Management System":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Renewable Energy Resources":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Grid Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Project Management":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Economics for Engineers":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Parallel Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Selected topics in ECE**":
					path=Paths.get(""+file.getOriginalFilename());break; 
				case "Sociology and Elements of Indian History":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;
			
			case "EEE":
				switch (subject) {
				case "Electrical Drives":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Advanced Control Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "EHV AC and HVDC Transmissions":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power Distribution System":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Telemetry and Data Acquisition Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Biomedical Instrumentation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "PLC and SCADA Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Mechatronics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "High Voltage Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Database Management System":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Renewable Energy Resources":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Selected topics in EEE**":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital System Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power line Carrier Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Machines Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}

				break;

				
			default:
				break;
			}
			break;
		
		case "8":
			bTechSemester7And8FolderPathsDto = (BTechSemester7And8FolderPathsDto)getPathsOfFolders.get("Semester7And8");
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Mobile Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Machine Learning":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Image Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Microelectronics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Soft Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "VLSI Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Distributed Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Object Oriented Software Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Vision":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Software Project Management":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Computer Interaction":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Information Theory and Coding":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Web Intelligence and Big Data":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Service Oriented Architecture":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Multiagent Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Principles of Programming Languages":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Telecommunication Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Mobile Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Big Data Analytics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Image Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Social Network Analysis":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Soft Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "VLSI Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Distributed Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Bio Informatics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Web Application development using .NET":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Next Generation Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Computer Interaction":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Information Theory and Coding":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "GPS and GIS":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Satellite Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "E-Commerce and M-Commerce":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Mobile Computing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Consumer Electronics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Image Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "ASIC Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Introduction to Nanotechnology":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Adaptive Signal Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Robotics":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Computer Graphics and Multimedia":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Next Generation Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "GPS and GIS":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Satellite Communication":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Neuro-Fuzzy Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power System Operation and Control":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Image Processing":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Application   of   Power Electronics to Power Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Reliability   Engineering   and   Application to Power System":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Machine - III":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Energy Conservation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power System Analysis and Stability":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical System Design":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Embedded Systems":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Data Communication and Networks":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Object Oriented Programming Using C++":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Power Plant Instrumentation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Intelligent and Smart Instrumentation":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Digital Communication":
					path=Paths.get(""+file.getOriginalFilename());break;
				case "Electrical Power Quality":
					path=Paths.get(""+file.getOriginalFilename());break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;

			
			
		default:	// Default of semester
			break;
		}
		}
		else if(course.equalsIgnoreCase("BBA"))
		{
			
		}
		else if(course.equalsIgnoreCase("MBA"))
		{
			
		}
		else
		{
			/*
			 * Unknown course fetched
			 */
		}
		
		/*
		 * Save file on server 
		 */
		
		String status=librarySaveFileService.saveFile(file, path);
		if(status==null)
		{
			/*
			 * An error occcurred while saving file on system
			 */
		}
		
		
		
		
		
		
		
		
		/*
		 * DONT WRITE ANY CODE BELOW THIS POINT ADD CODE AVOVE HERE ONLY 
		 * ELSE MERGING CONFLICT WILL ARISE LATER ON 
		 * IN CASE YOU NEED ANY HELP OR CLARIT REGARDING THIS LET ME KNOW
		 */
		
		
		
		
		
		
		/*
		 * Now code to insert data in database 
		 */
		
		
		
		
		
		
		
		return null;
	}
}
