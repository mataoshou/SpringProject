package bean;

import java.util.Random;

public class SweetTeacher implements Person {
	public SweetTeacher()
	{
		Random r = new Random();
		this.name="th";
		this.age = r.nextInt(100);
	}
	
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		Random r = new Random();
		this.age = age +r.nextInt(50);
	}
	private int age;
	@Override
	public void showMy() {
		System.out.println("I am a teacher");
		
	}
}
