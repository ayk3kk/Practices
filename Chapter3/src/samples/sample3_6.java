package samples;

public class sample3_6 {

	public static void main(String[] args) {

		String str1 = null;		//オブジェクトがない→文字数表示したらヌルポでる
		String str2 = "";	//Stringオブジェクトが生成されます。

		int[] array1 = null;
		int[] array2 = new int[1];

		int num = 0;

		System.out.println(str1 == null);	// true
		System.out.println(str2 == null);	// false

		// str1, str2 の文字数を表示します。
//		System.out.println("str1の文字数：" + str1.length() + "文字です。");
		System.out.println("str2の文字数：" + str2.length() + "文字です。");

		System.out.println(array1 != null);		//false
		System.out.println(array2 != null);		//true

		//array1,array2 の要素数を表示します。
//		System.out.println("array1の要素数：" + array1.length + "個です。");
		System.out.println("array2の要素数：" + array2.length + "個です。");
	}

}
