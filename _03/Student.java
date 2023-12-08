package _03;

public class Student {
	
	String idCard, name, course;

	public Student(String idCard, String name, String course) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [idCard=" + idCard + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
