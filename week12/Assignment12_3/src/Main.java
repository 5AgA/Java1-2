import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<>();
		Customer c1 = new Customer(10010, "이순신");
		Customer c2 = new Customer(10020, "신사임당");
		GoldCustomer c3 = new GoldCustomer(10030, "홍길동");
		GoldCustomer c4 = new GoldCustomer(10040, "이율곡");
		VIPCustomer c5 = new VIPCustomer(10050, "김유신", 12345);
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		customer.add(c5);
		
		System.out.println("======= 고객 정보 출력 =======");
		for (Customer person : customer)
			System.out.println(person.showCustomerInfo());
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		for (Customer person : customer)
		{
			System.out.println(person.getName() + " 님이 " + person.calcPrice(10000)
			+ "원 지불하셨습니다.");
			System.out.println(person.getName() + " 님의 현재 보너스 포인트는 " + person.bonusPoint
					+ "점입니다."); 
			
		}
	}

}
