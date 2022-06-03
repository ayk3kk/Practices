package Practice;

import lib.Input;

/**
 * 練習問題⑨ 月の和名検索
 * @author 21002S
 *
 */
public class Practice_09 {

	public static void main(String[] args) {

		final String[] NAMES_WAMEI = {"未使用", "睦月", "如月", "弥生", "卯月", "皐月", "水無月",
				"文月", "葉月", "長月", "神無月", "霜月", "師走"};

		final String PROMPT = "月の数字(1～12)を入力してください";
		final String MSG_TITLE = "\n■月の和名検索";
		final String MSG_FINISH = "// 終了しました //";
		final String END = "E";

		String strNum = null;
		int num = 0;

		System.out.println(MSG_TITLE);

		while(true) {

			System.out.println();
			//コンソールから数字を入力します  ↓メソッドチェイン
			strNum = Input.getString(PROMPT).toUpperCase();

			//終了判定をおこないます。
			if(strNum.equals(END)) {
				break;
			}

			try {
				//入力された文字列を整数変換します。
				num = Integer.parseInt(strNum);

			}catch (NumberFormatException e) {
				//例外文字列が入力されている場合は、後続処理をスキップします。
				continue;
			}


			//例外データが入力されている場合は、後続処理をスキップします。
			if(num < 1 || num > 12) {
				continue;
			}

			//配列を検索し、結果を表示します。
			System.out.printf("\n%2d月の和名は「%s」です。\n", num, NAMES_WAMEI[num]);
		}

		System.out.println(MSG_FINISH);

	}

}

//	private static final String[] KANJI_month = {"睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月", "葉月", "長月", "神無月", "霜月", "師走"};
//
//
//
//
//		while(com != "E" || com != "e") {
//
//			String com = Input.getString("月の数字(1～12)を入力してください");
//
//
//		if(Integer.parseInt(com) >= 1 && Integer.parseInt(com) <= 12) {
//
//		month(Integer.parseInt(com));
//
//★文字列の比較はイコールズメソッド
//		}else(com == "e" || com == "E"){
//			System.out.println("// 終了しました //");
//
//		}
//
//			}
//
//	private static void month(int com) {
//		System.out.println(com + "の和名は「" + KANJI_month[com - 1]  + "」です");
//	}


