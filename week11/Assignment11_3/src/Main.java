import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntArrayUtil iau = new IntArrayUtil();
		int size;
		
		System.out.print("난수의 개수를 입력하세요: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		iau.genRandom(arr);
		System.out.println("발생된 난수입니다.");
		iau.printArray(arr);
		
		sc.close();
	}

}
