package samples;

/**
 *
 * 基本データ型の利用
 *
 * @author AKAKE
 *
 */
public class Sample2_7 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;  //変数a,bには、同じ値10が記憶されます。

		System.out.println("a:" + a + " b:" + b);


		b = 50; //bの値を変更します。50で、10を上書きします。

		System.out.println("a:" + a + " b:" + b);
	}

}
