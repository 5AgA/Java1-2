import java.util.StringTokenizer;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("문자열을 입력하시오 : ");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + ", ");
			cnt++;
		}
		System.out.println("\n 모두 " + cnt + "개의 단어가 있습니다.");
		sc.close();
	}

}
