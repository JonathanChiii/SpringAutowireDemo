package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] agrs) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/spring.xml");
		// if ac is called, all the class constructor defined in the beans is called.
		// thus 2 objects are created. 
		
		ac.getBean("t");
		// ApplicationContext is eager container
		// BeanFactory is lazy container: depends on the getBean method to create object.
		
	}

}
