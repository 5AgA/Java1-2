
public class Food {
	int cal, cost, kg;
	
	void setCal(int cal) { this.cal = cal; }
	void setCost(int cost) { this.cost = cost;}
	void setKg(int kg) { this.kg = kg; }
	int getCal() { return cal; }
	int getCost() { return cost; }
	int getKg() { return kg; }
	
	public Food() {
		this(0, 0, 0);
	}
	public Food(int cal, int cost, int kg) {
		setCal(cal);
		setCost(cost);
		setKg(kg);
	}
}
