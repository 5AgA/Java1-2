
public class Assignment7_4 {

	public static void main(String[] args) {
		Dice d = new Dice();
		int cnt = 0;
		int v1, v2;
		
		do
		{
			d.roll();
			v1 = d.getValue();
			d.roll();
			v2 = d.getValue();
			System.out.println("주사위1= " + v1 + " 주사위2= " + v2);
			cnt++;
			
		} while (v1 + v2 != 2);
		System.out.println("(1, 1)이 나오는데 걸린 횟수= " + cnt);
	}
}
