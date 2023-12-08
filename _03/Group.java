package _03;

import java.util.Enumeration;
import java.util.Hashtable;

public class Group {

	private String name;
	
	private Hashtable<String, Student> groupStudents;
	
	public Group() {
		groupStudents = new Hashtable<String, Student>();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hashtable<String, Student> getGroupStudents() {
		return groupStudents;
	}

	public void setGroupStudents(Hashtable<String, Student> groupStudents) {
		this.groupStudents = groupStudents;
	}
	
	public void addKeyValueHashtable(String key, Student value) {
		groupStudents.put(key, value);
	}
	
	public void showGroupStudents() {
		
		Enumeration<String> list = groupStudents.keys();
		
		while(list.hasMoreElements()) {
			String key = list.nextElement();
			groupStudents.get(key);
			
			System.out.println("Key:" + key + " - Value: " + groupStudents.get(key));
			
		}
		
	}
	
	
}
