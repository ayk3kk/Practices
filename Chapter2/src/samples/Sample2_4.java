package samples;

/**
 * 定数の例
 *
 * @author akake
 *
 */
public class Sample2_4 {

	public static void main(String[] args) {

		int num1 = 10; //宣言と同時に初期化
		num1 = 20;		//変数は値の変更が可能です。
		System.out.println("num1 = " + num1);

		final int NUM2 = 10;  //定数を宣言します。
//		NUM2 = 20;

		//文字列の例
		String str = "Hello";
		String name = "田中";

		System.out.println("str = " + str);
		System.out.println("name = " + name);

		//文字列オブジェクトに組み込まれているインスタンスメソッド
		String s1 = "Tanaka";
		System.out.println(s1.length());	//文字数
		System.out.println(s1.charAt(2));	//0から数え始めるため、3番目の文字
		
	}

}
