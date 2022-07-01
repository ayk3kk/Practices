package Practices;

/**
 * 練習問題⑧ 解説
 * 
 * @author 21002S
 *
 * ※try-catch P499
 *
 */
public class Practice08_answer {

	//※内容変更しない→final付ける
	//[x-1]したくなかったら,使わない零を入れる→「先頭要素の"零"は現在未使用です」とコメント
	private static final String[] NUMS_KANJI = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};


	public static void main(String[] args) {

		int numMax = 81;

		// 最大値が指定されている場合は、整数変換します。
		if(args.length > 0) {
			try {
				//文字列を整数に変換するメソッドを使う
				numMax = Integer.parseInt(args[0]);
			}catch(NumberFormatException e) {
				System.out.println("最大値には整数を指定してください。");
				return;
			}
		}

		outer: for(int x = 1; x <= 9; x++) {

			//漢数字のラベルを出力します。
			showLabel(x);

			inner: for(int y = 1; y <= 9; y++) {

				int result = x * y;
				System.out.printf("%d * %d = %2d\n", x, y, result);

				//指定された最大値に達した場合は、処理を終了します。
				if(result >= numMax) {
					break outer;
				}
			}
		}

	}
	//漢数字のラベルを出力します。
	private static void showLabel(int x) {

		System.out.println("-".repeat(12));
		System.out.println("■" + NUMS_KANJI[x] + "の算");
		System.out.println("-".repeat(12));
	}
}
