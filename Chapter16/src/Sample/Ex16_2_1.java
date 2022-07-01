package Sample;

/**
 * 練習16-2 （P351）
 * @author 21002S
 *
 */
public class Ex16_2_1 {

	public static void main(String[] args) {

		//Orderオブジェクトを3つインスタンス生成します。
		Order odr1 = new Order("ICBK61","2020-07-11", 2100, 5, true);
		Order odr2 = new Order("ICBK62", "2020-09-02", 1050, 10, false);
		Order odr3 = new Order("ICBK63","2020-07-15", 1050, 12, true);


		System.out.println("終了しました。");
	}

}
