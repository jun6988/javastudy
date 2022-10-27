package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1; // upcasting (암시적, implicity)
		p1.setName("둘리");
		
		Student s2 = (Student)p1; // downcastig (명시적, explicity) / (Student)로 명시
		s2.setMajor("computer Science");
	}

}
