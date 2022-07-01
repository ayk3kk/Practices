package practices;

/**
 * 練習問題③
 * @author AKAKE
 *
 */
public class Practice03 {

	public static void main(String[] args) {

		final double PI = 3.14;

//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		double area1 = num1 * num1 * PI;
		double area2 = num2 * num2 * PI;
		double area3 = num3 * num3 * PI;

		System.out.printf("円1の面積: %8.1f 平方メートル\n", area1);
		System.out.printf("円2の面積: %8.1f 平方メートル\n", area2);
		System.out.printf("円3の面積: %8.1f 平方メートル\n", area3);

	}


}
