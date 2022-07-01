package sample;

/**
 * 本クラスは、部品としてのクラスのため、
 * javaコマンドで起動することはできません。
 *
 * @author 21002S
 *
 */
public class MyTools {

	public static double bmi(double weight, double height) {

		//BMI指数を計算します。
		double value = weight / Math.pow(height, 2);

		//BMI指数をアプリケーションに返します。
		return Math.round(value);
	}

	public static int calconv(String nengo, int wareki) {

		int result = wareki;

		switch(nengo) {
		case "s":
		case "S": result += 1925;
				  break;
		case "h":
		case "H": result += 1988;
				  break;
		case "r":
		case "R": result += 2018;
				  break;
		}

		return result;

	}

//		int result = switch(nengo) {
//		case "S", "s" -> wareki + 1925;
//		case "H", "h "-> wareki + 1988;
//		case "R", "r" -> wareki + 2018;
//		default -> wareki;
//		}


		//wordの後ろに空白を詰め、長さlenに加工して返すメソッド。
		public static String padding(String word, int len) {

			String result = word;

			//後ろに詰めるべき文字数:n を計算します。
			int n = len - word.length();

			//lenに文字数が満たない場合は、wordの後ろに不足する分の文字を詰めます。
			if(n > 0) {
				result = word + " ".repeat(n);
			}

			//結果を返します。
			return result;

		}

		//標準体重を計算して、結果を表示するメソッド

		public static void stdWeight(double height) {

			 System.out.println("標準体重=" + (height - 100)* 0.9);
		}


		//値を集計して返すメソッド
		public static int sum(int[] data) {

			int result = 0;

			//拡張for文で、配列要素を集計します。
			for(int num : data) {
				result += num;
			}

			return result;
		}
}
