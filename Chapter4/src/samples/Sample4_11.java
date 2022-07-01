package samples;

public class Sample4_11 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++) {

			//3の倍数の場合、後続処理をスキップします。
			if((i % 3) == 0) {
				System.out.println("処理をスキップします。");
				continue;
			}

			//以下がスキップ対象になる処理です。
			System.out.println("i = " + i);

		}//for

		System.out.println("for文の後の処理");
	}

}
