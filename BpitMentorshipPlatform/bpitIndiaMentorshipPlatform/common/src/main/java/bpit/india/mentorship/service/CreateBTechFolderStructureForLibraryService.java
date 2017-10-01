package bpit.india.mentorship.service;

import java.io.File;
import java.util.HashMap;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.common.ReadApplicationConstantsFile;
import bpit.india.mentorship.dto.BTechSemester1And2FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester3And4FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester5And6FolderPathsDto;
import bpit.india.mentorship.dto.BTechSemester7And8FolderPathsDto;

@Service
public class CreateBTechFolderStructureForLibraryService {

	@Autowired
	private ReadApplicationConstantsFile readApplicationConstantsFile;
	
	public HashMap<String, Object> createFolderStructureForLibrary()
	{
		
		
		
		File createBTechFolder = new File(readApplicationConstantsFile.getSaveFilesInFolder()+"BTech");
		
		/*
		 * Create Folder Structure
		 */
		
		File createBTechSemester1Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester1");
		
		/*
		 * Semester 1 CSE Folder Structure
		 */
		
		File semester1CSEFolder = new File(createBTechSemester1Folder.getAbsolutePath()+"//CSE");
		File semester1CSEAMFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Applied Mathematics - I");
		File semester1CSEAPFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Applied Physics - I");
		File semester1CSEETFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Electrical Technology");
		File semester1CSEMPFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Manufacturing Processes");
		File semester1CSEHVPEFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Human Values & Professional Ethics - I");
		File semester1CSEFOCFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Fundamentals Of Computing");
		File semester1CSEACFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Applied Chemistry");
		File semester1CSEEGFolder = new File(semester1CSEFolder.getAbsolutePath()+"//Engineering Graphics Lab");
		
		/*
		 * Semester 1 IT Folder Structure
		 */
		
		File semester1ITFolder = new File(createBTechSemester1Folder.getAbsolutePath()+"//IT");
		File semester1ITAMFolder = new File(semester1ITFolder.getAbsolutePath()+"//Applied Mathematics - I");
		File semester1ITAPFolder = new File(semester1ITFolder.getAbsolutePath()+"//Applied Physics - I");
		File semester1ITETFolder = new File(semester1ITFolder.getAbsolutePath()+"//Electrical Technology");
		File semester1ITMPFolder = new File(semester1ITFolder.getAbsolutePath()+"//Manufacturing Processes");
		File semester1ITHVPEFolder = new File(semester1ITFolder.getAbsolutePath()+"//Human Values & Professional Ethics - I");
		File semester1ITFOCFolder = new File(semester1ITFolder.getAbsolutePath()+"//Fundamentals Of Computing");
		File semester1ITACFolder = new File(semester1ITFolder.getAbsolutePath()+"//Applied Chemistry");
		File semester1ITEGFolder = new File(semester1ITFolder.getAbsolutePath()+"//Engineering Graphics Lab");
		
		
		/*
		 * Semester 1 ECE Folder Structure
		 */
		
		File semester1ECEFolder = new File(createBTechSemester1Folder.getAbsolutePath()+"//ECE");
		File semester1ECEAMFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Applied Mathematics - I");
		File semester1ECEAPFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Applied Physics - I");
		File semester1ECEETFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Electrical Technology");
		File semester1ECEMPFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Manufacturing Processes");
		File semester1ECEHVPEFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Human Values & Professional Ethics - I");
		File semester1ECEFOCFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Fundamentals Of Computing");
		File semester1ECEACFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Applied Chemistry");
		File semester1ECEEGFolder = new File(semester1ECEFolder.getAbsolutePath()+"//Engineering Graphics Lab");
		
		
		/*
		 * Semester 1 EEE Folder Structure
		 */
		
		File semester1EEEFolder = new File(createBTechSemester1Folder.getAbsolutePath()+"//EEE");
		File semester1EEEAMFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Applied Mathematics - I");
		File semester1EEEAPFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Applied Physics - I");
		File semester1EEEETFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Electrical Technology");
		File semester1EEEMPFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Manufacturing Processes");
		File semester1EEEHVPEFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Human Values & Professional Ethics - I");
		File semester1EEEFOCFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Fundamentals Of Computing");
		File semester1EEEACFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Applied Chemistry");
		File semester1EEEEGFolder = new File(semester1EEEFolder.getAbsolutePath()+"//Engineering Graphics Lab");
		
		
		/*
		 * Create semester2 Folder Structure
		 */

		File createBTechSemester2Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester2");
		
		/*
		 * Semester 2 CSE Folder Structure
		 */
		
		File semester2CSEFolder = new File(createBTechSemester2Folder.getAbsolutePath()+"//CSE");
		File semester2CSEAMFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Applied Mathematics - II");
		File semester2CSEAPFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Applied Physics - II");
		File semester2CSEEDFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Electronic Devices");
		File semester2CSEIPFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Introduction To Programming");
		File semester2CSEEMFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Engineering Mechanics");
		File semester2CSECSFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Communications Skills");
		File semester2CSEEVSFolder = new File(semester2CSEFolder.getAbsolutePath()+"//Environmental Studies");

		
		/*
		 * Semester 2 IT Folder Structure
		 */
		
		File semester2ITFolder = new File(createBTechSemester2Folder.getAbsolutePath()+"//IT");
		File semester2ITAMFolder = new File(semester2ITFolder.getAbsolutePath()+"//Applied Mathematics - II");
		File semester2ITAPFolder = new File(semester2ITFolder.getAbsolutePath()+"//Applied Physics - II");
		File semester2ITEDFolder = new File(semester2ITFolder.getAbsolutePath()+"//Electronic Devices");
		File semester2ITIPFolder = new File(semester2ITFolder.getAbsolutePath()+"//Introduction To Programming");
		File semester2ITEMFolder = new File(semester2ITFolder.getAbsolutePath()+"//Engineering Mechanics");
		File semester2ITCSFolder = new File(semester2ITFolder.getAbsolutePath()+"//Communications Skills");
		File semester2ITEVSFolder = new File(semester2ITFolder.getAbsolutePath()+"//Environmental Studies");

		
		/*
		 * Semester 2 ECE Folder Structure
		 */
		
		File semester2ECEFolder = new File(createBTechSemester2Folder.getAbsolutePath()+"//ECE");
		File semester2ECEAMFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Applied Mathematics - II");
		File semester2ECEAPFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Applied Physics - II");
		File semester2ECEEDFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Electronic Devices");
		File semester2ECEIPFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Introduction To Programming");
		File semester2ECEEMFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Engineering Mechanics");
		File semester2ECECSFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Communications Skills");
		File semester2ECEEVSFolder = new File(semester2ECEFolder.getAbsolutePath()+"//Environmental Studies");

		
		/*
		 * Semester 2 EEE Folder Structure
		 */
		
		File semester2EEEFolder = new File(createBTechSemester2Folder.getAbsolutePath()+"//EEE");
		File semester2EEEAMFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Applied Mathematics - II");
		File semester2EEEAPFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Applied Physics - II");
		File semester2EEEEDFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Electronic Devices");
		File semester2EEEIPFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Introduction To Programming");
		File semester2EEEEMFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Engineering Mechanics");
		File semester2EEECSFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Communications Skills");
		File semester2EEEEVSFolder = new File(semester2EEEFolder.getAbsolutePath()+"//Environmental Studies");

		
		/*
		 * Create semester3 Folder Structure
		 */
		
		
		File createBTechSemester3Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester3");
		
		/*
		 * Semester 3 CSE Folder Structure
		 */
		
		File semester3CSEFolder = new File(createBTechSemester3Folder.getAbsolutePath()+"//CSE");
		File semester3CSEAMFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Applied Mathematics - III");
		File semester3CSEFOCSFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Foundation Of Computer Science");
		File semester3CSESTLDFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Switching Theory And Logic Design");
		File semester3CSECNSFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Circuits And Systems");
		File semester3CSEDSFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Data Structure");
		File semester3CSECGFolder = new File(semester3CSEFolder.getAbsolutePath()+"//Computer Graphics And Multimedia");
		

		/*
		 * Semester 3 IT Folder Structure
		 */
		
		File semester3ITFolder = new File(createBTechSemester3Folder.getAbsolutePath()+"//IT");
		File semester3ITAMFolder = new File(semester3ITFolder.getAbsolutePath()+"//Applied Mathematics - III");
		File semester3ITFOCSFolder = new File(semester3ITFolder.getAbsolutePath()+"//Foundation Of Computer Science");
		File semester3ITSTLDFolder = new File(semester3ITFolder.getAbsolutePath()+"//Switching Theory And Logic Design");
		File semester3ITCNSFolder = new File(semester3ITFolder.getAbsolutePath()+"//Circuits And Systems");
		File semester3ITDSFolder = new File(semester3ITFolder.getAbsolutePath()+"//Data Structure");
		File semester3ITCGFolder = new File(semester3ITFolder.getAbsolutePath()+"//Computer Graphics And Multimedia");
		
		
		/*
		 * Semester 3 ECE Folder Structure
		 */
		
		File semester3ECEFolder = new File(createBTechSemester3Folder.getAbsolutePath()+"//ECE");
		File semester3ECEAMFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Applied Mathematics - III");
		File semester3ECEAEFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Analog Electronics - I");
		File semester3ECESTLDFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Switching Theory And Logic Design");
		File semester3ECEEIMFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Electronic Instruments and Measurements");
		File semester3ECEDSFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Data Structure");
		File semester3ECESNSFolder = new File(semester3ECEFolder.getAbsolutePath()+"//Signals and Systems");
		
		
		/*
		 * Semester 3 EEE Folder Structure
		 */
		
		
		File semester3EEEFolder = new File(createBTechSemester3Folder.getAbsolutePath()+"//EEE");
		File semester3EEEAMFolder = new File(semester3EEEFolder.getAbsolutePath()+"//Applied Mathematics - III");
		File semester3EEEAE1Folder = new File(semester3EEEFolder.getAbsolutePath()+"//Analog Electronics-I");
		File semester3EEEMESFolder = new File(semester3EEEFolder.getAbsolutePath()+"//Materials in Electrical Systems");
		File semester3EEECNSFolder = new File(semester3EEEFolder.getAbsolutePath()+"//Circuits And Systems");
		File semester3EEEDSFolder = new File(semester3EEEFolder.getAbsolutePath()+"//Data Structure");
		File semester3EEEEMFolder = new File(semester3EEEFolder.getAbsolutePath()+"//Electrical Machines-I");
			
		
		
		/*
		 * Create semester4 Folder Structure
		 */
		
		File createBTechSemester4Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester4");
		
		/*
		 * Semester 4 CSE Folder Structure
		 */
		
		File semester4CSEFolder = new File(createBTechSemester4Folder.getAbsolutePath()+"//CSE");
		File semester4CSEAMFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Applied Mathematics - IV");
		File semester4CSECOAFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Computer Organization And Architecture");
		File semester4CSETOCFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Theory Of Computation");
		File semester4CSEDBMSFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Database Management Systems");
		File semester4CSECSFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Communication Systems");
		File semester4CSEOOPFolder = new File(semester4CSEFolder.getAbsolutePath()+"//Object Oriented Programming");
		
		 /* 
		  * Semester 4 IT Folder Structure
		 */
		
		File semester4ITFolder = new File(createBTechSemester4Folder.getAbsolutePath()+"//IT");
		File semester4ITAMFolder = new File(semester4ITFolder.getAbsolutePath()+"//Applied Mathematics - IV");
		File semester4ITCOAFolder = new File(semester4ITFolder.getAbsolutePath()+"//Computer Organization And Architecture");
		File semester4ITTOCFolder = new File(semester4ITFolder.getAbsolutePath()+"//Theory Of Computation");
		File semester4ITDBMSFolder = new File(semester4ITFolder.getAbsolutePath()+"//Database Management Systems");
		File semester4ITCSFolder = new File(semester4ITFolder.getAbsolutePath()+"//Communication Systems");
		File semester4ITOOPFolder = new File(semester4ITFolder.getAbsolutePath()+"//Object Oriented Programming");

		
		/*
		 * Semester 4 ECE Folder Structure
		 */
		
		File semester4ECEFolder = new File(createBTechSemester4Folder.getAbsolutePath()+"//ECE");
		File semester4ECEAMFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Applied Mathematics - IV");
		File semester4ECECOAFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Computer Organization And Architecture");
		File semester4ECEAEFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Analog Electronics – II");
		File semester4ECENASFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Network Analysis and Synthesis");
		File semester4ECECSFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Communication Systems");
		File semester4ECEEFTFolder = new File(semester4ECEFolder.getAbsolutePath()+"//Electromagnetic Field Theory");
		
		
		/*	
		 * Semester 4 EEE Folder Structure
		 */
		
	
		File semester4EEEFolder = new File(createBTechSemester4Folder.getAbsolutePath()+"//EEE");
		File semester4EEEEMFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Electrical Machines-II");
		File semester4EEEAEFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Power System– I");
		File semester4EEEPSFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Electrical   and   Electronics   Measuring Instruments");
		File semester4EEEEEMIFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Database Management Systems");
		File semester4EEEEFTFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Electromagnetic Field Theory");
		File semester4EEECSFolder = new File(semester4EEEFolder.getAbsolutePath()+"//Control Systems");
		
		
		
		
		/*
		 * Create semester5 Folder Structure
		 */
		
		File createBTechSemester5Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester5");
		
		/*
		 * Semester 5 CSE Folder Structure
		 */
		
		
		File semester5CSEFolder = new File(createBTechSemester5Folder.getAbsolutePath()+"//CSE");
		File semester5CSEADAFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Algorithms Design And Analysis");
		File semester5CSECSPFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Communication Skills For Professionals");
		File semester5CSESEFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Software Engineering");
		File semester5CSEDCFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Digital Communication");
		File semester5CSEJPFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Java Programming");
		File semester5CSEIMFolder = new File(semester5CSEFolder.getAbsolutePath()+"//Industrial Management");
		
		
		/*
		 * Semester 5 IT Folder Structure
		 */
		
		File semester5ITFolder = new File(createBTechSemester5Folder.getAbsolutePath()+"//IT");
		File semester5ITADAFolder = new File(semester5ITFolder.getAbsolutePath()+"//Algorithms Design And Analysis");
		File semester5ITCSPFolder = new File(semester5ITFolder.getAbsolutePath()+"//Communication Skills For Professionals");
		File semester5ITSEFolder = new File(semester5ITFolder.getAbsolutePath()+"//Software Engineering");
		File semester5ITDCFolder = new File(semester5ITFolder.getAbsolutePath()+"//Digital Communication");
		File semester5ITJPFolder = new File(semester5ITFolder.getAbsolutePath()+"//Java Programming");
		File semester5ITIMFolder = new File(semester5ITFolder.getAbsolutePath()+"//Industrial Management");
		
		
		/*		
		 * Semester 5 ECE Folder Structure
		*/ 
		
		File semester5ECEFolder = new File(createBTechSemester5Folder.getAbsolutePath()+"//ECE");
		File semester5ECEMNMFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Microprocessors and Microcontrollers");
		File semester5ECECSPFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Communication Skills For Professionals");
		File semester5ECECSFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Control Systems");
		File semester5ECEDCFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Digital Communication");
		File semester5ECEDSDFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Digital System Design");
		File semester5ECEIMFolder = new File(semester5ECEFolder.getAbsolutePath()+"//Industrial Management");
				
		 /*
		  *  Semester 5 EEE Folder Structure
		 */

		File semester5EEEFolder = new File(createBTechSemester5Folder.getAbsolutePath()+"//EEE");
		File semester5EEEPEFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Power Electronics");
		File semester5EEECSPFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Communication Skills For Professionals");
		File semester5EEESNTFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Sensors and Transducers");
		File semester5EEEDCFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Digital Communication");
		File semester5EEESTLDFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Switching Theory and Logic Design");
		File semester5EEEIMFolder = new File(semester5EEEFolder.getAbsolutePath()+"//Industrial Management");
		
		
		/*
		 * Create semester6 Folder Structure
		 */
		
		File createBTechSemester6Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester6");
		
		/*
		 * Semester 6 CSE Folder Structure
		 */
		
		File semester6CSEFolder = new File(createBTechSemester6Folder.getAbsolutePath()+"//CSE");
		File semester6CSECDFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Compiler Design");
		File semester6CSEOSFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Operating Systems");
		File semester6CSECNFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Computer Networks");
		File semester6CSEWEFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Web Engineering");
		File semester6CSEAIFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Artificial Intelligence");
		File semester6CSEMNMFolder = new File(semester6CSEFolder.getAbsolutePath()+"//Microprocessors and Microcontrollers");

		/*
		 * Semester 6 IT Folder Structure
		 */
		
		File semester6ITFolder = new File(createBTechSemester6Folder.getAbsolutePath()+"//IT");
		File semester6ITCDFolder = new File(semester6ITFolder.getAbsolutePath()+"//Compiler Design");
		File semester6ITOSFolder = new File(semester6ITFolder.getAbsolutePath()+"//Operating Systems");
		File semester6ITDCNFolder = new File(semester6ITFolder.getAbsolutePath()+"//Data Communication and Networks");
		File semester6ITWEFolder = new File(semester6ITFolder.getAbsolutePath()+"//Web Engineering");
		File semester6ITAIFolder = new File(semester6ITFolder.getAbsolutePath()+"//Artificial Intelligence");
		File semester6ITMNMFolder = new File(semester6ITFolder.getAbsolutePath()+"//Microprocessors and Microcontrollers");


		/*		
		 * Semester 6 ECE Folder Structure
		*/ 
		
		File semester6ECEFolder = new File(createBTechSemester6Folder.getAbsolutePath()+"//ECE");
		File semester6ECEMEFolder = new File(semester6ECEFolder.getAbsolutePath()+"//Microwave Engineering");
		File semester6ECEITCFolder = new File(semester6ECEFolder.getAbsolutePath()+"//Information Theory and Coding");
		File semester6ECEDSPFolder = new File(semester6ECEFolder.getAbsolutePath()+"//Digital Signal Processing");
		File semester6ECEVLSIDFolder = new File(semester6ECEFolder.getAbsolutePath()+"//VLSI Design");
		File semester6ECEDCNFolder = new File(semester6ECEFolder.getAbsolutePath()+"//Data Communication and Networks");
		File semester6ECEANWPFolder = new File(semester6ECEFolder.getAbsolutePath()+"//Antenna and Wave Propagation");
		
		 /* 
		  * Semester 6 EEE Folder Structure
		 */
		
		
		File semester6EEEFolder = new File(createBTechSemester6Folder.getAbsolutePath()+"//EEE");
		File semester6EEEPSFolder = new File(semester6EEEFolder.getAbsolutePath()+"//Power System – II");
		File semester6EEEUEEETFolder = new File(semester6EEEFolder.getAbsolutePath()+"//Utilization  of  Electrical  Energy  and  Electric Traction");
		File semester6EEEDSPFolder = new File(semester6EEEFolder.getAbsolutePath()+"//Digital Signal Processing");
		File semester6EEEVLSIDFolder = new File(semester6EEEFolder.getAbsolutePath()+"//VLSI Design");
		File semester6EEEMNMFolder = new File(semester6EEEFolder.getAbsolutePath()+"//Microprocessor and Microcontroller");
		File semester6EEEPSPFolder = new File(semester6EEEFolder.getAbsolutePath()+"//Power Station Practice");
		
		
		
		/*
		 * Create semester7 Folder Structure
		 */
		
		File createBTechSemester7Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester7");
		
		/*
		 * Semester 7 CSE Folder Structure
		 */
	
		File semester7CSEFolder = new File(createBTechSemester7Folder.getAbsolutePath()+"//CSE");
		File semester7CSEISFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Information Security");
		File semester7CSESTQAFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Software Testing and Quality Assurance");
		File semester7CSEWCFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Wireless Communication");
		File semester7CSECTFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Complexity Theory");
		File semester7CSEIPRFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Intellectual Property Rights");
		File semester7CSEESFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Embedded Systems");
		File semester7CSEDMBIFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Data Mining and Business Intelligence");
		File semester7CSEACAFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Advanced Computer Architecture");
		File semester7CSENLPFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Natural Language Processing");
		File semester7CSEDSPFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Digital Signal Processing");
		File semester7CSESMFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Simulation and Modelling");
		File semester7CSEADBMSFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Advanced DBMS");
		File semester7CSEPCFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Parallel Computing");
		File semester7CSEACNFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Advanced Computer Networks");
		File semester7CSECSFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Control System");
		File semester7CSESEIHFEFolder = new File(semester7CSEFolder.getAbsolutePath()+"//Sociology and Elements of Indian History for Engineers");
		
		
		
		/*
		 * Semester 7 IT Folder Structure
		 */
	
		File semester7ITFolder = new File(createBTechSemester7Folder.getAbsolutePath()+"//IT");
		File semester7ITCNSFolder = new File(semester7ITFolder.getAbsolutePath()+"//Cryptography and Network Security");
		File semester7ITOOCFolder = new File(semester7ITFolder.getAbsolutePath()+"//Optoelectronics and Optical Communication");
		File semester7ITWCFolder = new File(semester7ITFolder.getAbsolutePath()+"//Wireless Communication");
		File semester7ITCCFolder = new File(semester7ITFolder.getAbsolutePath()+"//Cloud Computing");
		File semester7ITDDFolder = new File(semester7ITFolder.getAbsolutePath()+"//Distributed Databases");
		File semester7ITESFolder = new File(semester7ITFolder.getAbsolutePath()+"//Embedded Systems");
		File semester7ITSWTFolder = new File(semester7ITFolder.getAbsolutePath()+"//Semantic Web Technologies");
		File semester7ITSTFolder = new File(semester7ITFolder.getAbsolutePath()+"//Software Testing");
		File semester7ITNCFolder = new File(semester7ITFolder.getAbsolutePath()+"//.NET and C# Programming");
		File semester7ITDSPFolder = new File(semester7ITFolder.getAbsolutePath()+"//Digital Signal Processing");
		File semester7ITECJFolder = new File(semester7ITFolder.getAbsolutePath()+"//Enterprise Computing in Java");
		File semester7ITSNAFolder = new File(semester7ITFolder.getAbsolutePath()+"//System and Network Administration");
		File semester7ITGCFolder = new File(semester7ITFolder.getAbsolutePath()+"//Grid Computing");
		File semester7ITACNFolder = new File(semester7ITFolder.getAbsolutePath()+"//Advanced Computer Networks");
		File semester7ITADAFolder = new File(semester7ITFolder.getAbsolutePath()+"//Advanced Database Administration");
		File semester7ITPGMFolder = new File(semester7ITFolder.getAbsolutePath()+"//Probablistic Graphical Models");
		File semester7ITSEIHFEFolder = new File(semester7ITFolder.getAbsolutePath()+"//Sociology and Elements of Indian History for Engineers");
	
		/*		
		 * Semester 7 ECE Folder Structure
		*/ 
		
		File semester7ECEFolder = new File(createBTechSemester7Folder.getAbsolutePath()+"//ECE");
		File semester7ECEADSPFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Advanced DSP");
		File semester7ECEOOCFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Optoelectronics and Optical Communication");
		File semester7ECEWCFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Wireless Communication");
		File semester7ECEIMEMSFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Introduction to MEMS");
		File semester7ECEAVLSIDFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Advanced VLSI Design");
		File semester7ECEESFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Embedded Systems");
		File semester7ECEBIFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Biomedical Instrumentation");
		File semester7ECEPNSSFolder = new File(semester7ECEFolder.getAbsolutePath()+"//PLC and SCADA Systems");
		File semester7ECEPEFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Power Electronics");
		File semester7ECERFDCFolder = new File(semester7ECEFolder.getAbsolutePath()+"//RF Devices and Circuits");
		File semester7ECEDBMSFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Database Management System");
		File semester7ECERERFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Renewable Energy Resources");
		File semester7ECEGCFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Grid Computing");
		File semester7ECERANFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Radar and Navigation");
		File semester7ECEPMFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Project Management");
		File semester7ECEEFEFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Economics for Engineers");
		File semester7ECEPCFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Parallel Computing");
		File semester7ECESTECEFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Selected topics in ECE**");
		File semester7ECESEIHFolder = new File(semester7ECEFolder.getAbsolutePath()+"//Sociology and Elements of Indian History");
	
		
		/*		
		 * Semester 7 EEE Folder Structure
		*/ 
		
		File semester7EEEFolder = new File(createBTechSemester7Folder.getAbsolutePath()+"//EEE");
		File semester7EEEEDFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Electrical Drives");
		File semester7EEEOOCFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Optoelectronics and Optical Communication");
		File semester7EEEACSFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Advanced Control Systems");
		File semester7EEEEAHTFolder = new File(semester7EEEFolder.getAbsolutePath()+"//EHV AC and HVDC Transmissions");
		File semester7EEEPDSFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Power Distribution System");
		File semester7EEETDASFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Telemetry and Data Acquisition Systems");
		File semester7EEEBIFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Biomedical Instrumentation");
		File semester7EEEPNSSFolder = new File(semester7EEEFolder.getAbsolutePath()+"//PLC and SCADA Systems");
		File semester7EEEMTFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Mechatronics");
		File semester7EEEHVEFolder = new File(semester7EEEFolder.getAbsolutePath()+"//High Voltage Engineering");
		File semester7EEEDBMSFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Database Management System");
		File semester7EEERERFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Renewable Energy Resources");
		File semester7EEESTEEEFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Selected topics in EEE**");
		File semester7EEEDSDFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Digital System Design");
		File semester7EEEPLCCFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Power line Carrier Communication");
		File semester7EEEEMDFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Electrical Machines Design");
		File semester7EEESEIHFEFolder = new File(semester7EEEFolder.getAbsolutePath()+"//Sociology and Elements of Indian History for Engineers");
		
		
		
		/*
		 * Create semester8 Folder Structure
		 */
		
		File createBTechSemester8Folder = new File (createBTechFolder.getAbsolutePath()+"//Semester8");
		
		/*
		 * Semester 8 CSE Folder Structure
		 */
		
		File semester8CSEFolder = new File(createBTechSemester8Folder.getAbsolutePath()+"//CSE");
		File semester8CSEMCFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Mobile Computing");
		File semester8CSEMLFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Machine Learning");
		File semester8CSEHVPEFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Human Values and Professional Ethics-II");
		File semester8CSEDIPFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Digital Image Processing");
		File semester8CSEMEFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Microelectronics");
		File semester8CSEAHSNFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Ad Hoc and Sensor Networks");
		File semester8CSESCFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Soft Computing");
		File semester8CSEVLSIDFolder = new File(semester8CSEFolder.getAbsolutePath()+"//VLSI Design");
		File semester8CSEDSFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Distributed Systems");
		File semester8CSEOOSEFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Object Oriented Software Engineering");
		File semester8CSECVFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Computer Vision");
		File semester8CSESPMFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Software Project Management");
		File semester8CSEHCIFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Human Computer Interaction");
		File semester8CSEITCFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Information Theory and Coding");
		File semester8CSEWIBDFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Web Intelligence and Big Data");
		File semester8CSESOAFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Service Oriented Architecture");
		File semester8CSEMSFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Multiagent Systems");
		File semester8CSEPPLFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Principles of Programming Languages");
		File semester8CSETNFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Telecommunication Networks");
		File semester8CSERTCSEFolder = new File(semester8CSEFolder.getAbsolutePath()+"//Selected Topics of Recent Trends in Computer Science and Engineering");
		
		
		/*
		 * Semester 8 IT Folder Structure
		 */
		
		File semester8ITFolder = new File(createBTechSemester8Folder.getAbsolutePath()+"//IT");
		File semester8ITMCFolder = new File(semester8ITFolder.getAbsolutePath()+"//Mobile Computing");
		File semester8ITBDAFolder = new File(semester8ITFolder.getAbsolutePath()+"//Big Data Analytics");
		File semester8ITHVPEFolder = new File(semester8ITFolder.getAbsolutePath()+"//Human Values and Professional Ethics-II");
		File semester8ITDIPFolder = new File(semester8ITFolder.getAbsolutePath()+"//Digital Image Processing");
		File semester8ITSNAFolder = new File(semester8ITFolder.getAbsolutePath()+"//Social Network Analysis");
		File semester8ITAHSNFolder = new File(semester8ITFolder.getAbsolutePath()+"//Ad Hoc and Sensor Networks");
		File semester8ITSCFolder = new File(semester8ITFolder.getAbsolutePath()+"//Soft Computing");
		File semester8ITVLSIDFolder = new File(semester8ITFolder.getAbsolutePath()+"//VLSI Design");
		File semester8ITDSFolder = new File(semester8ITFolder.getAbsolutePath()+"//Distributed Systems");
		File semester8ITBIFolder = new File(semester8ITFolder.getAbsolutePath()+"//Bio Informatics");
		File semester8ITWADUNFolder = new File(semester8ITFolder.getAbsolutePath()+"//Web Application development using .NET");
		File semester8ITNGNFolder = new File(semester8ITFolder.getAbsolutePath()+"//Next Generation Networks");
		File semester8ITHCIFolder = new File(semester8ITFolder.getAbsolutePath()+"//Human Computer Interaction");
		File semester8ITITCFolder = new File(semester8ITFolder.getAbsolutePath()+"//Information Theory and Coding");
		File semester8ITGNGFolder = new File(semester8ITFolder.getAbsolutePath()+"//GPS and GIS");
		File semester8ITSTCFolder = new File(semester8ITFolder.getAbsolutePath()+"//Satellite Communication");
		File semester8ITECNMCFolder = new File(semester8ITFolder.getAbsolutePath()+"//E-Commerce and M-Commerce");
		File semester8ITRTCSEFolder = new File(semester8ITFolder.getAbsolutePath()+"//Selected Topics of Recent Trends in Computer Science and Engineering");
		
		/*
		 * Semester 8 ECE Folder Structure
		 */

		
		File semester8ECEFolder = new File(createBTechSemester8Folder.getAbsolutePath()+"//ECE");
		File semester8ECEMCFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Mobile Computing");
		File semester8ECECEFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Consumer Electronics");
		File semester8ECEHVPEFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Human Values and Professional Ethics-II");
		File semester8ECEDIPFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Digital Image Processing");
		File semester8ECEASICDFolder = new File(semester8ECEFolder.getAbsolutePath()+"//ASIC Design");
		File semester8ECEAHSNFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Ad Hoc and Sensor Networks");
		File semester8ECEINFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Introduction to Nanotechnology");
		File semester8ECEASPFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Adaptive Signal Processing");
		File semester8ECERTFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Robotics");
		File semester8ECECGNMFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Computer Graphics and Multimedia");
		File semester8ECENGNFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Next Generation Networks");
		File semester8ECEGNGFolder = new File(semester8ECEFolder.getAbsolutePath()+"//GPS and GIS");
		File semester8ECESTCFolder = new File(semester8ECEFolder.getAbsolutePath()+"//Satellite Communication");
		
		
		 /*
		  *  Semester 8 EEE Folder Structure
		 */

		
		File semester8EEEFolder = new File(createBTechSemester8Folder.getAbsolutePath()+"//EEE");
		File semester8EEENFSFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Neuro-Fuzzy Systems");
		File semester8EEEPSOCFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Power System Operation and Control");
		File semester8EEEHVPEFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Human Values and Professional Ethics-II");
		File semester8EEEDIPFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Digital Image Processing");
		File semester8EEEAPEPSFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Application   of   Power Electronics to Power Systems");
		File semester8EEEREAPSFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Reliability   Engineering   and   Application to Power System");
		File semester8EEEEMFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Electrical Machine - III");
		File semester8EEEEECFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Electrical Energy Conservation");
		File semester8EEEPSASFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Power System Analysis and Stability");
		File semester8EEEESDFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Electrical System Design");
		File semester8EEEESFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Embedded Systems");
		File semester8EEEDCNFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Data Communication and Networks");
		File semester8EEEOOPCFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Object Oriented Programming Using C++");
		File semester8EEEPPIFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Power Plant Instrumentation");
		File semester8EEEISIFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Intelligent and Smart Instrumentation");
		File semester8EEEDCFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Digital Communication");
		File semester8EEEEPQFolder = new File(semester8EEEFolder.getAbsolutePath()+"//Electrical Power Quality");
		
		
		try{
		/*
		 * If folder exists then skip mkdir commands 
		 */
	
		if(!createBTechFolder.exists())
		{
			/*
			 * mkdir commands goes here 
			 */
			
			if(!createBTechFolder.mkdir())
			{
				/*
				 * Error occurred while creating Btech Folder 
				 */
				throw new Exception();
			}
			
			/*
			 * mkdir for semester 1 folders 
			 */
			
			if(!createBTechSemester1Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester1 Folder 
				 */
				throw new Exception();
			}
			
			if(!semester1CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester1 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester1CSEAMFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE AM  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1CSEAPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE AP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1CSEETFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE ET  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1CSEMPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE MP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1CSEFOCFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE FOC  Folder
				 */
				throw new Exception();
			}
			if(!semester1CSEACFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE AC  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1CSEHVPEFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE HVPE  Folder
				 */
				throw new Exception();
			}
			if(!semester1CSEEGFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 CSE EG  Folder
				 */
				throw new Exception();
			}
			
			
			
			
			
			if(!semester1ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester1 IT  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester1ITAMFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT AM  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ITAPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT AP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ITMPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT MP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ITFOCFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT FOC  Folder
				 */
				throw new Exception();
			}
			if(!semester1ITACFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT AC  Folder
				 */
				throw new Exception();
			}
			if(!semester1ITETFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT ET  Folder
				 */
				throw new Exception();
			}
			if(!semester1ITHVPEFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT HVPE  Folder
				 */
				throw new Exception();
			}
			if(!semester1ITEGFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 IT EG  Folder
				 */
				throw new Exception();
			}
			
			
			
			
			
			
			
			if(!semester1ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester1 ECE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester1ECEAMFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE AM  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ECEAPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE AP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ECEETFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE ET  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ECEMPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE MP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ECEFOCFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE FOC  Folder
				 */
				throw new Exception();
			}
			if(!semester1ECEACFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE AC  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1ECEHVPEFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE HVPE  Folder
				 */
				throw new Exception();
			}
			if(!semester1ECEEGFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 ECE EG  Folder
				 */
				throw new Exception();
			}
			
			
			
			
			
			
			
			
			if(!semester1EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester1 EEE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester1EEEAMFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE AM  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1EEEAPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE AP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1EEEMPFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE MP  Folder
				 */
				throw new Exception();
			}
			
			if(!semester1EEEFOCFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE FOC  Folder
				 */
				throw new Exception();
			}
			if(!semester1EEEACFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE AC  Folder
				 */
				throw new Exception();
			}
			if(!semester1EEEETFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE ET  Folder
				 */
				throw new Exception();
			}
			if(!semester1EEEHVPEFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE HVPE  Folder
				 */
				throw new Exception();
			}
			if(!semester1EEEEGFolder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 EEE EG  Folder
				 */
				throw new Exception();
			}
			
			
			
			/*
			 * MKDIR for semester 2 folders.
			 */
			
			if(!createBTechSemester2Folder.mkdir())
			{
				/*
				 *  Error occurred while creating Semester1 Btech Semester 2  Folder
				 */
				throw new Exception();
			}
			
			if(!semester2CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEAPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE AP  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEEDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE ED  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE EM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEEVSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE EVS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE IP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE CS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			if(!semester2ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITAPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT AP  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITEDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT ED  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT EM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITEVSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT EVS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 IT IP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ITCSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ITE CS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			
			
			if(!semester2ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECEAPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE AP  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECEEDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE ED  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2CSEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 CSE EM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECEEVSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE EVS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECEIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE IP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2ECECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 ECE CS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			if(!semester2EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEAPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE AP  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEEDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE ED  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE EM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEEVSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE EVS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEEIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE IP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester2EEECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester2 EEE CS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			/*
			 * MKDIR for semester 3
			 */
			
			if(!createBTechSemester3Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester3 Folder 
				 */
				throw new Exception();
			}
			
			if(!semester3CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE AM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSESTLDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE STLD Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSECGFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE CG Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSECNSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE CNS  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSEFOCSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE FOCS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3CSEDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 CSE DS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester3ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT AM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITSTLDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT STLD Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITCGFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT CG Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITCNSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT CNS  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITFOCSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT FOCS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ITDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 IT DS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester3ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE AM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECESTLDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE STLD Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECESNSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE SNS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECEAEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE AE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECEEIMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE EIM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3ECEDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 ECE DS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			if(!semester3EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE AM  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEEAE1Folder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE AE1 Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE EM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEECNSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE CNS  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEEMESFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE MES Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester3EEEDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester3 EEE DS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			/*
			 * MKDIR of semester 4
			 */
			
			
			
			if(!createBTechSemester4Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester4 Folder 
				 */
				throw new Exception();
			}
			
			
			
			if(!semester4CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSEOOPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE OOP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE CS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSEDBMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE DBMS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSECOAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE COA Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4CSETOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 CSE TOC Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			if(!semester4ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITOOPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT OOP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITCSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT CS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITDBMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT DBMS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITCOAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT COA Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ITTOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 IT TOC Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
		
			if(!semester4ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECEAMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE AM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECEAEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE AE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE CS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECEEFTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE EFT Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECECOAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE COA Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4ECENASFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 ECE NAS Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			if(!semester4EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE EM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEEPSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE PS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE CS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEEEEMIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE EEMI Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEEAEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE AE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester4EEEEFTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester4 EEE EFT Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			/*
			 * MKDIR of semester 5
			 */
			
			
			
			if(!createBTechSemester5Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester5 Folder 
				 */
				throw new Exception();
			}
			
			
			
			if(!semester5CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEADAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE ADA Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE DC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSECSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE CSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEIMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE IM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEJPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE JP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSESEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE SE Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester5ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITADAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT ADA Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT DC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITCSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT CSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITIMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT IM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITJPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT JP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ITSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 IT SE Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester5ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 ECE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ECECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 ECE CS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE DC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSECSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE CSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5CSEIMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 CSE IM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ECEMNMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 ECE MNM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5ECEDSDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 ECE DSD Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			
			if(!semester5EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEEPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE PE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEEDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE DC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEECSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE CSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEEIMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE IM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEESNTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE SNT Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester5EEESTLDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester5 EEE STLD Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			/*
			 * MKDIR of semester 6
			 */
			
			
		
			if(!createBTechSemester6Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester6 Folder 
				 */
				throw new Exception();
			}
			
			
			
			if(!semester6CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSECNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE CN Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSEOSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE OS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSECDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE CD Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSEMNMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE MNM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSEWEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE WE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6CSEAIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 CSE AI Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			
			
			if(!semester6ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITDCNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT DCN Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITOSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT OS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITCDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT CD Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITMNMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT MNM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITWEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT WE Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ITAIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 IT AI Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			if(!semester6ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEDCNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE DCN Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEMEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE ME Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEDSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE DSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEITCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE ITC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEANWPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE ANWP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6ECEVLSIDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 ECE VLSID Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester6EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEPSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE PS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEUEEETFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE UEEET Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEDSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE DSP Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEMNMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE MNM Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEVLSIDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE VLSID Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester6EEEPSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester6 EEE PSP Folder 
					 */
					throw new Exception();	
			}
			
			
			
				
			
			/*
			 * MKDIR of semester 7
			 */
			
			
		
			if(!createBTechSemester7Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester7 Folder 
				 */
				throw new Exception();
			}
			
			
			
			if(!semester7CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE  Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester7CSEWCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 SE WC Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester7CSEISFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE IS Folder 
					 */
					throw new Exception();	
			}
			
			if(!semester7CSESTQAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE STQA Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEDMBIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE DMBI Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEACNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE ACN Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEADBMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE ADBMS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSECTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE CT Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEIPRFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE IPR Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEESFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE ES Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEACAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE ACA Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSENLPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE NLP Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSEDSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE DSP Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSESMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE SM Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSECSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE CS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7CSESEIHFEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 CSE SEIHFE Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			if(!semester7ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT  Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITACNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT ACN Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITWCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT WC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITESFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT ES Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITADAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT ADA Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITSTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT ST Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITSEIHFEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT SEIHFE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITOOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT OOC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITSWTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT SWT Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITGCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT GC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITCCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT CC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITDDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT DD Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITECJFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT ECJ Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITDSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT DSP Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITSNAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT SNA Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITPGMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT PGM Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ITNCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 IT NC Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			if(!semester7ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEESFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE ES Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEWCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE WC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEAVLSIDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE AVLSID Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEOOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE OOC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEADSPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE ADSP Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEIMEMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE IMEMS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEDBMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 DBMS ECE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEBIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 BI ECE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 PE ECE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEGCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 GC ECE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEPCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE PC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEPMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE PM Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEEFEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE EFE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECERFDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE RFDC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECERERFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE RER Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECERANFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE RAN Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECEPNSSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE PNSS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECESEIHFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE SEIH Folder 
					 */
					throw new Exception();	
			}
			if(!semester7ECESTECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 ECE STECE Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			if(!semester7EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE  Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEEDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE ED  Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEACSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE ACS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEERERFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE RER Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEPDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE PDS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEETDASFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE TDAS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEDBMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE DBMS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEBIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE BI Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEDSDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE DSD Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEEMDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE EMD Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEESEIHFEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE SEIHFE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEPNSSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE PNSS Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEPLCCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE PLCC Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEESTEEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE STEEE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEHVEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE HVE Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEMTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE MT Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEEAHTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE EAHT Folder 
					 */
					throw new Exception();	
			}
			if(!semester7EEEOOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester7 EEE OOC Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			/*
			 * MKDIR of semester 8
			 */
			
			
		
			if(!createBTechSemester8Folder.mkdir())
			{
				/*
				 * Error occurred while creating Semester8 Folder 
				 */
				throw new Exception();
			}
			
			
			
			if(!semester8CSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE  Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEMCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE MC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEMLFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE ML Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEHVPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE HVPE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEDIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE DIP Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSESCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE SC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEMEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE ME Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEVLSIDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE VLSID Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE DS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEOOSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE OOSE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSECVFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE CV Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSESPMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE SPM Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEHCIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE HCI Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEAHSNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE AHSN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEITCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE ITC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSESOAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE SOA Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEWIBDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE WIBD Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEMSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE MS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSEPPLFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE PPL Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSETNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE TN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8CSERTCSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 CSE RTCSE Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			if(!semester8ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT  Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITMCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT MC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITBDAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT BDA Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITAHSNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT AHSN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITHVPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT HVPE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT  Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITSNAFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT SNA Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITBIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT BI Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITSCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT SC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITVLSIDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT VLSID Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITITCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT ITC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITHCIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT HCI Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITDIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT DIP Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITNGNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT NGN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITSTCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT STC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITECNMCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT ECNMC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITDSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT DS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITRTCSEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT RTCSE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITWADUNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT WADUN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ITGNGFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 IT GNG Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			
			
			
			
			
			if(!semester8ECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE  Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEAHSNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE AHSN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECESTCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE SC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEHVPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE HVPE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEDIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE DIP Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECECEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE CE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEASICDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE ASICD Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEMCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE MC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEINFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE IN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEASPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE ASP Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECENGNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE NGN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECECGNMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE CGNM Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECEGNGFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE GNG Folder 
					 */
					throw new Exception();	
			}
			if(!semester8ECERTFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 ECE RT Folder 
					 */
					throw new Exception();	
			}
			
			
			
			
			
			
			if(!semester8EEEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE  Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEENFSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE NFS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEPSOCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE PSOC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEPPIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE PPI Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEDCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE DC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEHVPEFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE HVPE Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEEPQFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE EPQ Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEOOPCFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE OOPC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEAPEPSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE APEPS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEREAPSFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE REAPS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEEMFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE EM Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEEECFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE EEC Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEPSASFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE PSAS Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEESDFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE ESD Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEESFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE ES Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEDCNFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE DCN Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEDIPFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE DIP Folder 
					 */
					throw new Exception();	
			}
			if(!semester8EEEISIFolder.mkdir())
			{
					/*
					 * Error occurred while creating Semester8 EEE ISI Folder 
					 */
					throw new Exception();	
			}
			
			
			} // end of If
		
		
		/*
		 * set dto for all paths and return that dto
		 */
		
		HashMap<String, Object> btechAll8SemesterPaths = new HashMap<String, Object>();
		
		/*
		 * Setting paths for Semester 1 & semester 2 folders 
		 */
		
		BTechSemester1And2FolderPathsDto sem1And2Paths= new BTechSemester1And2FolderPathsDto(
				createBTechFolder.getAbsolutePath(),  
				createBTechSemester1Folder.getAbsolutePath(), semester1CSEFolder.getAbsolutePath(), semester1CSEAMFolder.getAbsolutePath(), semester1CSEAPFolder.getAbsolutePath(), semester1CSEACFolder.getAbsolutePath(), semester1CSEETFolder.getAbsolutePath(), semester1CSEMPFolder.getAbsolutePath(), semester1CSEEGFolder.getAbsolutePath(), semester1CSEFOCFolder.getAbsolutePath(), semester1CSEHVPEFolder.getAbsolutePath(), 
				semester1ITFolder.getAbsolutePath(), semester1ITAMFolder.getAbsolutePath(), semester1ITAPFolder.getAbsolutePath(), semester1ITETFolder.getAbsolutePath(), semester1ITMPFolder.getAbsolutePath(), semester1ITFOCFolder.getAbsolutePath(), semester1ITACFolder.getAbsolutePath(), semester1ITEGFolder.getAbsolutePath(),semester1ITHVPEFolder.getAbsolutePath(), 
				semester1ECEFolder.getAbsolutePath(), semester1ECEAMFolder.getAbsolutePath(), semester1ECEAPFolder.getAbsolutePath(), semester1ECEETFolder.getAbsolutePath(), semester1ECEMPFolder.getAbsolutePath(), semester1ECEHVPEFolder.getAbsolutePath(), semester1ECEFOCFolder.getAbsolutePath(), semester1ECEACFolder.getAbsolutePath(), semester1ECEEGFolder.getAbsolutePath(), 
				semester1EEEFolder.getAbsolutePath(), semester1EEEAMFolder.getAbsolutePath(), semester1EEEAPFolder.getAbsolutePath(), semester1EEEETFolder.getAbsolutePath(), semester1EEEMPFolder.getAbsolutePath(), semester1EEEHVPEFolder.getAbsolutePath(), semester1EEEFOCFolder.getAbsolutePath(), semester1EEEACFolder.getAbsolutePath(), semester1EEEEGFolder.getAbsolutePath(), 
				createBTechSemester2Folder.getAbsolutePath(), semester2CSEFolder.getAbsolutePath(), semester2CSEAMFolder.getAbsolutePath(), semester2CSEAPFolder.getAbsolutePath(), semester2CSEEDFolder.getAbsolutePath(), semester2CSEIPFolder.getAbsolutePath(), semester2CSEEMFolder.getAbsolutePath(), semester2CSECSFolder.getAbsolutePath(), semester2CSEEVSFolder.getAbsolutePath(), 
				semester2ITFolder.getAbsolutePath(), semester2ITAMFolder.getAbsolutePath(), semester2ITAPFolder.getAbsolutePath(), semester2ITEDFolder.getAbsolutePath(), semester2ITIPFolder.getAbsolutePath(), semester2ITEMFolder.getAbsolutePath(), semester2ITCSFolder.getAbsolutePath(), semester2ITEVSFolder.getAbsolutePath(), 
				semester2ECEFolder.getAbsolutePath(), semester2ECEAMFolder.getAbsolutePath(), semester2ECEAPFolder.getAbsolutePath(), semester2ECEEDFolder.getAbsolutePath(), semester2ECEIPFolder.getAbsolutePath(), semester2ECEEMFolder.getAbsolutePath(), semester2ECECSFolder.getAbsolutePath(), semester2ECEEVSFolder.getAbsolutePath(), 
				semester2EEEFolder.getAbsolutePath(), semester2EEEAMFolder.getAbsolutePath(), semester2EEEAPFolder.getAbsolutePath(), semester2EEEEDFolder.getAbsolutePath(), semester2EEEIPFolder.getAbsolutePath(), semester2EEEEMFolder.getAbsolutePath(), semester2EEECSFolder.getAbsolutePath(), semester2EEEEVSFolder.getAbsolutePath()
				);
		/*
		 * Setting paths for Semester 3 & semester 4 folders
		 */
		
		BTechSemester3And4FolderPathsDto sem3And4Paths= new  BTechSemester3And4FolderPathsDto(
				createBTechSemester3Folder.getAbsolutePath(), semester3CSEFolder.getAbsolutePath(), semester3CSEAMFolder.getAbsolutePath(), semester3CSEFOCSFolder.getAbsolutePath(), semester3CSESTLDFolder.getAbsolutePath(), semester3CSECNSFolder.getAbsolutePath(), semester3CSEDSFolder.getAbsolutePath(), semester3CSECGFolder.getAbsolutePath(), 
				semester3ITFolder.getAbsolutePath(), semester3ITAMFolder.getAbsolutePath(), semester3ITFOCSFolder.getAbsolutePath(), semester3ITSTLDFolder.getAbsolutePath(), semester3ITCNSFolder.getAbsolutePath(), semester3ITDSFolder.getAbsolutePath(), semester3ITCGFolder.getAbsolutePath(), 
				semester3ECEFolder.getAbsolutePath(), semester3ECEAMFolder.getAbsolutePath(), semester3ECESTLDFolder.getAbsolutePath(), semester3ECEDSFolder.getAbsolutePath(), semester3ECEAEFolder.getAbsolutePath(), semester3ECEEIMFolder.getAbsolutePath(), semester3ECESNSFolder.getAbsolutePath(), 
				semester3EEEFolder.getAbsolutePath(), semester3EEEAMFolder.getAbsolutePath(), semester3EEEDSFolder.getAbsolutePath(), semester3EEEAE1Folder.getAbsolutePath(), semester3EEECNSFolder.getAbsolutePath(), semester3EEEMESFolder.getAbsolutePath(), semester3EEEEMFolder.getAbsolutePath(), 
				createBTechSemester4Folder.getAbsolutePath(), semester4CSEFolder.getAbsolutePath(), semester4CSEAMFolder.getAbsolutePath(), semester4CSECOAFolder.getAbsolutePath(), semester4CSETOCFolder.getAbsolutePath(), semester4CSEDBMSFolder.getAbsolutePath(), semester4CSECSFolder.getAbsolutePath(), semester4CSEOOPFolder.getAbsolutePath(), 
				semester4ITFolder.getAbsolutePath(), semester4ITAMFolder.getAbsolutePath(), semester4ITCOAFolder.getAbsolutePath(), semester4ITTOCFolder.getAbsolutePath(), semester4ITDBMSFolder.getAbsolutePath(), semester4ITCSFolder.getAbsolutePath(), semester4ITOOPFolder.getAbsolutePath(), 
				semester4ECEFolder.getAbsolutePath(), semester4ECEAMFolder.getAbsolutePath(), semester4ECECOAFolder.getAbsolutePath(), semester4ECECSFolder.getAbsolutePath(), semester4ECEAEFolder.getAbsolutePath(), semester4ECENASFolder.getAbsolutePath(), semester4ECEEFTFolder.getAbsolutePath(), 
				semester4EEEFolder.getAbsolutePath(), semester4EEEEFTFolder.getAbsolutePath(), semester4EEEEMFolder.getAbsolutePath(), semester4EEEAEFolder.getAbsolutePath(), semester4EEEPSFolder.getAbsolutePath(), semester4EEEEEMIFolder.getAbsolutePath(), semester4EEECSFolder.getAbsolutePath());
		
		/*
		 * Setting Paths for Semester 5 & 6 Folders
		 */
		
		
		BTechSemester5And6FolderPathsDto sem5And6Paths = new BTechSemester5And6FolderPathsDto(
				createBTechSemester5Folder.getAbsolutePath(), semester5CSEFolder.getAbsolutePath(), semester5CSEADAFolder.getAbsolutePath(), semester5CSECSPFolder.getAbsolutePath(), semester5CSESEFolder.getAbsolutePath(), semester5CSEDCFolder.getAbsolutePath(), semester5CSEJPFolder.getAbsolutePath(), semester5CSEIMFolder.getAbsolutePath(), 
				semester5ITFolder.getAbsolutePath(), semester5ITADAFolder.getAbsolutePath(), semester5ITCSPFolder.getAbsolutePath(), semester5ITSEFolder.getAbsolutePath(), semester5ITDCFolder.getAbsolutePath(), semester5ITJPFolder.getAbsolutePath(), semester5ITIMFolder.getAbsolutePath(), 
				semester5ECEFolder.getAbsolutePath(), semester5ECEIMFolder.getAbsolutePath(), semester5ECECSPFolder.getAbsolutePath(), semester5ECEDCFolder.getAbsolutePath(), semester5ECEMNMFolder.getAbsolutePath(), semester5ECECSFolder.getAbsolutePath(), semester5ECEDSDFolder.getAbsolutePath(), 
				semester5EEEFolder.getAbsolutePath(), semester5EEEPEFolder.getAbsolutePath(), semester5EEEIMFolder.getAbsolutePath(), semester5EEECSPFolder.getAbsolutePath(), semester5EEEDCFolder.getAbsolutePath(), semester5EEESNTFolder.getAbsolutePath(), semester5EEESTLDFolder.getAbsolutePath(), 
				createBTechSemester6Folder.getAbsolutePath(), semester6CSEFolder.getAbsolutePath(), semester6CSECDFolder.getAbsolutePath(), semester6CSEOSFolder.getAbsolutePath(), semester6CSECNFolder.getAbsolutePath(), semester6CSEWEFolder.getAbsolutePath(), semester6CSEAIFolder.getAbsolutePath(), semester6CSEMNMFolder.getAbsolutePath(), 
				semester6ITFolder.getAbsolutePath(), semester6ITCDFolder.getAbsolutePath(), semester6ITOSFolder.getAbsolutePath(), semester6ITDCNFolder.getAbsolutePath(), semester6ITWEFolder.getAbsolutePath(), semester6ITAIFolder.getAbsolutePath(), semester6ITMNMFolder.getAbsolutePath(), 
				semester6ECEFolder.getAbsolutePath(), semester6ECEMEFolder.getAbsolutePath(), semester6ECEITCFolder.getAbsolutePath(), semester6ECEDSPFolder.getAbsolutePath(), semester6ECEVLSIDFolder.getAbsolutePath(), semester6ECEDCNFolder.getAbsolutePath(), semester6ECEANWPFolder.getAbsolutePath(), 
				semester6EEEFolder.getAbsolutePath(), semester6EEEPSFolder.getAbsolutePath(), semester6EEEUEEETFolder.getAbsolutePath(), semester6EEEDSPFolder.getAbsolutePath(), semester6EEEVLSIDFolder.getAbsolutePath(), semester6EEEMNMFolder.getAbsolutePath(), semester6EEEPSPFolder.getAbsolutePath());
		
		
		/*
		 * Setting paths for semester 7 & 8 folders
		 */
		
		BTechSemester7And8FolderPathsDto sem7And8Paths = new BTechSemester7And8FolderPathsDto(
				createBTechSemester7Folder.getAbsolutePath(), semester7CSEFolder.getAbsolutePath(), semester7CSEISFolder.getAbsolutePath(), semester7CSESTQAFolder.getAbsolutePath(), semester7CSEWCFolder.getAbsolutePath(), semester7CSECTFolder.getAbsolutePath(), semester7CSEIPRFolder.getAbsolutePath(), semester7CSEESFolder.getAbsolutePath(), semester7CSEDMBIFolder.getAbsolutePath(), semester7CSEACAFolder.getAbsolutePath(), semester7CSENLPFolder.getAbsolutePath(), semester7CSEDSPFolder.getAbsolutePath(), semester7CSESMFolder.getAbsolutePath(), semester7CSEADBMSFolder.getAbsolutePath(), semester7CSEPCFolder.getAbsolutePath(), semester7CSEACNFolder.getAbsolutePath(), semester7CSECSFolder.getAbsolutePath(), semester7CSESEIHFEFolder.getAbsolutePath(), 
				semester7ITFolder.getAbsolutePath(), semester7ITCNSFolder.getAbsolutePath(), semester7ITOOCFolder.getAbsolutePath(), semester7ITWCFolder.getAbsolutePath(), semester7ITCCFolder.getAbsolutePath(), semester7ITDDFolder.getAbsolutePath(), semester7ITESFolder.getAbsolutePath(), semester7ITSWTFolder.getAbsolutePath(), semester7ITSTFolder.getAbsolutePath(), semester7ITNCFolder.getAbsolutePath(), semester7ITDSPFolder.getAbsolutePath(), semester7ITECJFolder.getAbsolutePath(), semester7ITSNAFolder.getAbsolutePath(), semester7ITGCFolder.getAbsolutePath(), semester7ITACNFolder .getAbsolutePath(), semester7ITADAFolder.getAbsolutePath(), semester7ITPGMFolder.getAbsolutePath(), semester7ITSEIHFEFolder.getAbsolutePath(), 
				semester7ECEFolder.getAbsolutePath(), semester7ECEADSPFolder.getAbsolutePath(), semester7ECEOOCFolder.getAbsolutePath(), semester7ECEWCFolder.getAbsolutePath(), semester7ECEIMEMSFolder.getAbsolutePath(), semester7ECEAVLSIDFolder.getAbsolutePath(), semester7ECEESFolder.getAbsolutePath(), semester7ECEBIFolder.getAbsolutePath(), semester7ECEPNSSFolder.getAbsolutePath(), semester7ECEPEFolder.getAbsolutePath(), semester7ECERFDCFolder.getAbsolutePath(), semester7ECEDBMSFolder.getAbsolutePath(), semester7ECERERFolder.getAbsolutePath(), semester7ECEGCFolder.getAbsolutePath(), semester7ECERANFolder.getAbsolutePath(), semester7ECEPMFolder.getAbsolutePath(), semester7ECEEFEFolder.getAbsolutePath(), semester7ECEPCFolder.getAbsolutePath(), semester7ECESTECEFolder.getAbsolutePath(), semester7ECESEIHFolder.getAbsolutePath(), 
				semester7EEEFolder.getAbsolutePath(), semester7EEEEDFolder.getAbsolutePath(), semester7EEEOOCFolder.getAbsolutePath(), semester7EEEACSFolder.getAbsolutePath(), semester7EEEEAHTFolder.getAbsolutePath(), semester7EEEPDSFolder.getAbsolutePath(), semester7EEETDASFolder.getAbsolutePath(), semester7EEEBIFolder.getAbsolutePath(), semester7EEEPNSSFolder.getAbsolutePath(), semester7EEEMTFolder.getAbsolutePath(), semester7EEEHVEFolder.getAbsolutePath(), semester7EEEDBMSFolder.getAbsolutePath(), semester7EEERERFolder.getAbsolutePath(), semester7EEESTEEEFolder.getAbsolutePath(), semester7EEEDSDFolder.getAbsolutePath(), semester7EEEPLCCFolder.getAbsolutePath(), semester7EEEEMDFolder.getAbsolutePath(), semester7EEESEIHFEFolder.getAbsolutePath(), 
				createBTechSemester8Folder.getAbsolutePath(), semester8CSEFolder.getAbsolutePath(), semester8CSEMCFolder.getAbsolutePath(), semester8CSEMLFolder.getAbsolutePath(), semester8CSEHVPEFolder.getAbsolutePath(), semester8CSEDIPFolder.getAbsolutePath(), semester8CSEMEFolder.getAbsolutePath(), semester8CSEAHSNFolder.getAbsolutePath(), semester8CSESCFolder.getAbsolutePath(), semester8CSEVLSIDFolder.getAbsolutePath(), semester8CSEDSFolder.getAbsolutePath(), semester8CSEOOSEFolder.getAbsolutePath(), semester8CSECVFolder.getAbsolutePath(), semester8CSESPMFolder.getAbsolutePath(), semester8CSEHCIFolder.getAbsolutePath(), semester8CSEITCFolder.getAbsolutePath(), semester8CSEWIBDFolder.getAbsolutePath(), semester8CSESOAFolder.getAbsolutePath(), semester8CSEMSFolder.getAbsolutePath(), semester8CSEPPLFolder.getAbsolutePath(), semester8CSETNFolder.getAbsolutePath(), semester8CSERTCSEFolder.getAbsolutePath(), 
				semester8ITFolder.getAbsolutePath(), semester8ITMCFolder.getAbsolutePath(), semester8ITBDAFolder.getAbsolutePath(), semester8ITHVPEFolder.getAbsolutePath(), semester8ITDIPFolder.getAbsolutePath(), semester8ITSNAFolder.getAbsolutePath(), semester8ITAHSNFolder.getAbsolutePath(), semester8ITSCFolder.getAbsolutePath(), semester8ITVLSIDFolder.getAbsolutePath(), semester8ITDSFolder.getAbsolutePath(), semester8ITBIFolder.getAbsolutePath(), semester8ITWADUNFolder.getAbsolutePath(), semester8ITNGNFolder.getAbsolutePath(), semester8ITHCIFolder.getAbsolutePath(), semester8ITITCFolder.getAbsolutePath(), semester8ITGNGFolder.getAbsolutePath(), semester8ITSTCFolder.getAbsolutePath(), semester8ITECNMCFolder.getAbsolutePath(), semester8ITRTCSEFolder.getAbsolutePath(), 
				semester8ECEFolder.getAbsolutePath(), semester8ECEMCFolder.getAbsolutePath(), semester8ECECEFolder.getAbsolutePath(), semester8ECEHVPEFolder.getAbsolutePath(), semester8ECEDIPFolder.getAbsolutePath(), semester8ECEASICDFolder.getAbsolutePath(), semester8ECEAHSNFolder.getAbsolutePath(), semester8ECEINFolder.getAbsolutePath(), semester8ECEASPFolder.getAbsolutePath(), semester8ECERTFolder.getAbsolutePath(), semester8ECECGNMFolder.getAbsolutePath(), semester8ECENGNFolder.getAbsolutePath(), semester8ECEGNGFolder.getAbsolutePath(), semester8ECESTCFolder.getAbsolutePath(), 
				semester8EEEFolder.getAbsolutePath(), semester8EEENFSFolder.getAbsolutePath(), semester8EEEPSOCFolder.getAbsolutePath(), semester8EEEHVPEFolder.getAbsolutePath(), semester8EEEDIPFolder.getAbsolutePath(), semester8EEEAPEPSFolder.getAbsolutePath(), semester8EEEREAPSFolder.getAbsolutePath(), semester8EEEEMFolder.getAbsolutePath(), semester8EEEEECFolder.getAbsolutePath(), semester8EEEPSASFolder.getAbsolutePath(), semester8EEEESDFolder.getAbsolutePath(), semester8EEEESFolder.getAbsolutePath(), semester8EEEDCNFolder.getAbsolutePath(), semester8EEEOOPCFolder.getAbsolutePath(), semester8EEEPPIFolder.getAbsolutePath(), semester8EEEISIFolder.getAbsolutePath(), semester8EEEDCFolder.getAbsolutePath(), semester8EEEEPQFolder.getAbsolutePath());
		
		
		btechAll8SemesterPaths.put("Semester1And2", sem1And2Paths);
		btechAll8SemesterPaths.put("Semester3And4", sem3And4Paths);
		btechAll8SemesterPaths.put("Semester5And6", sem5And6Paths);
		btechAll8SemesterPaths.put("Semester7And8", sem7And8Paths);
		
			return btechAll8SemesterPaths;
		}//  end of try
		
		catch(Exception e)
		{
			/*
			 * An error occurred while creating folder structure for Btech
			 */
			e.printStackTrace();
			/*
			 * Delete entire Btech folder 
			 */
			try{
			FileUtils.deleteDirectory(createBTechFolder);
			}
			catch(Exception exp)
			{
				/*
				 * An exception occurred while deleting the Btech folder
				 */
				exp.printStackTrace();
				return null;
			}
			
			return null;
		}
		
		
	}
}
