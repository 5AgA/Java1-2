import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String title;
		double score, sum = 0;
		Book[] book = new Book[size];
		// 코드 작성
		
        for (int i = 0; i < size; i++)
		{
        	Book book[i] = (Book) new Book();
			title = sc.next();
			score = sc.nextDouble();
			book[i].title = title;
			book[i].score = score;
			sum += score;
		}
        System.out.println((int)sum / 2);
        sc.close();
	}

}