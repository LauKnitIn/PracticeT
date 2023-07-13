package tercerPunto;

public class Student {
	
	private int age;
	private String name;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge () {
		return age;
	}
	public String getStudent () {
		return name +"-> "+age;
	}
}
