import java.util.Scanner;
public class Assignment5_2 {

	static void address(String name, String add) {
		System.out.print(name + "의 주소는 " + add + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, add;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		add = sc.nextLine();
		
		address(name, add);
	}
}
