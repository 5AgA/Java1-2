
public class Student {
	static String name;
	static int rollno = 0, age = 0;
	
	Student(String n, int r, int a) {
		name = n;
		rollno = r;
		age = a;
	}
	void print() {
		System.out.println("이름: " + name);
		System.out.println("학번: " + rollno);
		System.out.println("나이: " + age);
	}
}
