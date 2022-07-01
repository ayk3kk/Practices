package practices;

/**
 * ③回答例
 * @author 平石先生
 *
 */
public class Practice03_answer {

	public static void main(String[] params) {

		if(params.length != 3) {
			System.out.println("半径を3つ入力してください。");
			return;
		}

		//コマンドラインで指定された「半径」を整数変換します。
		int radius1 = Integer.parseInt(params[0]);
		int radius2 = Integer.parseInt(params[1]);
		int radius3 = Integer.parseInt(params[2]);

		//各円の面積を求め、結果を表示します。
		calcArea(1, radius1);
		calcArea(2, radius2);
		calcArea(3, radius3);


		}//main()

		//円の面積を求めて、結果を表示します。
		private static void calcArea(int num, int radius) {

			final double PI = 3.14;

			double area = Math.pow(radius, 2) * PI;
			System.out.printf("円%dの面積：%8.2f 平方メートル\n", num, area);

	}

}
