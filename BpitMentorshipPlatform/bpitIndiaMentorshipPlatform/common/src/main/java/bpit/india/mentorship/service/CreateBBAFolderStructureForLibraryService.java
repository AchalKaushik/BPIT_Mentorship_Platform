package bpit.india.mentorship.service;

import java.io.File;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.common.ReadApplicationConstantsFile;
import bpit.india.mentorship.dto.BBAFolderPathsDTO;

@Service
public class CreateBBAFolderStructureForLibraryService {
	
	@Autowired
	private ReadApplicationConstantsFile readApplicationConstantsFile;
	
	
	public BBAFolderPathsDTO createFolderStructureForLibrary(){
		
		
		File createBBAFolder = new File(readApplicationConstantsFile.getSaveFilesInFolder()+"BBA");                          
		
		

		/*
		 * Create Folder Structure
		 */
		
		
		/*
		 * Semester 1 BBA Folder Structure
		 */
		File semester1BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester1");
		
		
		File semester1BBAPOMFolder = new File(semester1BBAFolder.getAbsolutePath()+"//Principles of Management");
		File semester1BBABE1Folder = new File(semester1BBAFolder.getAbsolutePath()+"//Business Economics-I");
		File semester1BBABMFolder = new File(semester1BBAFolder.getAbsolutePath()+"//Business Mathematics");
		File semester1BBAIITFolder = new File(semester1BBAFolder.getAbsolutePath()+"//Introduction to IT");
		File semester1BBAFAFolder = new File(semester1BBAFolder.getAbsolutePath()+"//Financial Accounting");
		File semester1BBAPDCSFolder = new File(semester1BBAFolder.getAbsolutePath()+"//Personality Development & Communication Skills-I");
		
		/*
		 * Semester 2 BBA Folder Structure 
		 */
		
		File semester2BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester2");
		
		
		File semester2BBABOFolder = new File(semester2BBAFolder.getAbsolutePath()+"//Business Organization");
		File semester2BBABE2Folder = new File(semester2BBAFolder.getAbsolutePath()+"//Business Economics-II");
		File semester2BBAQTORMFolder = new File(semester2BBAFolder.getAbsolutePath()+"//Quantitative Techniques and Operations Research in Management");
		File semester2BBADBMSFolder = new File(semester2BBAFolder.getAbsolutePath()+"//Data Base Management System ");
		File semester2BBACAFolder = new File(semester2BBAFolder.getAbsolutePath()+"//Cost Accounting");
		File semester2BBAPDCS2Folder = new File(semester2BBAFolder.getAbsolutePath()+"//Personality Development & Communication Skills-II");
		
		
		
		
		/*
		 * Semester 3 BBA Folder Structure
		 */
		
		File semester3BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester3");
		
		
		File semester3BBAOBFolder = new File(semester3BBAFolder.getAbsolutePath()+"//Organizational Behaviour");
		File semester3BBAIEFolder = new File(semester3BBAFolder.getAbsolutePath()+"//Indian Economy");
		File semester3BBAMMFolder = new File(semester3BBAFolder.getAbsolutePath()+"//Marketing Management");
		File semester3BBACA1Folder = new File(semester3BBAFolder.getAbsolutePath()+"//Computer Applications -I");
		File semester3BBAMAFolder = new File(semester3BBAFolder.getAbsolutePath()+"//Management Accounting");
		File semester3BBAPDCS3Folder = new File(semester3BBAFolder.getAbsolutePath()+"//Personality Development & Communication Skills-III");

		
		
		/*
		 * Semester 4 BBA Folder Structure
		 */
		File semester4BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester4");
		
		
		File semester4BBAHRMFolder = new File(semester4BBAFolder.getAbsolutePath()+"//Human Resource Management");
		File semester4BBABEFolder = new File(semester4BBAFolder.getAbsolutePath()+"//Business Environment");
		File semester4BBAMRFolder = new File(semester4BBAFolder.getAbsolutePath()+"//Marketing Research");
		File semester4BBACA2Folder = new File(semester4BBAFolder.getAbsolutePath()+"//Computer Applications - II");
		File semester4BBABLFolder = new File(semester4BBAFolder.getAbsolutePath()+"//Business Laws");
		File semester4BBATLFolder = new File(semester4BBAFolder.getAbsolutePath()+"//Taxation Laws");

		
		
		
		/*
		 * Semester 5 BBA Folder Structure
		 */
		File semester5BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester5");
		
		
		File semester5BBAVEBFolder = new File(semester5BBAFolder.getAbsolutePath()+"//Values & Ethics in Business");
		File semester5BBASMFolder = new File(semester5BBAFolder.getAbsolutePath()+"//Sales Management ");
		File semester5BBAPOMFolder = new File(semester5BBAFolder.getAbsolutePath()+"//Production & Operations Management");
		File semester5BBAMISFolder = new File(semester5BBAFolder.getAbsolutePath()+"//Management Information System");
		File semester5BBAFMFolder = new File(semester5BBAFolder.getAbsolutePath()+"//Financial Management");

		
		/*
		 * Semester 6 BBA Folder Structure
		 */
		
		File semester6BBAFolder = new File (createBBAFolder.getAbsolutePath()+"//Semester6");
		
		
		File semester6BBABPSFolder = new File(semester6BBAFolder.getAbsolutePath()+"//Business Policy & Strategy");
		File semester6BBAPPEFolder = new File(semester6BBAFolder.getAbsolutePath()+"//Project Planning & Evaluation");
		File semester6BBAEDFolder = new File(semester6BBAFolder.getAbsolutePath()+"//Entrepreneurship Development");
		File semester6BBAIBMFolder = new File(semester6BBAFolder.getAbsolutePath()+"//International Business Management");
		File semester6BBAEVSFolder = new File(semester6BBAFolder.getAbsolutePath()+"//Environmental Science");

		
		
		
		
		
		
		
		try{
			/*
			 * If folder exists then skip mkdir commands 
			 */
		
			if(!createBBAFolder.exists())
			{
				/*
				 * mkdir commands goes here 
				 */
				
				if(!createBBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Folder 
					 */
					throw new Exception();
				}
				
				if(!semester1BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBAPOMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 POM Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBABE1Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 BE1 Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBABMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBAIITFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 IIT Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBAFAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester1BBAPDCSFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 1 PDCS Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				if(!semester2BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBABOFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 BO Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBABE2Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 BE2 Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBAQTORMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 QTORM Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBADBMSFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 DBMS Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBACAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 CA Folder 
					 */
					throw new Exception();
				}
				if(!semester2BBAPDCS2Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 2 PDCS2 Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				
				if(!semester3BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBAOBFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 OB Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBAIEFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 IE Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBAMMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 MM Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBACA1Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 CA1 Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBAMAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 MA Folder 
					 */
					throw new Exception();
				}
				if(!semester3BBAPDCS3Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 3 PDCS3 Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				if(!semester4BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBAHRMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 HRM Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBABEFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 BE Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBAMRFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 MR Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBACA2Folder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 CA2 Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBABLFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 BL Folder 
					 */
					throw new Exception();
				}
				if(!semester4BBATLFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 4 TL Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				
				if(!semester5BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 Folder 
					 */
					throw new Exception();
				}
				if(!semester5BBAVEBFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 VEB Folder 
					 */
					throw new Exception();
				}
				if(!semester5BBASMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 SM Folder 
					 */
					throw new Exception();
				}
				if(!semester5BBAPOMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 POM Folder 
					 */
					throw new Exception();
				}
				if(!semester5BBAMISFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 MIS Folder 
					 */
					throw new Exception();
				}
				if(!semester5BBAFMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 5 FM Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				
				if(!semester6BBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6 Folder 
					 */
					throw new Exception();
				}
				if(!semester6BBABPSFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6 BPS Folder 
					 */
					throw new Exception();
				}
				if(!semester6BBAPPEFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6 PPE Folder 
					 */
					throw new Exception();
				}
				if(!semester6BBAEDFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6  Folder 
					 */
					throw new Exception();
				}
				if(!semester6BBAIBMFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6  Folder 
					 */
					throw new Exception();
				}
				if(!semester6BBAEVSFolder.mkdir())
				{
					/*
					 * Error occurred while creating BBA Semester 6 EVS Folder 
					 */
					throw new Exception();
				}
				
			}
			
			
			
			//HashMap<String, Object> bbaAll8SemesterPaths = new HashMap<String, Object>();
			
			/*
			 * Setting paths for Semester 1 & semester 2 folders 
			 */
			
			
			BBAFolderPathsDTO b = new BBAFolderPathsDTO(
					createBBAFolder.getAbsolutePath(), semester1BBAFolder.getAbsolutePath(), semester1BBAPOMFolder.getAbsolutePath(), semester1BBABE1Folder.getAbsolutePath(), semester1BBABMFolder.getAbsolutePath(), semester1BBAIITFolder.getAbsolutePath(), semester1BBAFAFolder.getAbsolutePath(), semester1BBAPDCSFolder.getAbsolutePath(),
					semester2BBAFolder.getAbsolutePath(), semester2BBABOFolder.getAbsolutePath(), semester2BBABE2Folder.getAbsolutePath(), semester2BBAQTORMFolder.getAbsolutePath(), semester2BBADBMSFolder.getAbsolutePath(), semester2BBACAFolder.getAbsolutePath(), semester2BBAPDCS2Folder.getAbsolutePath(), 
					semester3BBAFolder.getAbsolutePath(), semester3BBAOBFolder.getAbsolutePath(), semester3BBAIEFolder.getAbsolutePath(), semester3BBAMMFolder.getAbsolutePath(), semester3BBACA1Folder.getAbsolutePath(), semester3BBAMAFolder.getAbsolutePath(), semester3BBAPDCS3Folder.getAbsolutePath(),
					semester4BBAFolder.getAbsolutePath(), semester4BBAHRMFolder.getAbsolutePath(), semester4BBABEFolder.getAbsolutePath(), semester4BBAMRFolder.getAbsolutePath(), semester4BBACA2Folder.getAbsolutePath(), semester4BBABLFolder.getAbsolutePath(), semester4BBATLFolder.getAbsolutePath(),
					semester5BBAFolder.getAbsolutePath(), semester5BBAVEBFolder.getAbsolutePath(), semester5BBASMFolder.getAbsolutePath(), semester5BBAPOMFolder.getAbsolutePath(), semester5BBAMISFolder.getAbsolutePath(), semester5BBAFMFolder.getAbsolutePath(), 
					semester6BBAFolder.getAbsolutePath(), semester6BBABPSFolder.getAbsolutePath(), semester6BBAPPEFolder.getAbsolutePath(), semester6BBAEDFolder.getAbsolutePath(), semester6BBAIBMFolder.getAbsolutePath(), semester6BBAEVSFolder.getAbsolutePath());
			
			
			return b;
			//return null;
			
		}
				
		catch(Exception e)
		{
			/*
			 * An error occurred while creating folder structure for Btech
			 */
			e.printStackTrace();
			/*
			 * Delete entire BBA folder 
			 */
			try{
			FileUtils.deleteDirectory(createBBAFolder);
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
