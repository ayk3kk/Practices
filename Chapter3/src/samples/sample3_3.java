package samples;

/**
 * インクリメント演算子とデクリメント演算子
 *
 * @author AKAKE
 *
 */
public class sample3_3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;

		System.out.println(a++);	//加算前の値を評価
		System.out.println(++b);	//加算後の値を評価
		System.out.println(c--);	//加算前の値を評価
		System.out.println(--d);	//加算後の値を評価

		a = 10;
		b = 10;
		c = 10;
		d = 10;

		b = ++a;
		System.out.println("a = " + a + " b = " +b);

		d = c++;
		System.out.println("c = " + c + " d = " + d);


		int e = 10;
		int f = 10;

//		e = e + 5;
//		f = f - 5;

		e += 5;
		f -= 5;
		System.out.println("e = " + e + " f = " + f);


	}

}
