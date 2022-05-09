package com.uragil.spring050905;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		Student stu1 = ctx.getBean("student1", Student.class);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getHobbys());
		System.out.println(stu1.getHeight());
		System.out.println(stu1.getWeight());
		
		Student stu2 = ctx.getBean("student2", Student.class);
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		System.out.println(stu2.getHobbys());
		System.out.println(stu2.getHeight());
		System.out.println(stu2.getWeight());

		
	}

}
