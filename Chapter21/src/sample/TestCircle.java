package sample;

public class TestCircle {

	public static void main(String[] args) {

		Shape s1 = new Circle("青", 100);

		System.out.println("色: "+ s1.getColor());
		System.out.println("面積: " + s1.area());
		System.out.println("半径; " + ((Circle)s1).getRadius());
	}

}
