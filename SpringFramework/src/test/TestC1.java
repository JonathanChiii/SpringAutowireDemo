package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import business.Student;
import business.Customer;

public class TestC1 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory (new ClassPathResource("resources/spring.xml"));
		
		Student t = (Student) factory.getBean("t");
		Student t1 = (Student) factory.getBean("t");
		Student t2 = (Student) factory.getBean("t1");
		// Singleton pattern
		System.out.println( t.hashCode() == t1.hashCode());
		System.out.println( t.hashCode() == t2.hashCode());
		t.setName("Arbys");
		System.out.println(t.toString());
	}
}
