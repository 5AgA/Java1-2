
public class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	public void roll() {
		value = (int)(Math.random() * (7 - 1) + 1);   // 1 ~ 6
	}
	public int getValue() {return value;}
	public void setValue() { this.roll(); }
}
