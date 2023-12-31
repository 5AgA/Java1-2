import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, tuition, year;
		double gpa;
		String lab;
		
		System.out.println("학생의 정보를 입력한다");
		System.out.print("학번은? ");
		id = sc.nextInt();
		System.out.print("등록금은? ");
		tuition = sc.nextInt();
		System.out.print("평균등급은? ");
		gpa = sc.nextDouble();
		Student s1 = new Student(id, tuition, gpa);
		System.out.println(s1);
		
		System.out.println("학부생의 정보를 입력한다");
		System.out.print("학번은? ");
		id = sc.nextInt();
		System.out.print("등록금은? ");
		tuition = sc.nextInt();
		System.out.print("평균등급은? ");
		gpa = sc.nextDouble();
		System.out.print("학년은? ");
		year = sc.nextInt();
		Undergraduate s2 = new Undergraduate(id, tuition, gpa, year);
		System.out.println(s2);
		
		System.out.println("대학원생의 정보를 입력한다");
		System.out.print("학번은? ");
		id = sc.nextInt();
		System.out.print("등록금은? ");
		tuition = sc.nextInt();
		System.out.print("평균등급은? ");
		gpa = sc.nextDouble();
		System.out.print("연구실? ");
		lab = sc.next();
		Graduate s3 = new Graduate(id, tuition, gpa, lab);
		System.out.println(s3);
		sc.close();
	}

}
