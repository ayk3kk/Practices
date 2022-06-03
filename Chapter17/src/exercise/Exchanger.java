package exercise;

import lib.Input;

/**
 * P375
 * 練習17-3 円をドル換算(オブジェクト指向版)
 *
 * @author 21002S
 *
 */
public class Exchanger {

	private double yen;

	public Exchanger(double yen) {
		super(); //書かなくても大丈夫　自動で入る。 superクラス コンストラクトを呼び出す。親クラスを実行する
		this.yen = yen;
	}

	public double toDollar() {

		return this.yen / 106;
	}

	public double getYen() {
		return this.yen;
	}

	public void setYen(double yen) {
		this.yen = yen;
	}

	//直接、このクラスを起動します。
	public static void main(String[] args) {

		double yen = Input.getDouble("円");

		Exchanger ex = new Exchanger(yen);
		double dollar = ex.toDollar();

		//換算結果を表示します。
		System.out.printf("\\%3.0f = ＄%3.1f\n", yen, dollar);
	}
}
