import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		Student s1 = new Student(101, "Kim", 23);
		Student s2 = new Student(102, "Choi", 25);
		Student s3 = new Student(103, "Baek", 26);
		Student s4 = new Student(104, "Park", 23);
		Student s5 = new Student(105, "Chang", 22);
		Student s6 = new Student(106, "Kang", 29);
		Student s7 = new Student(107, "Rang", 26);
		Student s8 = new Student(108, "Yong", 27);
		Student s9 = new Student(109, "Jung", 22);
		Student s10 = new Student(110, "Tak", 21);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al,Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}

	}

}
