package sample;

/**
 *
 * toStringメソッド P366
 * @author 21002S
 *
 */
public class TestToString {

	public static void main(String[] args) {
		// Salesオブジェクト6つを配列でグループ化します。
		Sales[] sales = {
				new Sales("SY-200", "冷蔵庫", 50000, 20, true),
				new Sales("TB-100", "洗濯機", 30000, 15, true),
				new Sales("AX-551", "テレビ", 15000, 32, false),
				new Sales("XS-112", "掃除機", 22000, 23, false),
				new Sales("PC-123", "パソコン", 150000, 10, true),
				new Sales("AC-123", "エアコン", 120000, 15, true)
		};

		//配列のSalesオブジェクトをシーケンシャルアクセスします。
		for(Sales s : sales) {

			System.out.println(s);
		}
	}

}
