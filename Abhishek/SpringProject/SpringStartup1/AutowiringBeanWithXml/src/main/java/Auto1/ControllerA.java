package Auto1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class ControllerA {
		// TODO Auto-generated method stub
		
	    @RequestMapping(value="/hello",method=RequestMethod.GET)  
	     @ResponseBody
	     public void main(String args[]) throws Exception {  
	        	 ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");     
	        	 A a=context.getBean("a",A.class);
	        	 a.display();
	        	    //obj.config();
	        	  //  return "well done Abhishek";
	        	   //  
	    
	    }
	}


