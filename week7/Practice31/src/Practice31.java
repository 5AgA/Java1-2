import java.util.Scanner;
public class Practice31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.print("내 키를 입력하세요: ");
		p1.setHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요: ");
		p1.setWeight(sc.nextInt());
		System.out.print("당신의 키를 입력하세요: ");
		p2.setHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요: ");
		p2.setWeight(sc.nextInt());
		
		if (p1.isTallerThan(p2.getHeight()))
			System.out.println("키는 내가 더 큽니다.");
		else
			System.out.println("키는 당신이 더 큽니다.");
		
		if (p1.needDiet())
			System.out.println("나는 다이어트가 필요합니다.");
		else
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		if (p2.needDiet())
			System.out.println("당신은 다이어트가 필요합니다.");
		else
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
	}
	
}
