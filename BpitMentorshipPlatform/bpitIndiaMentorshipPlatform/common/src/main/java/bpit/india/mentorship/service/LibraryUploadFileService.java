package bpit.india.mentorship.service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import bpit.india.mentorship.dao.LibraryUploadFileDao;
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
	private LibraryUploadFileDao libraryUploadFileDao;
	
	public String uploadFile(MultipartFile file,String branch,String subject,String category,String fileName,String semester)
	{
		HashMap<String, Object> getPathsOfFolders = new HashMap<String, Object>();
		
		String course="";
		/*
		 * Get couse corresponding to userId from session
		 */
		
		Path path=Paths.get("");
		
		
		BTechSemester1And2FolderPathsDto bTechSemester1And2FolderPathsDto;
		BTechSemester3And4FolderPathsDto bTechSemester3And4FolderPathsDto;
		BTechSemester5And6FolderPathsDto bTechSemester5And6FolderPathsDto;
		BTechSemester7And8FolderPathsDto bTechSemester7And8FolderPathsDto;
		

		
		
		String extension=file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
		
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
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEAMFolder()+ fileName+extension); 
					break;
				case "Applied Physics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEAPFolder()+ fileName+extension);
					break;
				case "Electrical Technology":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEETFolder()+ fileName+extension);
					break;
				case "Manufacturing Processes":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEMPFolder()+fileName+extension);
					break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEHVPEFolder()+fileName+extension);break;
				case "Fundamentals Of Computing":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEFOCFolder()+fileName+extension);break;
				case "Applied Chemistry":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEACFolder()+fileName+extension);break;
				case "Engineering Graphics Lab":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1CSEEGFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITAMFolder()+fileName+extension);break;
				case "Applied Physics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITAPFolder()+fileName+extension);break;
				case "Electrical Technology":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITETFolder()+fileName+extension);break;
				case "Manufacturing Processes":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITMPFolder()+fileName+extension);break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITHVPEFolder()+fileName+extension);break;
				case "Fundamentals Of Computing":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITFOCFolder()+fileName+extension);break;
				case "Applied Chemistry":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITACFolder()+fileName+extension);break;
				case "Engineering Graphics Lab":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ITEGFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEAMFolder()+fileName+extension);break;
				case "Applied Physics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEAPFolder()+fileName+extension);break;
				case "Electrical Technology":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEETFolder()+fileName+extension);break;
				case "Manufacturing Processes":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEMPFolder()+fileName+extension);break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEHVPEFolder()+fileName+extension);break;
				case "Fundamentals Of Computing":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEFOCFolder()+fileName+extension);break;
				case "Applied Chemistry":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEACFolder()+fileName+extension);break;
				case "Engineering Graphics Lab":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1ECEEGFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEAMFolder()+fileName+extension);break;
				case "Applied Physics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEAPFolder()+fileName+extension);break;
				case "Electrical Technology":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEETFolder()+fileName+extension);break;
				case "Manufacturing Processes":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEMPFolder()+fileName+extension);break;
				case "Human Values & Professional Ethics - I":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEHVPEFolder()+fileName+extension);break;
				case "Fundamentals Of Computing":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEFOCFolder()+fileName+extension);break;
				case "Applied Chemistry":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEACFolder()+fileName+extension);break;
				case "Engineering Graphics Lab":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester1EEEEGFolder()+fileName+extension);break;
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
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEAMFolder()+fileName+extension);break;
				case "Applied Physics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEAPFolder()+fileName+extension);break;
				case "Electronic Devices":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEEDFolder()+fileName+extension);break;
				case "Introduction To Programming":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEIPFolder()+fileName+extension);break;
				case "Engineering Mechanics":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEEMFolder()+fileName+extension);break;
				case "Communications Skills":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSECSFolder()+fileName+extension);break;
				case "Environmental Studies":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2CSEEVSFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITAMFolder()+fileName+extension);break;
				case "Applied Physics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITAPFolder()+fileName+extension);break;
				case "Electronic Devices":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITEDFolder()+fileName+extension);break;
				case "Introduction To Programming":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITIPFolder()+fileName+extension);break;
				case "Engineering Mechanics":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITEMFolder()+fileName+extension);break;
				case "Communications Skills":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITCSFolder()+fileName+extension);break;
				case "Environmental Studies":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ITEVSFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEAMFolder()+fileName+extension);break;
				case "Applied Physics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEAPFolder()+fileName+extension);break;
				case "Electronic Devices":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEEDFolder()+fileName+extension);break;
				case "Introduction To Programming":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEIPFolder()+fileName+extension);break;
				case "Engineering Mechanics":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEEMFolder()+fileName+extension);break;
				case "Communications Skills":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECECSFolder()+fileName+extension);break;
				case "Environmental Studies":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2ECEEVSFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEAMFolder()+fileName+extension);break;
				case "Applied Physics - II":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEAPFolder()+fileName+extension);break;
				case "Electronic Devices":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEEDFolder()+fileName+extension);break;
				case "Introduction To Programming":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEIPFolder()+fileName+extension);break;
				case "Engineering Mechanics":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEEMFolder()+fileName+extension);break;
				case "Communications Skills":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEECSFolder()+fileName+extension);break;
				case "Environmental Studies":
					path=Paths.get(bTechSemester1And2FolderPathsDto.getSemester2EEEEVSFolder()+fileName+extension);break;
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
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSEAMFolder()+fileName+extension);break;
				case "Foundation Of Computer Science":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSEFOCSFolder()+fileName+extension);break;
				case "Switching Theory And Logic Design":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSESTLDFolder()+fileName+extension);break;
				case "Circuits And Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSECNSFolder()+fileName+extension);break;
				case "Data Structure":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSEDSFolder()+fileName+extension);break;
				case "Computer Graphics And Multimedia":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3CSECGFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITAMFolder()+fileName+extension);break;
				case "Foundation Of Computer Science":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITFOCSFolder()+fileName+extension);break;
				case "Switching Theory And Logic Design":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITSTLDFolder()+fileName+extension);break;
				case "Circuits And Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITCNSFolder()+fileName+extension);break;
				case "Data Structure":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITDSFolder()+fileName+extension);break;
				case "Computer Graphics And Multimedia":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ITCGFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECEAMFolder()+fileName+extension);break;
				case "Analog Electronics - I":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECEAEFolder()+fileName+extension);break;
				case "Switching Theory And Logic Design":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECESTLDFolder()+fileName+extension);break;
				case "Electronic Instruments and Measurements":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECEEIMFolder()+fileName+extension);break;
				case "Data Structure":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECEDSFolder()+fileName+extension);break;
				case "Signals and Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3ECESNSFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - III":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEEAMFolder()+fileName+extension);break;
				case "Analog Electronics - I":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEEAEFolder()+fileName+extension);break;
				case "Materials in Electrical Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEEMESFolder()+fileName+extension);break;
				case "Electrical Machines-I":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEEEMFolder()+fileName+extension);break;
				case "Data Structure":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEEDSFolder()+fileName+extension);break;
				case "Circuits And Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester3EEECNSFolder()+fileName+extension);break;
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
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSEAMFolder()+fileName+extension);break;
				case "Computer Organization And Architecture":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSECOAFolder()+fileName+extension);break;
				case "Theory Of Computation":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSETOCFolder()+fileName+extension);break;
				case "Database Management Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSEDBMSFolder()+fileName+extension);break;
				case "Communication Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSECSFolder()+fileName+extension);break;
				case "Object Oriented Programming":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4CSEOOPFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - IV":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITAMFolder()+fileName+extension);break;
				case "Computer Organization And Architecture":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITCOAFolder()+fileName+extension);break;
				case "Theory Of Computation":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITTOCFolder()+fileName+extension);break;
				case "Database Management Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITDBMSFolder()+fileName+extension);break;
				case "Communication Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITCSFolder()+fileName+extension);break;
				case "Object Oriented Programming":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ITOOPFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - IV":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECEAMFolder()+fileName+extension);break;
				case "Computer Organization And Architecture":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECECOAFolder()+fileName+extension);break;
				case "Analog Electronics – II":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECEAEFolder()+fileName+extension);break;
				case "Network Analysis and Synthesis":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECENASFolder()+fileName+extension);break;
				case "Communication Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECECSFolder()+fileName+extension);break;
				case "Electromagnetic Field Theory":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4ECEEFTFolder()+fileName+extension);break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Electrical Machines-II":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEEEMFolder()+fileName+extension);break;
				case "Power System– I":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEEPSFolder()+fileName+extension);break;
				case "Electrical   and   Electronics   Measuring Instruments":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEEEEMIFolder()+fileName+extension);break;
				case "Database Management Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEEDBMSFolder()+fileName+extension);break;
				case "Electromagnetic Field Theory":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEEEFTFolder()+fileName+extension);break;
				case "Control Systems":
					path=Paths.get(bTechSemester3And4FolderPathsDto.getSemester4EEECSFolder()+fileName+extension);break;
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
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSEADAFolder()+fileName+extension);break;
				case "Communication Skills For Professionals":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSECSPFolder()+fileName+extension);break;
				case "Software Engineering":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSESEFolder()+fileName+extension);break;
				case "Digital Communication":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSEDCFolder()+fileName+extension);break;
				case "Java Programming":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSEJPFolder()+fileName+extension);break;
				case "Industrial Management":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5CSEIMFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Algorithms Design And Analysis":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITADAFolder()+fileName+extension);break;
				case "Communication Skills For Professionals":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITCSPFolder()+fileName+extension);break;
				case "Software Engineering":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITSEFolder()+fileName+extension);break;
				case "Digital Communication":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITDCFolder()+fileName+extension);break;
				case "Java Programming":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITJPFolder()+fileName+extension);break;
				case "Industrial Management":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ITIMFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Microprocessors and Microcontrollers":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECEMNMFolder()+fileName+extension);break;
				case "Communication Skills For Professionals":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECECSPFolder()+fileName+extension);break;
				case "Control Systems":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECECSFolder()+fileName+extension);break;
				case "Digital Communication":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECEDCFolder()+fileName+extension);break;
				case "Digital System Design":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECEDSDFolder()+fileName+extension);break;
				case "Industrial Management":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5ECEIMFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Power Electronics":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEEPEFolder()+fileName+extension);break;
				case "Communication Skills For Professionals":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEECSPFolder()+fileName+extension);break;
				case "Sensors and Transducers":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEESNTFolder()+fileName+extension);break;
				case "Digital Communication":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEEDCFolder()+fileName+extension);break;
				case "Switching Theory and Logic Design":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEESTLDFolder()+fileName+extension);break;
				case "Industrial Management":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester5EEEIMFolder()+fileName+extension);break;

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
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6CSECDFolder()+fileName+extension);break;
				case "Operating Systems":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6CSEOSFolder()+fileName+extension);break;
				case "Computer Networks":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6CSECNFolder()+fileName+extension);break;
				case "Web Engineering":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6CSEWEFolder()+fileName+extension);break;
				case "Artificial Intelligence":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6CSEAIFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Compiler Design":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ITCDFolder()+fileName+extension);break;
				case "Operating Systems":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ITOSFolder()+fileName+extension);break;
				case "Data Communication and Networks":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ITDCNFolder()+fileName+extension);break;
				case "Web Engineering":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ITWEFolder()+fileName+extension);break;
				case "Artificial Intelligence":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ITAIFolder()+fileName+extension);break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Microwave Engineering":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEMEFolder()+fileName+extension);break;
				case "Information Theory and Coding":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEITCFolder()+fileName+extension);break;
				case "Digital Signal Processing":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEDSPFolder()+fileName+extension);break;
				case "VLSI Design":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEVLSIDFolder()+fileName+extension);break;
				case "Data Communication and Networks":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEDCNFolder()+fileName+extension);break;
				case "Antenna and Wave Propagation":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6ECEANWPFolder()+fileName+extension);break;

				default:
					break;
				}

				break;
			case "EEE":
				switch (subject) {
				case "Power System – II":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEPSFolder()+fileName+extension);break;
				case "Utilization  of  Electrical  Energy  and  Electric Traction":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEUEEETFolder()+fileName+extension);break;
				case "Digital Signal Processing":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEDSPFolder()+fileName+extension);break;
				case "VLSI Design":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEVLSIDFolder()+fileName+extension);break;
				case "Microprocessor and Microcontroller":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEMNMFolder()+fileName+extension);break;
				case "Power Station Practice":
					path=Paths.get(bTechSemester5And6FolderPathsDto.getSemester6EEEPSPFolder()+fileName+extension);break;

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
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEISFolder()+fileName+extension);break;
				case "Software Testing and Quality Assurance":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSESTQAFolder()+fileName+extension);break;
				case "Wireless Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEWCFolder()+fileName+extension);break;
				case "Complexity Theory":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSECTFolder()+fileName+extension);break;
				case "Intellectual Property Rights":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEIPRFolder()+fileName+extension);break;
				case "Embedded Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEESFolder()+fileName+extension);break;
				case "Data Mining and Business Intelligence":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEDMBIFolder()+fileName+extension);break;
				case "Advanced Computer Architecture":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEACAFolder()+fileName+extension);break;
				case "Natural Language Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSENLPFolder()+fileName+extension);break;
				case "Digital Signal Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEDSPFolder()+fileName+extension);break;
				case "Simulation and Modelling":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSESMFolder()+fileName+extension);break;
				case "Advanced DBMS":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEADBMSFolder()+fileName+extension);break;
				case "Parallel Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEPCFolder()+fileName+extension);break;
				case "Advanced Computer Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSEACNFolder()+fileName+extension);break;
				case "Control System":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSECSFolder()+fileName+extension);break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7CSESEIHFEFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Cryptography and Network Security":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITCNSFolder()+fileName+extension);break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITOOCFolder()+fileName+extension);break;
				case "Wireless Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITWCFolder()+fileName+extension);break;
				case "Cloud Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITCCFolder()+fileName+extension);break;
				case "Distributed Databases":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITDDFolder()+fileName+extension);break;
				case "Embedded Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITESFolder()+fileName+extension);break;
				case "Semantic Web Technologies":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITSWTFolder()+fileName+extension);break;
				case "Software Testing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITSTFolder()+fileName+extension);break;
				case ".NET and C# Programming":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITNCFolder()+fileName+extension);break;
				case "Digital Signal Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITDSPFolder()+fileName+extension);break;
				case "Enterprise Computing in Java":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITECJFolder()+fileName+extension);break;
				case "System and Network Administration":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITSNAFolder()+fileName+extension);break;
				case "Grid Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITGCFolder()+fileName+extension);break;
				case "Advanced Computer Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITACNFolder()+fileName+extension);break;
				case "Advanced Database Administration":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITADAFolder()+fileName+extension);break;
				case "Probablistic Graphical Models":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITPGMFolder()+fileName+extension);break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ITSEIHFEFolder()+fileName+extension);break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Advanced DSP":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEADSPFolder()+fileName+extension);break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEOOCFolder()+fileName+extension);break;
				case "Wireless Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEWCFolder()+fileName+extension);break;
				case "Introduction to MEMS":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEIMEMSFolder()+fileName+extension);break;
				case "Advanced VLSI Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEAVLSIDFolder()+fileName+extension);break;
				case "Embedded Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEESFolder()+fileName+extension);break;
				case "Biomedical Instrumentation":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEBIFolder()+fileName+extension);break;
				case "PLC and SCADA Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEPNSSFolder()+fileName+extension);break;
				case "Power Electronics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEPEFolder()+fileName+extension);break;
				case "RF Devices and Circuits":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECERFDCFolder()+fileName+extension);break;
				case "Database Management System":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEDBMSFolder()+fileName+extension);break;
				case "Renewable Energy Resources":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECERERFolder()+fileName+extension);break;
				case "Grid Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEGCFolder()+fileName+extension);break;
				case "Project Management":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEPMFolder()+fileName+extension);break;
				case "Economics for Engineers":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEEFEFolder()+fileName+extension);break;
				case "Parallel Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECEPCFolder()+fileName+extension);break;
				case "Selected topics in ECE**":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECESTECEFolder()+fileName+extension);break; 
				case "Sociology and Elements of Indian History":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7ECESEIHFolder()+fileName+extension);break;

				default:
					break;
				}

				break;
			
			case "EEE":
				switch (subject) {
				case "Electrical Drives":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEEDFolder()+fileName+extension);break;
				case "Optoelectronics and Optical Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEOOCFolder()+fileName+extension);break;
				case "Advanced Control Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEACSFolder()+fileName+extension);break;
				case "EHV AC and HVDC Transmissions":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEEAHTFolder()+fileName+extension);break;
				case "Power Distribution System":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEPDSFolder()+fileName+extension);break;
				case "Telemetry and Data Acquisition Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEETDASFolder()+fileName+extension);break;
				case "Biomedical Instrumentation":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEBIFolder()+fileName+extension);break;
				case "PLC and SCADA Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEPNSSFolder()+fileName+extension);break;
				case "Mechatronics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEMTFolder()+fileName+extension);break;
				case "High Voltage Engineering":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEHVEFolder()+fileName+extension);break;
				case "Database Management System":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEDBMSFolder()+fileName+extension);break;
				case "Renewable Energy Resources":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEERERFolder()+fileName+extension);break;
				case "Selected topics in EEE**":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEESTEEEFolder()+fileName+extension);break;
				case "Digital System Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEDSDFolder()+fileName+extension);break;
				case "Power line Carrier Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEPLCCFolder()+fileName+extension);break;
				case "Electrical Machines Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEEEMDFolder()+fileName+extension);break;
				case "Sociology and Elements of Indian History for Engineers":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester7EEESEIHFEFolder()+fileName+extension);break;

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
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEMCFolder()+fileName+extension);break;
				case "Machine Learning":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEMLFolder()+fileName+extension);break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEHVPEFolder()+fileName+extension);break;
				case "Digital Image Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEDIPFolder()+fileName+extension);break;
				case "Microelectronics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEMEFolder()+fileName+extension);break;
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEAHSNFolder()+fileName+extension);break;
				case "Soft Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSESCFolder()+fileName+extension);break;
				case "VLSI Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEVLSIDFolder()+fileName+extension);break;
				case "Distributed Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEDSFolder()+fileName+extension);break;
				case "Object Oriented Software Engineering":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEOOSEFolder()+fileName+extension);break;
				case "Computer Vision":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSECVFolder()+fileName+extension);break;
				case "Software Project Management":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSESPMFolder()+fileName+extension);break;
				case "Human Computer Interaction":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEHCIFolder()+fileName+extension);break;
				case "Information Theory and Coding":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEITCFolder()+fileName+extension);break;
				case "Web Intelligence and Big Data":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEWIBDFolder()+fileName+extension);break;
				case "Service Oriented Architecture":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSESOAFolder()+fileName+extension);break;
				case "Multiagent Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEMSFolder()+fileName+extension);break;
				case "Principles of Programming Languages":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSEPPLFolder()+fileName+extension);break;
				case "Telecommunication Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSETNFolder()+fileName+extension);break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8CSERTCSEFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Mobile Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITMCFolder()+fileName+extension);break;
				case "Big Data Analytics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITBDAFolder()+fileName+extension);break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITHVPEFolder()+fileName+extension);break;
				case "Digital Image Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITDIPFolder()+fileName+extension);break;
				case "Social Network Analysis":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITSNAFolder()+fileName+extension);break; 
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITAHSNFolder()+fileName+extension);break;
				case "Soft Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITSCFolder()+fileName+extension);break;
				case "VLSI Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITVLSIDFolder()+fileName+extension);break;
				case "Distributed Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITDSFolder()+fileName+extension);break;
				case "Bio Informatics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITBIFolder()+fileName+extension);break;
				case "Web Application development using .NET":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITWADUNFolder()+fileName+extension);break;
				case "Next Generation Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITNGNFolder()+fileName+extension);break;
				case "Human Computer Interaction":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITHCIFolder()+fileName+extension);break;
				case "Information Theory and Coding":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITITCFolder()+fileName+extension);break;
				case "GPS and GIS":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITGNGFolder()+fileName+extension);break;
				case "Satellite Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITSCFolder()+fileName+extension);break;
				case "E-Commerce and M-Commerce":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITECNMCFolder()+fileName+extension);break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ITSTCFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Mobile Computing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEMCFolder()+fileName+extension);break;
				case "Consumer Electronics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECECEFolder()+fileName+extension);break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEHVPEFolder()+fileName+extension);break;
				case "Digital Image Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEDIPFolder()+fileName+extension);break;
				case "ASIC Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEASICDFolder()+fileName+extension);break;
				case "Ad Hoc and Sensor Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEAHSNFolder()+fileName+extension);break;
				case "Introduction to Nanotechnology":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEINFolder()+fileName+extension);break;
				case "Adaptive Signal Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEASPFolder()+fileName+extension);break;
				case "Robotics":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECERTFolder()+fileName+extension);break;
				case "Computer Graphics and Multimedia":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECECGNMFolder()+fileName+extension);break;
				case "Next Generation Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECENGNFolder()+fileName+extension);break;
				case "GPS and GIS":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECEGNGFolder()+fileName+extension);break;
				case "Satellite Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8ECESTCFolder()+fileName+extension);break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Neuro-Fuzzy Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEENFSFolder()+fileName+extension);break;
				case "Power System Operation and Control":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEPSOCFolder()+fileName+extension);break;
				case "Human Values and Professional Ethics-II":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEHVPEFolder()+fileName+extension);break;
				case "Digital Image Processing":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEDIPFolder()+fileName+extension);break;
				case "Application   of   Power Electronics to Power Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEAPEPSFolder()+fileName+extension);break;
				case "Reliability   Engineering   and   Application to Power System":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEREAPSFolder()+fileName+extension);break;
				case "Electrical Machine - III":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEEMFolder()+fileName+extension);break;
				case "Electrical Energy Conservation":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEEECFolder()+fileName+extension);break;
				case "Power System Analysis and Stability":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEPSASFolder()+fileName+extension);break;
				case "Electrical System Design":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEESDFolder()+fileName+extension);break;
				case "Embedded Systems":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEESFolder()+fileName+extension);break;
				case "Data Communication and Networks":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEDCNFolder()+fileName+extension);break;
				case "Object Oriented Programming Using C++":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEOOPCFolder()+fileName+extension);break;
				case "Power Plant Instrumentation":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEPPIFolder()+fileName+extension);break;
				case "Intelligent and Smart Instrumentation":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEISIFolder()+fileName+extension);break;
				case "Digital Communication":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEDCFolder()+fileName+extension);break;
				case "Electrical Power Quality":
					path=Paths.get(bTechSemester7And8FolderPathsDto.getSemester8EEEEPQFolder()+fileName+extension);break;

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
		
		
String userId="";
		
		/*
		 * Get userId directly from session
		 */
		
		HashMap<String, Object> setDataForLibrary = new HashMap<String, Object>();
		setDataForLibrary.put("fileName", fileName);
		setDataForLibrary.put("category", category);
		setDataForLibrary.put("semester", semester);
		setDataForLibrary.put("branch", branch);
		setDataForLibrary.put("subject", subject);
		setDataForLibrary.put("userId", userId);
		setDataForLibrary.put("course", course);
		setDataForLibrary.put("locationOfUploadedFile", path.toString());
		int insertIntoLibraryStatus = libraryUploadFileDao.insertIntoLibrary(setDataForLibrary);
		if(insertIntoLibraryStatus==-1)
		{
			/*
			 * An error occurred while inserting data in Library table
			 */
		}
		
		
		
		
		return null;
	}
}
