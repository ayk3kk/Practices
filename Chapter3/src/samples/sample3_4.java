package samples;

/**
 * 関係演算子の動作
 *
 * @author AKAKE
 *
 */
public class sample3_4 {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		int c = 10;
//
//		System.out.println(a == b);  //false
//		System.out.println(a == c);  //true
//
//		System.out.println(a != b);  //true
//		System.out.println(a != c);  //false
//
//		System.out.println(a < b);  //true
//		System.out.println(a <= c);  //true
//
//		System.out.println(a > b); //false
//		System.out.println(a >= c);  //true

		//文字列の比較 ==, != では比較できません。
		String s1 = "abc";			//例えば、s1 = 500番地 なら
		String s2 = "abc";			//s2 = 500番地 となる (ヒープメモリ）

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		System.out.println(s1 == s2);		//500番地 == 500番地  同じオブジェクトを参照しているからtrueになった
		System.out.println(s1.equals(s2));

		String s3 = new String("abc");		//1000番地
		String s4 = new String("abc");		//2000番地

		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);

		System.out.println(s3 == s4);	//同一オブジェクトかどうか不明

		System.out.println(s3.equals(s4));
	}

}
