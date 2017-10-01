package bpit.india.mentorship.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import bpit.india.mentorship.common.AbstractDao;
import bpit.india.mentorship.config.SignUpConfig;
import bpit.india.mentorship.dto.SignUpDto;

@Repository
public class SignUpDao extends AbstractDao {

	@Autowired
	private SignUpConfig signUpConfig;
	
	public int insertIntoSignUp(SignUpDto signUpDto)
	{
		try{
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("firstName",signUpDto.getFirstName());
		parameters.put("lastName",signUpDto.getLastName());
		parameters.put("password",signUpDto.getPassword());
		parameters.put("mobileNumber",signUpDto.getMobileNumber());
		parameters.put("enrollmentNumber",signUpDto.getEnrollmentNumber());
		parameters.put("userId",signUpDto.getUserId());
		parameters.put("course",signUpDto.getCourse());
		parameters.put("registeredAs",signUpDto.getRegisteredAs());
		return getJdbcTemplate().update(signUpConfig.getInsertIntoSignUp(), parameters);
		}
		catch(DuplicateKeyException e)
		{
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 1;
		}
	}
}
