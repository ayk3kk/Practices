package practices;

public class Practice07_answer {

	public static void main(String[] args) {

		//0は発生しない仕様のため1で初期化、minは最大値で初期化
		int numMax = 1;
		int numMin = 100;


		for(int i = 1; i <= 25; i++) {

			int num = getRandomNumber();
			System.out.printf("%3d: %3d -> ", i, num);
			System.out.println((num % 2) == 1 ? "奇数":"偶数");

			//最大値・最小値を求めます。
			if(num > numMax) {
				numMax = num;
			}
			if(num < numMin) {
				numMin = num;
			}
		}//for

		//最大最小値を出力
		System.out.println("―――――――――");
		System.out.printf("最大値： %3d\n", numMax );
		System.out.printf("最小値： %3d\n", numMin);
	}


	//ランダム整数を生成し、返すメソッドを作る
	private static int getRandomNumber() {

		return (int)(Math.random() * 100 + 1);

		//Math.random() → 0.0 ～ 0.99999
		//* 100 →0.0 ～ 99.99999
		// + 1 → 1.0 ～ 100.9999
		//(int) → 1 ～ 100
	}
}
