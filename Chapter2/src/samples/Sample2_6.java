package samples;

/**
 * 配列と基本データ型の違い
 *
 * @author akake
 *
 */
public class Sample2_6 {

	public static void main(String[] args) {

		//基本データ型は、初期化しないとアクセスできません。
		int i = 12345;

		System.out.println("iの値：" +i);

		//要素数1の配列オブジェクトが作れますが、用途はあまりありません。
		//オブジェクトの値は、データ型に応じた値で自動初期化されます。
		int[] array = new int[1];

		System.out.println("array[0]の値：" + array[0]);
		System.out.println("array[0]の値：" + array[1]);	//←2番目の要素
	}

}
