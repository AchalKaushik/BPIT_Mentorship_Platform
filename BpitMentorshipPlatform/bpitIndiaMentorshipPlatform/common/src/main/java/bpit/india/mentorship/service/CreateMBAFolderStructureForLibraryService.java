package bpit.india.mentorship.service;

import java.io.File;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bpit.india.mentorship.common.ReadApplicationConstantsFile;
import bpit.india.mentorship.dto.MBAFolderPathsDTO;

@Service
public class CreateMBAFolderStructureForLibraryService {
	
	@Autowired
	private ReadApplicationConstantsFile readApplicationConstantsFile;
	
	public MBAFolderPathsDTO createFolderStructureForLibrary(){
		
		File createMBAFolder = new File(readApplicationConstantsFile.getSaveFilesInFolder()+"MBA");                          

		

		/*
		 * Create Folder Structure
		 */
		
		File semester1MBAFolder = new File (createMBAFolder.getAbsolutePath()+"//Semester1");
		
		
		/*
		 * Semester 1 MBA Folder Structure
		 */
		
		File semester1MBAMPOBFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Management Process & Organizational Behaviour");
		File semester1MBADSFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Decision Sciences");
		File semester1MBAMEFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Managerial Economics");
		File semester1MBAAOMFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Accounting for Management");
		File semester1MBAITMFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Information Technology Management");
		File semester1MBABCFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Business Communication");
		File semester1MBALABFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Legal Aspects of Business");
		File semester1MBAMSDFolder = new File(semester1MBAFolder.getAbsolutePath()+"//Managerial Skills Development");

		/*
		 * Semester 2 MBA Folder Structure
		 */
		
		File semester2MBAFolder = new File (createMBAFolder.getAbsolutePath()+"//Semester2");

		File semester2MBAMTICFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Management of Technology, Innovation and Change");
		File semester2MBAFMFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Financial Management");
		File semester2MBAMMFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Marketing Management");
		File semester2MBABRMFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Business Research Methods");
		File semester2MBAOMFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Operations Management");
		File semester2MBAHRMFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Human Resources Management");
		File semester2MBAEBFolder = new File(semester2MBAFolder.getAbsolutePath()+"//e-Business");
		File semester2MBABAFolder = new File(semester2MBAFolder.getAbsolutePath()+"//Business Analytics");

		
		/*
		 * Semester 3 MBA Folder Structure
		 */
		
		File semester3MBAFolder = new File (createMBAFolder.getAbsolutePath()+"//Semester3");
		
		File semester3MBAMIMBFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Management of International Business");
		File semester3MBAISMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Information Systems Management");
		File semester3MBAEDFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Entrepreneurship Development");
		File semester3MBACBFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Consumer Behavior");
		File semester3MBASDMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Sales and Distribution Management");
		File semester3MBAIMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//International Marketing");
		File semester3MBASMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Services Marketing");
		File semester3MBACRMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Customer Relationship Management");
		File semester3MBAIFMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//International Financial Management");
		File semester3MBAFMIFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Financial Markets and Institutions");
		File semester3MBASAIMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Security Analysis and Investment Management");
		File semester3MBACTPFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Corporate Tax Planning");
		File semester3MBAFEFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Financial Econometrics");
		File semester3MBACMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Compensation Management");
		File semester3MBAIRLLFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Industrial Relations and Labor Laws");
		File semester3MBATnDFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Training and Development");
		File semester3MBAPMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Performance Management");
		File semester3MBATMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Talent Management");
		File semester3MBASADFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Systems Analysis and Design");
		File semester3MBAESFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Enterprise Systems");
		File semester3MBANAMFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Network Applications and Management");
		File semester3MBADBMSFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Database Management Systems");
		File semester3MBAISMAFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Information Security Management");
		File semester3MBAIBEFolder = new File(semester3MBAFolder.getAbsolutePath()+"//International Business Environment");
		File semester3MBAEIPPDFolder = new File(semester3MBAFolder.getAbsolutePath()+"//Export, Import Policies, Procedures, and Documentation");
		File semester3MBAWIPRFolder = new File(semester3MBAFolder.getAbsolutePath()+"//WTO and Intellectual Property Rights");
		File semester3MBAIEFolder = new File(semester3MBAFolder.getAbsolutePath()+"//International Economics");
		File semester3MBAIBNFolder = new File(semester3MBAFolder.getAbsolutePath()+"//International Business Negotiation");

		
		/*
		 *Semester 4 MBA Folder Structure 
		 */
		
		File semester4MBAFolder = new File (createMBAFolder.getAbsolutePath()+"//Semester4");
		
		File semester4MBAPDFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Project Dissertation");
		File semester4MBABIAFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Business Intelligence and Applications");
		File semester4MBASMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Strategic Management");
		File semester4MBACSRHVEFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Corporate Social Responsibility, Human Values & Ethics");
		File semester4MBARMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Retail Management");
		File semester4MBAABMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Advertising and Brand Management");
		File semester4MBAIMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Internet Marketing");
		File semester4MBABMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Business Marketing");
		File semester4MBAMACRFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Mergers, Acquisitions and Corporate Restructuring");
		File semester4MBAFDFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Financial Derivatives");
		File semester4MBASFMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Strategic Financial Management");
		File semester4MBABFFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Behavioral Finance");
		File semester4MBASHRMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Strategic Human Resource Management");
		File semester4MBAODFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Organizational Development");
		File semester4MBATBFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Team Building");
		File semester4MBABTCFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Behaviour Testing & Counseling");
		File semester4MBASPMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Software Project Management");
		File semester4MBAWTFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Web Technologies");
		File semester4MBAKMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Knowledge Management");
		File semester4MBADEGFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Digitalization and E-Governance");
		File semester4MBAGCSAFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Global Competitiveness and Strategic Alliances");
		File semester4MBASCMIBFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Supply Chain Management for International Business");
		File semester4MBAMDFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Managing Diversity");
		File semester4MBAGSMFolder = new File(semester4MBAFolder.getAbsolutePath()+"//Global Strategic Management");

		
		
		
		try{
			/*
			 * If folder exists then skip mkdir commands 
			 */
		
			if(!createMBAFolder.exists())
			{
				/*
				 * mkdir commands goes here 
				 */
				
				if(!createMBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Folder 
					 */
					throw new Exception();
				}
				
				if(!semester1MBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBAMPOBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 MPOB Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBADSFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 DS Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBAMEFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 ME Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBAAOMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 AM AOM Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBAITMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 ITM Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBABCFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBALABFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 Folder 
					 */
					throw new Exception();
				}
				if(!semester1MBAMSDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 1 MSD Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				if(!semester2MBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAMTICFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 MTIC Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAFMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 FM Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAMMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 MM Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBABRMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 BRM Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAOMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 OM Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAHRMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 HRM Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBAEBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 EB Folder 
					 */
					throw new Exception();
				}
				if(!semester2MBABAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 2 BA Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				if(!semester3MBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAMIMBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3MIMB Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAISMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 ISM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAEDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 ED Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBACBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 CB Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBASDMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 SDM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBASMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 SM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBACRMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 CRM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIFMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IFM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAFMIFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 FMI Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBASAIMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 SAIM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBACTPFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 CTP Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAFEFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 FE Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBACMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 CM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIRLLFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IRLL Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBATnDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 TND Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAPMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 PM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBATMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 TM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBASADFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 SAD Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAESFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 ES Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBANAMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 NAM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBADBMSFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 DBMS Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAISMAFolder.mkdir())
				{
					
					/* Error occurred while creating MBA Semester 3 ISM Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIBEFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IBE Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIEFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IE Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAEIPPDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 EIPPD Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAIBNFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 IBN Folder 
					 */
					throw new Exception();
				}
				if(!semester3MBAWIPRFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 3 WIPR Folder 
					 */
					throw new Exception();
				}
				
				
				
				
				
				
				
				
				if(!semester4MBAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBABIAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BIA Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBASMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 SM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBACSRHVEFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 CSRHVE Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAPDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 PD Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBARMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAABMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAIMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBABMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBASFMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 SFM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAMACRFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 MACR Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAFDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 FD Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBABFFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BF Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAODFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 OD Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBATBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 TB Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBASHRMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 SHRM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBABTCFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 BTC Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBADEGFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 DEG Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBASPMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 SPM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAWTFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 WT Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAKMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 KM Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAGCSAFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 GCSA Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAMDFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 MD Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBASCMIBFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 SCMIB Folder 
					 */
					throw new Exception();
				}
				if(!semester4MBAGSMFolder.mkdir())
				{
					/*
					 * Error occurred while creating MBA Semester 4 GSM Folder 
					 */
					throw new Exception();
				}
				
			}
			
			/*
			 * Setting DTO 
			 */
			
			MBAFolderPathsDTO mbaFoldersPath= new MBAFolderPathsDTO(
					createMBAFolder.getAbsolutePath(), semester1MBAMPOBFolder.getAbsolutePath(), semester1MBADSFolder.getAbsolutePath(), semester1MBAMEFolder .getAbsolutePath(), semester1MBAAOMFolder.getAbsolutePath(), semester1MBAITMFolder.getAbsolutePath(), semester1MBABCFolder.getAbsolutePath(), semester1MBALABFolder.getAbsolutePath(), semester1MBAMSDFolder.getAbsolutePath(), 
					semester2MBAMTICFolder.getAbsolutePath(), semester2MBAFMFolder.getAbsolutePath(), semester2MBAMMFolder.getAbsolutePath(), semester2MBABRMFolder.getAbsolutePath(), semester2MBAOMFolder.getAbsolutePath(), semester2MBAHRMFolder.getAbsolutePath(), semester2MBAEBFolder.getAbsolutePath(), semester2MBABAFolder.getAbsolutePath(), 
					semester3MBAMIMBFolder.getAbsolutePath(), semester3MBAISMFolder.getAbsolutePath(), semester3MBAEDFolder.getAbsolutePath(), semester3MBACBFolder.getAbsolutePath(), semester3MBASDMFolder.getAbsolutePath(), semester3MBAIMFolder.getAbsolutePath(), semester3MBASMFolder.getAbsolutePath(), semester3MBACRMFolder.getAbsolutePath(), semester3MBAIFMFolder.getAbsolutePath(), semester3MBAFMIFolder.getAbsolutePath(), semester3MBASAIMFolder.getAbsolutePath(), semester3MBACTPFolder.getAbsolutePath(), semester3MBAFEFolder.getAbsolutePath(), semester3MBACMFolder.getAbsolutePath(), semester3MBAIRLLFolder.getAbsolutePath(), semester3MBATnDFolder.getAbsolutePath(), semester3MBAPMFolder.getAbsolutePath(), semester3MBATMFolder.getAbsolutePath(), semester3MBASADFolder.getAbsolutePath(), semester3MBAESFolder.getAbsolutePath(), semester3MBANAMFolder.getAbsolutePath(), semester3MBADBMSFolder.getAbsolutePath(), semester3MBAISMAFolder.getAbsolutePath(), semester3MBAIBEFolder.getAbsolutePath(), semester3MBAEIPPDFolder.getAbsolutePath(), semester3MBAWIPRFolder.getAbsolutePath(), semester3MBAIEFolder.getAbsolutePath(), semester3MBAIBNFolder.getAbsolutePath(), 
					semester4MBAPDFolder.getAbsolutePath(), semester4MBABIAFolder.getAbsolutePath(), semester4MBASMFolder.getAbsolutePath(), semester4MBACSRHVEFolder.getAbsolutePath(), semester4MBARMFolder.getAbsolutePath(), semester4MBAABMFolder.getAbsolutePath(), semester4MBAIMFolder.getAbsolutePath(), semester4MBABMFolder.getAbsolutePath(), semester4MBAMACRFolder.getAbsolutePath(), semester4MBAFDFolder.getAbsolutePath(), semester4MBASFMFolder.getAbsolutePath(), semester4MBABFFolder.getAbsolutePath(), semester4MBASHRMFolder.getAbsolutePath(), semester4MBAODFolder.getAbsolutePath(), semester4MBATBFolder.getAbsolutePath(), semester4MBABTCFolder.getAbsolutePath(), semester4MBASPMFolder.getAbsolutePath(), semester4MBAWTFolder.getAbsolutePath(), semester4MBAKMFolder.getAbsolutePath(), semester4MBADEGFolder.getAbsolutePath(), semester4MBAGCSAFolder.getAbsolutePath(), semester4MBASCMIBFolder.getAbsolutePath(), semester4MBAMDFolder.getAbsolutePath(), semester4MBAGSMFolder.getAbsolutePath());
			
		return mbaFoldersPath;
	}
		
		catch(Exception e)
		{
			/*
			 * An error occurred while creating folder structure for Btech
			 */
			e.printStackTrace();
			/*
			 * Delete entire MBA folder 
			 */
			try{
			FileUtils.deleteDirectory(createMBAFolder);
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



