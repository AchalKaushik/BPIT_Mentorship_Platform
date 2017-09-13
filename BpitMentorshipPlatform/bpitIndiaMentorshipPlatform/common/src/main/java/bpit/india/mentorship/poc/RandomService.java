package bpit.india.mentorship.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomService {

	@Autowired
	private RandomDao randomDao; 
	
	public String randomService()
	{
		System.out.println("In service");
		int status = randomDao.insertIntoTable();
		System.out.println(randomDao.selectFromTable());
		
		if(status>0)
			return " Success";
		else 
		return "Fail";
	}
}
