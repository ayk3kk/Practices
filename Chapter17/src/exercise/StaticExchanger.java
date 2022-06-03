package exercise;

//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Input;
 import lib.Input;

/**
 * P375  練習17-3
 * 日本円をドルに換算します(為替レート：1ドル = 106円)
 *
 * @author 21002S
 *
 */
public class StaticExchanger {

	private static double yen;

	public static double toDallar() {
		return yen / 106;
	}

	public static void main(String[] args) {

		//コンソールから「円」を入力します。
		yen = Input.getDouble("円");
		//ドルに換算します。
		double dollar = toDallar();
		//換算結果を表示します。
		System.out.printf("\\%3.0f = ＄%3.1f\n", yen, dollar);

	}
}
