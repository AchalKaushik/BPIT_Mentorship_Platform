package bpit.india.mentorship.service;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibraryUploadFileService {

	@Autowired
	private LibrarySaveFileService librarySaveFileService;
	
	public String uploadFile(MultipartFile file,String branch,String subject,String category,String fileName,String semester)
	{
		String course="";
		/*
		 * Get couse corresponding to userId from session
		 */
		
		Path path=Paths.get("");
		
		if(course.equalsIgnoreCase("BTech"))
		{
		switch (semester) {
		case "1":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - I":
					/*
					 * Get path of Btech->Sem1->cse->AM1 folder from dto
					 * Set Path variable using that path 
					 */
					path=Paths.get("get path from dto"+ file.getOriginalFilename());
					break;
				case "Applied Physics - I":
					break;
				case "Electrical Technology":
					break;
				case "Manufacturing Processes":
					break;
				case "Human Values & Professional Ethics - I":
					break;
				case "Fundamentals Of Computing":
					break;
				case "Applied Chemistry":
					break;
				case "Engineering Graphics Lab":
					break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - I":
					break;
				case "Applied Physics - I":
					break;
				case "Electrical Technology":
					break;
				case "Manufacturing Processes":
					break;
				case "Human Values & Professional Ethics - I":
					break;
				case "Fundamentals Of Computing":
					break;
				case "Applied Chemistry":
					break;
				case "Engineering Graphics Lab":
					break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - I":
					break;
				case "Applied Physics - I":
					break;
				case "Electrical Technology":
					break;
				case "Manufacturing Processes":
					break;
				case "Human Values & Professional Ethics - I":
					break;
				case "Fundamentals Of Computing":
					break;
				case "Applied Chemistry":
					break;
				case "Engineering Graphics Lab":
					break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - I":
					break;
				case "Applied Physics - I":
					break;
				case "Electrical Technology":
					break;
				case "Manufacturing Processes":
					break;
				case "Human Values & Professional Ethics - I":
					break;
				case "Fundamentals Of Computing":
					break;
				case "Applied Chemistry":
					break;
				case "Engineering Graphics Lab":
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break; // End of case 1 (semester)
		
		case "2":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - II":
					break;
				case "Applied Physics - II":
					break;
				case "Electronic Devices":
					break;
				case "Introduction To Programming":
					break;
				case "Engineering Mechanics":
					break;
				case "Communications Skills":
					break;
				case "Environmental Studies":
					break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - II":
					break;
				case "Applied Physics - II":
					break;
				case "Electronic Devices":
					break;
				case "Introduction To Programming":
					break;
				case "Engineering Mechanics":
					break;
				case "Communications Skills":
					break;
				case "Environmental Studies":
					break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - II":
					break;
				case "Applied Physics - II":
					break;
				case "Electronic Devices":
					break;
				case "Introduction To Programming":
					break;
				case "Engineering Mechanics":
					break;
				case "Communications Skills":
					break;
				case "Environmental Studies":
					break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - II":
					break;
				case "Applied Physics - II":
					break;
				case "Electronic Devices":
					break;
				case "Introduction To Programming":
					break;
				case "Engineering Mechanics":
					break;
				case "Communications Skills":
					break;
				case "Environmental Studies":
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break;
		
		case "3":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - III":
					break;
				case "Foundation Of Computer Science":
					break;
				case "Switching Theory And Logic Design":
					break;
				case "Circuits And Systems":
					break;
				case "Data Structure":
					break;
				case "Computer Graphics And Multimedia":
					break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - III":
					break;
				case "Foundation Of Computer Science":
					break;
				case "Switching Theory And Logic Design":
					break;
				case "Circuits And Systems":
					break;
				case "Data Structure":
					break;
				case "Computer Graphics And Multimedia":
					break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - III":
					break;
				case "Analog Electronics - I":
					break;
				case "Switching Theory And Logic Design":
					break;
				case "Electronic Instruments and Measurements":
					break;
				case "Data Structure":
					break;
				case "Signals and Systems":
					break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Applied Mathematics - III":
					break;
				case "Analog Electronics - I":
					break;
				case "Switching Theory And Logic Design":
					break;
				case "Electronic Instruments and Measurements":
					break;
				case "Data Structure":
					break;
				case "Signals and Systems":
					break;
				default:
					break;
				}
				break;
				
			default:
				break;
			}
			break;
		
		case "4":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Applied Mathematics - IV":
					break;
				case "Computer Organization And Architecture":
					break;
				case "Theory Of Computation":
					break;
				case "Database Management Systems":
					break;
				case "Communication Systems":
					break;
				case "Object Oriented Programming":
					break;
				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Applied Mathematics - IV":
					break;
				case "Computer Organization And Architecture":
					break;
				case "Theory Of Computation":
					break;
				case "Database Management Systems":
					break;
				case "Communication Systems":
					break;
				case "Object Oriented Programming":
					break;
				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Applied Mathematics - IV":
					break;
				case "Computer Organization And Architecture":
					break;
				case "Analog Electronics – II":
					break;
				case "Network Analysis and Synthesis":
					break;
				case "Communication Systems":
					break;
				case "Electromagnetic Field Theory":
					break;
				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Electrical Machines-II":
					break;
				case "Power System– I":
					break;
				case "Electrical   and   Electronics   Measuring Instruments":
					break;
				case "Database Management Systems":
					break;
				case "Electromagnetic Field Theory":
					break;
				case "Control Systems":
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break;
		
		case "5":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Algorithms Design And Analysis":
					break;
				case "Communication Skills For Professionals":
					break;
				case "Software Engineering":
					break;
				case "Digital Communication":
					break;
				case "Java Programming":
					break;
				case "Industrial Management":
					break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Algorithms Design And Analysis":
					break;
				case "Communication Skills For Professionals":
					break;
				case "Software Engineering":
					break;
				case "Digital Communication":
					break;
				case "Java Programming":
					break;
				case "Industrial Management":
					break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Microprocessors and Microcontrollers":
					break;
				case "Communication Skills For Professionals":
					break;
				case "Control Systems":
					break;
				case "Digital Communication":
					break;
				case "Digital System Design":
					break;
				case "Industrial Management":
					break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Power Electronics":
					break;
				case "Communication Skills For Professionals":
					break;
				case "Sensors and Transducers":
					break;
				case "Digital Communication":
					break;
				case "Switching Theory and Logic Design":
					break;
				case "Industrial Management":
					break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;
		
		case "6":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Compiler Design":
					break;
				case "Operating Systems":
					break;
				case "Computer Networks":
					break;
				case "Web Engineering":
					break;
				case "Artificial Intelligence":
					break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Compiler Design":
					break;
				case "Operating Systems":
					break;
				case "Data Communication and Networks":
					break;
				case "Web Engineering":
					break;
				case "Artificial Intelligence":
					break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Microwave Engineering":
					break;
				case "Information Theory and Coding":
					break;
				case "Digital Signal Processing":
					break;
				case "VLSI Design":
					break;
				case "Data Communication and Networks":
					break;
				case "Antenna and Wave Propagation":
					break;

				default:
					break;
				}

				break;
			case "EEE":
				switch (subject) {
				case "Power System – II":
					break;
				case "Utilization  of  Electrical  Energy  and  Electric Traction":
					break;
				case "Digital Signal Processing":
					break;
				case "VLSI Design":
					break;
				case "Microprocessor and Microcontroller":
					break;
				case "Power Station Practice":
					break;

				default:
					break;
				}

				break;

				
			default:
				break;
			}
			break;
		
		case "7":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Information Security":
					break;
				case "Software Testing and Quality Assurance":
					break;
				case "Wireless Communication":
					break;
				case "Complexity Theory":
					break;
				case "Intellectual Property Rights":
					break;
				case "Embedded Systems":
					break;
				case "Data Mining and Business Intelligence":
					break;
				case "Advanced Computer Architecture":
					break;
				case "Natural Language Processing":
					break;
				case "Digital Signal Processing":
					break;
				case "Simulation and Modelling":
					break;
				case "Advanced DBMS":
					break;
				case "Parallel Computing":
					break;
				case "Advanced Computer Networks":
					break;
				case "Control System":
					break;
				case "Sociology and Elements of Indian History for Engineers":
					break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Cryptography and Network Security":
					break;
				case "Optoelectronics and Optical Communication":
					break;
				case "Wireless Communication":
					break;
				case "Cloud Computing":
					break;
				case "Distributed Databases":
					break;
				case "Embedded Systems":
					break;
				case "Semantic Web Technologies":
					break;
				case "Software Testing":
					break;
				case ".NET and C# Programming":
					break;
				case "Digital Signal Processing":
					break;
				case "Enterprise Computing in Java":
					break;
				case "System and Network Administration":
					break;
				case "Grid Computing":
					break;
				case "Advanced Computer Networks":
					break;
				case "Advanced Database Administration":
					break;
				case "Probablistic Graphical Models":
					break;
				case "Sociology and Elements of Indian History for Engineers":
					break;

				default:
					break;
				}

				break;
			case "ECE":
				switch (subject) {
				case "Advanced DSP":
					break;
				case "Optoelectronics and Optical Communication":
					break;
				case "Wireless Communication":
					break;
				case "Introduction to MEMS":
					break;
				case "Advanced VLSI Design":
					break;
				case "Embedded Systems":
					break;
				case "Biomedical Instrumentation":
					break;
				case "PLC and SCADA Systems":
					break;
				case "Power Electronics":
					break;
				case "RF Devices and Circuits":
					break;
				case "Database Management System":
					break;
				case "Renewable Energy Resources":
					break;
				case "Grid Computing":
					break;
				case "Project Management":
					break;
				case "Economics for Engineers":
					break;
				case "Parallel Computing":
					break;
				case "Selected topics in ECE**":
					break; 
				case "Sociology and Elements of Indian History":
					break;

				default:
					break;
				}

				break;
			
			case "EEE":
				switch (subject) {
				case "Electrical Drives":
					break;
				case "Optoelectronics and Optical Communication":
					break;
				case "Advanced Control Systems":
					break;
				case "EHV AC and HVDC Transmissions":
					break;
				case "Power Distribution System":
					break;
				case "Telemetry and Data Acquisition Systems":
					break;
				case "Biomedical Instrumentation":
					break;
				case "PLC and SCADA Systems":
					break;
				case "Mechatronics":
					break;
				case "High Voltage Engineering":
					break;
				case "Database Management System":
					break;
				case "Renewable Energy Resources":
					break;
				case "Selected topics in EEE**":
					break;
				case "Digital System Design":
					break;
				case "Power line Carrier Communication":
					break;
				case "Electrical Machines Design":
					break;
				case "Sociology and Elements of Indian History for Engineers":
					break;

				default:
					break;
				}

				break;

				
			default:
				break;
			}
			break;
		
		case "8":
			switch (branch) {
			case "CSE":
				switch (subject) {
				case "Mobile Computing":
					break;
				case "Machine Learning":
					break;
				case "Human Values and Professional Ethics-II":
					break;
				case "Digital Image Processing":
					break;
				case "Microelectronics":
					break;
				case "Ad Hoc and Sensor Networks":
					break;
				case "Soft Computing":
					break;
				case "VLSI Design":
					break;
				case "Distributed Systems":
					break;
				case "Object Oriented Software Engineering":
					break;
				case "Computer Vision":
					break;
				case "Software Project Management":
					break;
				case "Human Computer Interaction":
					break;
				case "Information Theory and Coding":
					break;
				case "Web Intelligence and Big Data":
					break;
				case "Service Oriented Architecture":
					break;
				case "Multiagent Systems":
					break;
				case "Principles of Programming Languages":
					break;
				case "Telecommunication Networks":
					break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					break;

				default:
					break;
				}
				break;
			case "IT":
				switch (subject) {
				case "Mobile Computing":
					break;
				case "Big Data Analytics":
					break;
				case "Human Values and Professional Ethics-II":
					break;
				case "Digital Image Processing":
					break;
				case "Social Network Analysis":
					break;
				case "Ad Hoc and Sensor Networks":
					break;
				case "Soft Computing":
					break;
				case "VLSI Design":
					break;
				case "Distributed Systems":
					break;
				case "Bio Informatics":
					break;
				case "Web Application development using .NET":
					break;
				case "Next Generation Networks":
					break;
				case "Human Computer Interaction":
					break;
				case "Information Theory and Coding":
					break;
				case "GPS and GIS":
					break;
				case "Satellite Communication":
					break;
				case "E-Commerce and M-Commerce":
					break;
				case "Selected Topics of Recent Trends in Computer Science and Engineering":
					break;

				default:
					break;
				}
				break;
			case "ECE":
				switch (subject) {
				case "Mobile Computing":
					break;
				case "Consumer Electronics":
					break;
				case "Human Values and Professional Ethics-II":
					break;
				case "Digital Image Processing":
					break;
				case "ASIC Design":
					break;
				case "Ad Hoc and Sensor Networks":
					break;
				case "Introduction to Nanotechnology":
					break;
				case "Adaptive Signal Processing":
					break;
				case "Robotics":
					break;
				case "Computer Graphics and Multimedia":
					break;
				case "Next Generation Networks":
					break;
				case "GPS and GIS":
					break;
				case "Satellite Communication":
					break;

				default:
					break;
				}
				break;
			case "EEE":
				switch (subject) {
				case "Neuro-Fuzzy Systems":
					break;
				case "Power System Operation and Control":
					break;
				case "Human Values and Professional Ethics-II":
					break;
				case "Digital Image Processing":
					break;
				case "Application   of   Power Electronics to Power Systems":
					break;
				case "Reliability   Engineering   and   Application to Power System":
					break;
				case "Electrical Machine - III":
					break;
				case "Electrical Energy Conservation":
					break;
				case "Power System Analysis and Stability":
					break;
				case "Electrical System Design":
					break;
				case "Embedded Systems":
					break;
				case "Data Communication and Networks":
					break;
				case "Object Oriented Programming Using C++":
					break;
				case "Power Plant Instrumentation":
					break;
				case "Intelligent and Smart Instrumentation":
					break;
				case "Digital Communication":
					break;
				case "Electrical Power Quality":
					break;

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
		
		librarySaveFileService.saveFile(file, path);
		
		/*
		 * Now code to insert data in database 
		 */
		
		
		
		return null;
	}
}
