package week1_day1;

public class Student {
	String name = "Vasu";
	int rollNo = 1450999;
	
public void collegeName(String collegeName) {
	
	System.out.println("collegeName:" +collegeName);
	
}

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println("Student Name:" + student.name);
		student.collegeName("Annamalai University");
		student.collegeName("information technology");

	}

}
