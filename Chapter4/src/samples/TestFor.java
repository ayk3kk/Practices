package samples;

/**
 * for文による繰り返しの練習
 *
 * @author AKAKE
 *
 */
public class TestFor {

	public static void main(String[] args) {

//		//整数列0～20を表示します。
//		for(int i = 0; i <= 20; i++){
//		System.out.println(i);
//		}

//	//整数列：20～0を表示します。
// for(int i = 20; i >= 0; i--) {
//	 System.out.println(i);
// }


		//配列要素を格納に表示します。
//	String[] langs = {"Java", "Ruby", "Python", "PHP", "C/C++", "COBOL", "Javascript"};
//	for(int i = 0; i < langs.length; i++) {
//		System.out.println(langs[i]);
//	}


		String s = "Hello,World!";

		//文字列sを縦書きで表示します。
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		//文字列sを逆順で表示します。
		for(int i = s.length() -1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
}
}


