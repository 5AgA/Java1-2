import java.util.Scanner;
public class Assignment8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] user = new User[100];
		int num, i = 0;
		String Id, Pw;
		
		do
		{
			System.out.println("======================================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("======================================");
			System.out.print("번호를 입력하시오: ");
			num = sc.nextInt();
			if (num == 1)
			{
				System.out.print("Id: ");
				Id = sc.next();
				System.out.print("Password: ");
				Pw = sc.next();
				user[i++] = new User(Id, Pw);
			}
			else if (num == 3)
			{
				for (int j = 0; j < User.count; j++)
					System.out.println("{ " + user[j].userId + ", "
							+ user[j].password + " }");
			}	
		} while(num != 4);
		sc.close();
	}
	
}
