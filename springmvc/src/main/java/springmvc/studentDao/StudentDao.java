package springmvc.studentDao;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;
@Repository
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernate ;
	
	@Transactional
	public int saveUser(User user){
		
		  Integer result=(Integer)this.hibernate.save(user);
		return result ;
		
		
	}
	
	

}
