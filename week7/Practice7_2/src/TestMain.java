import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Date day = new Date();

		System.out.print("태어난 년도를 입력하세요: ");
		day.setYear(input.nextInt());
		System.out.print("태어난 월을 입력하세요: ");
		day.setMonth(input.nextInt());
		System.out.print("태어난 날짜를 입력하세요: ");
		day.setDay(input.nextInt());

		int age = 2022 - day.getYear() + 1;
		System.out.println("현재 나이는 " + age + "입니다.");

		System.out.println(day); //day.toString()과 동일
		input.close();
	}

}
