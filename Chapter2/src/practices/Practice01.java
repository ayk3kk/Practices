package practices;

public class Practice01 {

	public static void main(String[] args) {

		//円周率を定数定義します。
		final double PI = 3.14;

			//3つの円の半径を宣言・初期化します。
		int radius1 = 10;
		int radius2 = 20;
		int radius3 = 30;

		 	//面積を計算します。※自分で宣言した変数も選択入力できる（ctrl ＋SP）
		double area1 = Math.pow(radius1, 2) * PI;
		double area2 = Math.pow(radius2, 2) * PI;
		double area3 = Math.pow(radius3, 2) * PI;

		//処理結果をコンソールに出力します。
		showResult(1, radius1, area1);
		showResult(2, radius2, area2);
		showResult(3, radius3, area3);

	}//main()

	//処理結果をコンソールに出力します。
	private static void showResult(int num, int radius, double area) {

		System.out.printf("円%dの半径： %8d メートル\n", num, radius);
		System.out.printf("円%dの面積: %8.2f 平方メートル\n\n", num, area);

	}


}
