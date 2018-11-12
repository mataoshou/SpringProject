package bean;

public class AopLog {
	public void before()
	{
		System.out.println("before action method");
	}
	
	public void after()
	{
		System.out.println("after action method");
	}
}
