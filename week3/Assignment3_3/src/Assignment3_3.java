import java.util.Scanner;
public class Assignment3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op;
		double n, m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요: ");
		op = sc.next();
		System.out.println("숫자 2개를 입력하세요(ex. 3 23) : ");
		n = sc.nextDouble();
		m = sc.nextDouble();
		
		if (op.equals("+"))
			System.out.println(n + "+" + m + " = " + (n+m));
		else if (op.equals("-"))
			System.out.println(n + "-" + m + " = " + (n-m));
		else if (op.equals("*"))
			System.out.println(n + "*" + m + " = " + (n*m));
		else if (op.equals("/"))
		{
			if (m == 0)
				System.out.println("연산을 수행할 수 없다");
			else
				System.out.println(n + "/" + m + " = " + (n/m));
		}
		sc.close();    //sc 오류, result 변수 설정해야 오류 잡기 쉬움
	}

}
