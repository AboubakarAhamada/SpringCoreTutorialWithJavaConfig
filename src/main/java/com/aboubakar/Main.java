/**
 * 
 */
package com.aboubakar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Aboubakar
 *
 */
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Here we use AnnotationConfigApplicationContext class provided by Spring to
		 * signal that we use Annotation based configuration and not XML based configuration like 
		 * we did in the SpringCoreTutorial (remember : we user this :
		 * 		ApplicationContext context = new ClassPathXmlApplicationContext("mySpringXmlFile.xml");
		 */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsung s6 = (Samsung)context.getBean(Samsung.class);
		
		s6.configure();

	}

}
