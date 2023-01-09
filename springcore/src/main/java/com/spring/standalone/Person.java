package com.spring.standalone;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
   @Component  //Stereotypes annotation for bean declaration by spring container
   
   @Scope("prototype")
public class Person {
  
	private List<String> friends;
	
	
	//Stereotypes annotations for collection objects
	
	@Value("#{fees}")
	private Map<String,Integer> feesStructure;
	
	
	//Stereotypes annotations
	@Value("2663")
    private int score;
    
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStructure=" + feesStructure + ", score=" + score + "]";
	}

}
