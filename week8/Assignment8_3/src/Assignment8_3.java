
public class Assignment8_3 {

	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		
		myAccount1.deposit(10000);
		System.out.println("myAccount1: " + myAccount1);
		myAccount2.deposit(30000);
		System.out.println("myAccount2: " + myAccount2);
		myAccount2.withdraw(5000);
		System.out.println("myAccount2: " + myAccount2);
		myAccount1.transfer(myAccount2, 5000);
		System.out.println("myAccount1: " + myAccount1);
		System.out.println("myAccount2: " + myAccount2);
	}

}
