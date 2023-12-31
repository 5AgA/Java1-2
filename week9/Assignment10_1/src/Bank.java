import java.util.Scanner;

public class Bank {
	static BankAccount b0 = new BankAccount("방탄", 100, 3.5);
	static BankAccount b1 = new BankAccount("소년", 2000, 2.1);
	static BankAccount b2 = new BankAccount("아이유", 500, 3.25);
	
	static void printAcc() {
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		printAcc();
		System.out.print("\n계좌" + b0.getAccNo() + "에 입금할 금액을 입력하세요:");
		if(b0.deposit(sc.nextInt()))
			System.out.println("입금이 성공했습니다.\n");
		else
			System.out.println("입금이 실패했습니다.\n");
		// ----------------------------------------------------------------------------
		printAcc();
		System.out.print("\n계좌" + b1.getAccNo() + "에서 출금할 금액을 입력하세요:");
		if(b1.withdraw(sc.nextInt()))
			System.out.println("출금이 성공했습니다.\n");
		else
			System.out.println("출금이 실패했습니다.\n");
		// ----------------------------------------------------------------------------
		printAcc();
		System.out.print("\n계좌" + b1.getAccNo() + "에서 계좌" + b2.getAccNo() + "으로\n"
				+ "송금할 금액을 입력하세요:");
		if(BankAccount.transfer(b1, b2, sc.nextInt()))
			System.out.println("송금이 성공했습니다.\n");
		else
			System.out.println("송금이 실패했습니다.\n");
		
		printAcc();
		
		sc.close();
	}

}
