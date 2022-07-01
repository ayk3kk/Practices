package samples;

/**
 * 配列を作成して値を格納・出力
 *
 * @author akake
 *
 */
public class Sample2_5 {

	public static void main(String[] args) {

		char[] c;   //cは、配列オブジェクトの参照変数
		c = new char[3]; //char型変数3つをグループ化します。

		//配列cの各要素に文字を代入します。
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';

		//配列cの要素を個別に取り出し、表示します。
		System.out.println("c[0] : " + c[0]);

		//int型3つをグループ化した配列iを作ります。
		int i[] = new int[3];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		System.out.println("i[1] = " + i[1]);

		//配列iに記憶されている値の合計値を表示します。
//		System.out.println("配列iの合計値 : " + (i[0] + i[1] + i[2]));   //()でくくらないと、文字列＋文字列として認知されてしまう
		int total = i[0] + i[1] + i[2];
		System.out.println("配列iの合計値 : " + total);

		//String型配列で、文字列をグループ化します。
		String[] str = {"Welcome", "to", "Java", "Programming"};    //newを使わずに配列を作る方法
		//配列strの要素数を表示します。       配列オブジェクトの中にインスタンスメソッド
		System.out.println("配列strの要素数：" + str.length);			//このlengthはメソッド名じゃないから（）つかない



	}

}
