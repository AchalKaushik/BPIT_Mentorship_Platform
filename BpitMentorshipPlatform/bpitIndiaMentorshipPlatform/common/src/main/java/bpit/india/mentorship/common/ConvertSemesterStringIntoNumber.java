package bpit.india.mentorship.common;

import org.springframework.stereotype.Service;

@Service
public class ConvertSemesterStringIntoNumber {

	public String convertSemesterStringIntoNumber(String semester)
	{
		if(semester.equalsIgnoreCase("First") || semester.equalsIgnoreCase("1"))
			return "1";
		else if(semester.equalsIgnoreCase("Second") || semester.equalsIgnoreCase("2"))
			return "2";
		else if(semester.equalsIgnoreCase("Third") || semester.equalsIgnoreCase("3"))
			return "3";
		else if(semester.equalsIgnoreCase("Fourth") || semester.equalsIgnoreCase("4"))
			return "4";
		else if(semester.equalsIgnoreCase("Fifth") || semester.equalsIgnoreCase("5"))
			return "5";
		else if(semester.equalsIgnoreCase("Sixth") || semester.equalsIgnoreCase("6"))
			return "6";
		else if(semester.equalsIgnoreCase("Seventh") || semester.equalsIgnoreCase("7"))
			return "7";
		else if(semester.equalsIgnoreCase("Eighth") || semester.equalsIgnoreCase("8"))
			return "8";
		else
			return null;
	}
}

