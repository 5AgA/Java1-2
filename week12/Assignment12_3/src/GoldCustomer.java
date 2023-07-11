
public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		super.setGrade("GOLD");
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return (int)(price * (1 -saleRatio));
	}
	
}
