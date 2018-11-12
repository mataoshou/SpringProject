package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBean {
	private static SpringBean one;
	public static SpringBean single()
	{
		if(one==null)
		{
			one= new SpringBean();
			one.context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		}
		
		return one;
	}
	
	 ApplicationContext context =null;
	 
	 public ApplicationContext getContext()
	 {
		 return context;
	 }
	 
	 public void reload()
	 {
		 this.context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	 }
}
