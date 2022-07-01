package Sample;

/**
 * P347
 * @author 21002S
 *
 */
public class Sample16_2 {

	public static void main(String[] args) {

		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
//		s1.code ="SY-200";
//		s1.name = "冷蔵庫";
//		s1.price = 50000;
//		s1.quantity = 20;
//		s1.stock = true;
		Sales s2 = new Sales("TB-100", "洗濯機", 30000, 15, true);
		Sales s3 = new Sales("AX-551", "テレビ", 15000, 32, false);


		//売上明細一覧を表示します。
		System.out.println("\n■売上明細一覧");
		System.out.printf("%s, %s, %d円, %d個, 在庫%s\n", s1.getCode(), s1.getName(), s1.getPrice(), s1.getQuantity(), s1.isStock() ?"あり" : "なし");
		System.out.printf("%s, %s, %d円, %d個, 在庫%s\n", s2.getCode(), s2.getName(), s2.getPrice(), s2.getQuantity(), s2.isStock() ?"あり" : "なし");
		System.out.printf("%s, %s, %d円, %d個, 在庫%s\n", s3.getCode(), s3.getName(), s3.getPrice(), s3.getQuantity(), s3.isStock() ?"あり" : "なし");

		//売上合計金額を表示します。
		int total = s1.getPrice() * s1.getQuantity() + s2.getPrice() * s2.getQuantity() + s3.getPrice() * s3.getQuantity();
		System.out.println("―".repeat(40));
		System.out.println("合計金額:" + total + "円");

//		System.out.printf("合計金額：%d円\n",(s1.price * s1.quantity) +  (s2.price * s2.quantity) +  (s3.price * s3.quantity));

		System.out.println("終了しました。");
	}

}
