package _03;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 * class representing a group of students
 */
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
	
	/**
	 * This method displays the information contained in the groupStudents Hashtable
	 */
	public void showGroupStudents() {
		// Get an enumeration of the keys in the Hashtable.
		Enumeration<String> list = groupStudents.keys();
		
		// Iterate through the keys using the enum.
		while(list.hasMoreElements()) {
			// Get the current key.
			String key = list.nextElement();
			// Access the value associated with the key
			Student value = groupStudents.get(key);
			
			System.out.println("Key:" + key + " - Value: " + value);
			
		}
		
	}
	
	
}
