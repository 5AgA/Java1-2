import java.util.Scanner;
public class Assignment6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rollno, age;
		String name;
		
		System.out.print("이름을 입력하시오.: ");
		name = sc.next();
		System.out.print("학번을 입력하시오.: ");
		rollno = sc.nextInt();
		System.out.print("나이를 입력하시오.: ");
		age = sc.nextInt();
		Student std = new Student(name, rollno, age);
		std.print();

	}

}
