package samples;

/**
 * 演算子による数字と文字列の処理
 * @author AKAKE
 *
 */
public class sample3_2 {

	public static void main(String[] args) {

		String str = "Hello";
		int a = 10;
		int b = 20;

		System.out.println(str + a);
		System.out.println(str + a + b);
		System.out.println(str + (a + b));
		System.out.println(a + b + str);

	}

}
