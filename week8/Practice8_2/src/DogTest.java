import java.util.Scanner;
public class DogTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog[] dogArray = new Dog[3];
		String n, t;
		
		
		for (int i = 0; i < 3; i++)
		{
			System.out.print("pet의 이름을 입력하세요: ");
			n = sc.next();
			System.out.print("pet의 종류를 입력하세요: ");
			t = sc.next();
			dogArray[i] = new Dog(n, t);
		}
		
		System.out.println("** for문 **");
		for (int i = 0; i < 3; i++)
			System.out.println(dogArray[i]);
		
		System.out.println("** foreach문 **");
		for (Dog pet : dogArray)
			System.out.println(pet);
		
		sc.close();
	}

}
