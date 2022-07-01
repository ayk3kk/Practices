package samples;

/**
 * キャスト演算子
 * randomメソッド
 *
 * @author 21002S
 *
 */
public class TestCasting {

	public static void main(String[] args) {

		byte b1 = 127;	// -128 ～ 127 → int →byteへの自動縮小変換
		System.out.println("b1 = " + b1);

//		byte b2 = 128;	//int → byteへの変換は行われません
		byte b2 = (byte)128;	//byte型へキャストで無理やり変換。
		// 0000 0000 0000 0000 0000 0000 0000 1000 0000 ← int の 128
		//					↓ byte型へ強制変換
		//									  1000 0000 ← byteの -128
		System.out.println("b2 = " + b2);

		double d = 123.456;
		int i = (int)d;		//小数部が切り捨てになる
		System.out.println("i = " + i);

		//サイコロの目（1～6）をランダムに発生させます。
		for(int j = 0; j < 10; j++) {

			int num = (int)(Math.random() * 6 + 1);		//randomメソッドは戻り値double型
			System.out.println("num = " + num);
		}
	}

}
