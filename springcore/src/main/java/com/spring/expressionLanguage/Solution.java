package com.spring.expressionLanguage;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Solution {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/expressionLanguage/expl.xml");
		
		Demo d = context.getBean("object",Demo.class);
		
		
		System.out.println(d);
		
		
		 SpelExpressionParser exp	= new SpelExpressionParser();
		Expression e=exp.parseExpression("543+63653");
		System.out.println(e.getValue());
		
	}

}
