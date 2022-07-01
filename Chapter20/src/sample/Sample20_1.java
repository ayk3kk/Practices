package sample;

/**
 * P436 例題20-1「参照の受け渡し」
 *
 * @author 21002S
 *
 */
public class Sample20_1 {

	public static void main(String[] args) {

		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
		System.out.println(s1);  // → s1.toString()に変換

		test(s1);
		System.out.println(s1);
	}

	// s1 → sales: 参照変数間の代入が行われ、双方が同一オブジェクトを参照した状態になります。
	// ※オブジェクトが二つに増加するわけではありません。
	public static void test(Sales sales) {

		// 販売数量を更新します。
		sales.setQuantity(50);
	}
}
