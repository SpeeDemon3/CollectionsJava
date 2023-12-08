package _03;
/**
 * class representing a student
 */
public class Student {
	
	private String idCard, name, course;

	public Student(String idCard, String name, String course) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.course = course;
	}
	
	

	public String getIdCard() {
		return idCard;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student [idCard=" + idCard + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
