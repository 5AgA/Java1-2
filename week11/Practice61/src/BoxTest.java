
public class BoxTest {

	public static void main(String[] args) {
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		
		System.out.println("디폴트 상자의 정보입니다.\n" + b0 + "\n");
		System.out.println("첫번째 상자의 정보입니다.\n" + b1 + "\n");
		System.out.println("두번째 상자의 정보입니다.\n" + b2 + "\n");
		
		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");
		
		System.out.println("\nbox1의 정보입니다.");
		System.out.println("가로: " + box1.getX() + ", 세로: " + box1.getY() + ", 높이: " + box1.getZ());
		System.out.println("재질: " + box1.getAttri());
		System.out.println("부피: " + (box1.getX() * box1.getY() * box1.getZ()));
		System.out.println("무게: " + (box1.getX() * box1.getY() * box1.getZ()) * 1.1);
		
		System.out.println("\nbox2의 정보입니다.");
		System.out.println("가로: " + box2.getX() + ", 세로: " + box2.getY() + ", 높이: " + box2.getZ());
		System.out.println("재질: " + box2.getAttri());
		System.out.println("부피: " + (box2.getX() * box2.getY() * box2.getZ()));
		System.out.println("무게: " + (box2.getX() * box2.getY() * box2.getZ()) * 1.1);
	}

}
