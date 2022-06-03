package sample;

public class Ex17_1_2 {

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

		System.out.println("■高額売上一覧");

		//P365 練習17-1
			for(Sales s : sales) {
				if(s.isHighSales()) {
					System.out.printf("%s %s %d %d %s\n",
									s.getCode(),s.getName(),s.getPrice(),s.getQuantity(),s.isStock());
				}

			}

		/*
		//配列から「商品名」のみを取り出し、一覧表示します。
		for(int i = 0; i < sales.length; i++) {

			System.out.println(sales[i].getName());
		}

		//拡張for文で「商品番号」を一覧表示します。
		for(Sales s : sales) {

			System.out.println(s.getCode());
		}

 */


	}
}
