package _03;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();
		
		// id name course
		Student antonio = new Student("a3", "Antonio", "BackEnd Developer Java");
		Student arya = new Student("ar1000", "Arya", "FrontEnd Developer");
		Student chula = new Student("c3", "Chula", "DevOps");
		

		group.addKeyValueHashtable(antonio.getIdCard(), antonio);
		group.addKeyValueHashtable(arya.getIdCard(), arya);
		group.addKeyValueHashtable(chula.getIdCard(), chula);
		
		group.showGroupStudents();
		
	}

}
