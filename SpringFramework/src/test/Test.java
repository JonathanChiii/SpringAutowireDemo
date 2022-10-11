package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/spring.xml");
		// Constructor will be called for all beans in the spring.xml
		
		Student obj = (Student) ac.getBean("obj");
		System.out.println(obj.toString());
	}

}
