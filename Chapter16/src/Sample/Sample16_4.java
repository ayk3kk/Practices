package Sample;

/**
 * P356
 * @author 21002S
 *
 */
public class Sample16_4 {

	public static void main(String[] args) {

		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
		System.out.println("変更前 個数 = " + s1.getQuantity());

//		s1.quantity = 23;
		s1.setQuantity(23);
		System.out.println("変更後 個数 = " + s1.getQuantity());
	}

}
