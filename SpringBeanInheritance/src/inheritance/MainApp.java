package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*If you observed here(in Beans.xml), we did not pass message2 while creating "helloIndia" 
 * bean, but it got passed because of Bean Definition Inheritance.*/

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld worldobj = (HelloWorld) context.getBean("worldinstance");		
		worldobj.getMessage1();
		worldobj.getMessage2();
		
		HelloIndia indiaobj = (HelloIndia) context.getBean("indiainstance");
		indiaobj.getMessage1();
		indiaobj.getMessage2();
		indiaobj.getMessage3();			
	}
}


