
public class Date {
	int year;
	int month;
	int day;
	
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public void print() {
		System.out.println("당신의 생일은 " + 
	year + "년 " + month + "월 " + day + "일 이네요!");
	}
}
