package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		
         AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
        context.registerShutdownHook();
   //     samosa s1=(samosa) context.getBean("s1");
	//	System.out.println(s1);
		//shutdown hook
	//	context.registerShutdownHook();
	//System.out.println("+++++++++++++++++");
//	pepsi p1=(pepsi) context.getBean("p1");
	
//	System.out.println(p1);
	Pizza pizza=(Pizza) context.getBean("pizza");
	System.out.println(pizza);
	
	}
	
	

}
