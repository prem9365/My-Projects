package com.spring.jdbc.studentdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.practice.Student;


//@Component  //create object automatically ,

public class StudentImpl implements StudentDao{
	
	
	
	
//@Autowired   //it will automatically inject ..

	private JdbcTemplate jdbcTemplate;

	public int insert(Student1 s) {
		
        String q="insert into Student(id,S_name,Branch) value (?,?,?)";

		
		int r = this.jdbcTemplate .update(q,s.getId(),s.getS_name(),s.getBranch());
		
		return r;
	}
	
	
	
	public int change(Student1 student) {
		
		String query ="update Student set S_name=?,Branch=? where id=?";
		
		int result = this.jdbcTemplate.update(query,student.getId(),student.getS_name(),student.getBranch());
		
		return result;
	}
	
	
	
	
	
	/*public Student getStudent(int studentId) {
		
		String query ="select * from Student where id =?";
		
		this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		return null;
	}

	*/
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}





	public int delete(int studentId) {

		String que ="delete from Student where id=?";
		
		int d = jdbcTemplate.update(que,studentId);
		
		return d;
	}



	




	
	
}
