package samples;

/**
 *
 * 論理演算子の動作
 *
 * @author AKAKE
 *
 */
public class sample3_5 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;

		boolean result1 = a++ > 10 & ++b > 10;		//aは10と評価されてから加算  false & true
		System.out.println("result1: " + result1 + " a: " + a + " b: " + b);

		boolean result2 = c++ > 10 && ++d > 10;		//&&のため、右辺は実行されない  false && true
		System.out.println("result2: " + result2 + " c: " + c + " d: " + d);
	}

}
