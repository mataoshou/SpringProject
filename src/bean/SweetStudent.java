package bean;

public class SweetStudent implements Person {
	
	public SweetStudent()
	{
		
	}
	
	public SweetStudent(SweetTeacher t)
	{
		this.teacher = t;
	}
	
	private String name;
	private int age;
	private SweetTeacher teacher;
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
		this.age = age;
	}
	public SweetTeacher getTeacher() {
		return teacher;
	}
	public void setTeacher(SweetTeacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public void showMy() {
		System.out.println("I am a student");
		
	}
}
