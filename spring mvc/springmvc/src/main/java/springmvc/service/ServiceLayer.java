package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.model.User;
import springmvc.studentDao.StudentDao;
@Service
public class ServiceLayer {
	
	@Autowired
	private StudentDao studentDao;
	
	public int createUser(User user){
		
		return this.studentDao.saveUser(user);
		
	}
	
	

}
