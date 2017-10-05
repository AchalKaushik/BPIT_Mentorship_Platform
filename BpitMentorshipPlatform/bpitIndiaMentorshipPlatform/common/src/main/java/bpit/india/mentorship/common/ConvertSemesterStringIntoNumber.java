package bpit.india.mentorship.common;

import org.springframework.stereotype.Service;

@Service
public class ConvertSemesterStringIntoNumber {

	public String convertSemesterStringIntoNumber(String semester)
	{
		if(semester.equalsIgnoreCase("First") || semester.equalsIgnoreCase("1"))
			return "1";
		else if(semester.equalsIgnoreCase("Second"))
			return "2";
		else if(semester.equalsIgnoreCase("Third"))
			return "3";
		else if(semester.equalsIgnoreCase("Fourth"))
			return "4";
		else if(semester.equalsIgnoreCase("Fifth"))
			return "5";
		else if(semester.equalsIgnoreCase("Sixth"))
			return "6";
		else if(semester.equalsIgnoreCase("Seventh"))
			return "7";
		else if(semester.equalsIgnoreCase("Eighth"))
			return "8";
		else
			return null;
	}
}

