package bpit.india.mentorship.poc;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomService1 {
	
	@Autowired
	private RandomDao randomDao;
	
	public Collection<RandomDto> randomService1()
	{
		return randomDao.selectFromTable();
	}
}
