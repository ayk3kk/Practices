package sample;

/**
 *
 * substringメソッドを使ってみる
 *
 * @author 21002S
 *
 */
public class TestSubstring {

	public static void main(String[] args) {

		String str = "Hello, Java Programming.";

		//"Java"以降のすべてを取り出し、表示します。
		System.out.println(str.substring(7));

//		String result = str.substring(7);
//		System.out.println(result);

		//"Hello"のみを取り出して、表示します。
		System.out.println(str.substring(0, 5));

	}

}
