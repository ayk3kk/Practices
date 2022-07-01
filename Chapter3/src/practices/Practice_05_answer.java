package practices;

import lib.Input;

/**
 *  ⑤回答例
 * @author AKAKE
 *
 */
public class Practice_05_answer {

	public static void main(String[] args) {

		final String MSG_ERR = "エラー：月を1～12の範囲で指定ください。";
		int result = 0;

		int num = Input.getInt("月の数字(1～12)");

		//例外データが入力されている場合は、エラーメッセージを表示し、終了します。
		if(num < 1 || num > 12) {
			System.out.println(MSG_ERR);
			return;
		}

		//指定された月の日数を判定します。
		switch(num) {
			case 2:
				result = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = 30;
				break;
			default:
				result = 31;

		}

		//結果を表示します。
		System.out.printf("\n%d月の日数は、%d日です。\n", num, result);

	}

}
