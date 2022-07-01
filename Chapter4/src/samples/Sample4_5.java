package samples;

public class Sample4_5 {

	public static void main(String[] args) {

		int count = 0; //スコープが、main()のブロック内に広がります。↓のfor文の式1を省略する。
		for(; count < 5; count++) {

			System.out.println("count = " + count);
		}

		System.out.println("繰り返した回数：" + count );
	}

}
