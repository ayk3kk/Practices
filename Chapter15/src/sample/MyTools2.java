package sample;

public class MyTools2 {

		// 直角三角形の面積を計算し、返します。
		// 引数a：高さ、b：底辺
		public int triangle(int a, int b) {

	//		int area = a * b / 2;
			return a * b / 2;
		}

		// 正三角形の面積を計算し、返します。
		// 引数a：一片の長さ
		public static int triangle(int a) {

			return (int)(Math.sqrt(3) * Math.pow(a, 2)) / 4;


		}

}
