import java.util.Scanner;
public class Assignment7_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = new String();
		
		System.out.print("문자열을 입력하세요: ");
		str = sc.next();
		System.out.println("대문자로 변환: " + str.toUpperCase());
		System.out.print("거꾸로 출력: ");
		for (int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(str.length() - i - 1));
		sc.close();
	}

}
