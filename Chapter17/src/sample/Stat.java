package sample;

/**
 * 例題17-9 「統計（Statistics）オブジェクトのデータ構造」
 *
 * @author 21002S
 *
 */
public class Stat {

	private double[] x; //データ配列

	// コンストラクタ① ... APから配列ごと初期値を受け渡します。
	public Stat(double[] x) {
		this.x = x;  //具体的な値で配列xを初期化します。
	}

	// コンストラクタ② ... APから配列の要素数を受け渡し、新規配列を生成します。
	public Stat(int size) {
		this.x = new double[size]; //各要素は、0.0で初期化されます。
	}

	// 配列xの合計値を返します。
	public double sum() {

		double result = 0;

		for(double num : this.x) {
			result += num;
		}

		return result;
	}

	//配列xの平均値を返します。
	public double mean() {
		
		return this.sum() / this.x.length;
	}

	//引数iで指定された配列要素を返します。
	public double get(int i) {

		return this.x[i];
	}

	//受け渡された値aを、引数iで指定された要素に代入します。
	public void set(int i, double a) {

		this.x[i] = a;
	}
}
