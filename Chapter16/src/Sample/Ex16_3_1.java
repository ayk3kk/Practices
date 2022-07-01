package Sample;

/**
 * P355 練習16－3
 * @author 21002S
 *
 */
public class Ex16_3_1 {

	public static void main(String[] args) {

		//Orderオブジェクトをインスタンス生成します。
		Order ord1 = new Order("ICBK61", "2020-07-11", 2100, 5, true);

		//Orderオブジェクトの値を表示します。
		System.out.println("型　番 = " + ord1.getId());
		System.out.println("受注日 = " + ord1.getDate());
		System.out.println("価　格 = " + ord1.getPrice());
		System.out.println("個　数 = " + ord1.getQuantity());
		System.out.println("納　品 = " + ord1.isDelivery());
	}

}
