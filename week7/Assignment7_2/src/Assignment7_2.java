import java.util.Scanner;
public class Assignment7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("디폴트 영화의 정보입니다.");
		Movie movie = new Movie();
		System.out.print(movie);
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		movie.setTitle(sc.next());
		System.out.print("감독은? ");
		movie.setDirector(sc.next());
		System.out.print("제작사는? ");
		movie.setProduction(sc.next());
		
		System.out.println("\n입력한 영화의 정보입니다.");
		System.out.print(movie);
		sc.close();
	}

}