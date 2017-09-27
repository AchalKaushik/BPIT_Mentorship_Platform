package bpit.india.mentorship.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.common.ReadApplicationConstantsFile;

@Service
public class CreateFolderStructureForLibraryService {

	@Autowired
	private ReadApplicationConstantsFile readApplicationConstantsFile;
	
	public String createFolderStructureForLibrary()
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
		

		/*
		 * Semester 6 IT Folder Structure
		 */
		
		File semester6ITFolder = new File(createBTechSemester6Folder.getAbsolutePath()+"//IT");
		File semester6ITCDFolder = new File(semester6ITFolder.getAbsolutePath()+"//Compiler Design");
		File semester6ITOSFolder = new File(semester6ITFolder.getAbsolutePath()+"//Operating Systems");
		File semester6ITDCNFolder = new File(semester6ITFolder.getAbsolutePath()+"//Data Communication and Networks");
		File semester6ITWEFolder = new File(semester6ITFolder.getAbsolutePath()+"//Web Engineering");
		File semester6ITAIFolder = new File(semester6ITFolder.getAbsolutePath()+"//Artificial Intelligence");

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
		
		
		
		return null;
	}
}
