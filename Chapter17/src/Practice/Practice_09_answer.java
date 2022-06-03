package Practice;

import lib.Input;
import sample.ResultSet;

/**
 * 練習問題⑨ 模範解答 ＜改修＞
 *
 * @author 21002S
 *
 */
public class Practice_09_answer {

	public static void main(String[] args) {



		final String PROMPT = "月の数字(1～12)を入力してください";
		final String MSG_TITLE = "■月の和名検索";
		final String MSG_FINISH = "\n// 終了しました //";
		final String END = "E";

		String strNum = null;
		int num = 0;

		System.out.println(MSG_TITLE);

		while (true) {

			// コンソールから数字を入力し、大文字変換します。
			System.out.println();
			strNum = Input.getString(PROMPT).toUpperCase();

			// 終了判定をおこないます。
			if (strNum.equals(END)) {
				break;
			}

			try {
				// 入力された文字列を整数変換します。
				num = Integer.parseInt(strNum);
			} catch (NumberFormatException e) {
				// 例外文字列が入力されている場合は、後続処理をスキップします。
				continue;
			}

			// 例外データが入力されている場合は、後続処理をスキップします。
			if (num < 1 || num > 12) {
				continue;
			}

			//月の名前を検索します。
			 ResultSet rs = searchNames(num);

			// 和名配列を検索し、結果を表示します。
			System.out.printf("\n%2d月の名前は「%s(%s)」で、"
					+ "日数は「%s日」です。\n", num, rs.getNameJpn(), rs.getNameEng(), rs.getDays());
		}

		System.out.println(MSG_FINISH);
	}//main


	//引数numで指定された配列要素を返します。

	private static ResultSet searchNames(int num) {

		//各名前を2次元配列でまとめて定義します。
		final String[][] NAMES = {
				{ "未使用", "睦月", "如月", "弥生", "卯月",
					"皐月", "水無月", "文月", "葉月","長月", "神無月", "霜月", "師走" },
				{"Unused","January", "February", "March", "April", "May", "June", "July", "August",
					"September", "October", "November", "December"}
		};

		final int[] DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//3つの検索結果をResultSetでひとまとめにして、返します。（データ型違うものが入ると配列で出来ない）
		return new ResultSet(NAMES[0][num], NAMES[1][num], DAYS[num]);


//		//それぞれの検索結果を、配列でひとまとめにします。
//		String[] names = new String[2];
//		names[0] = NAMES_WAMEI[num];
//		names[1] = NAMES_ENG[num];
//
//
//		return names;
	}

}
