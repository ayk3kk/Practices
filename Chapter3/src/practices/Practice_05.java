package practices;

import lib.Input;

/**
 * @author 21002S
 *クラスの上に入れる
 *日付、カレンダー →dateを使う
 *
 */
public class Practice_05 {

	public static void main(String[] args) {

		int num = Input.getInt("月の数字(1～12)");

		int MonthNom = 0; //（変数名）最初m小文字がよい

		switch (num) {

		case 1:
			MonthNom = 31;
			break;
		case 2:
			MonthNom = 28;
			break;
		case 3:
			MonthNom = 31;
			break;
		case 4:
			MonthNom = 30;
			break;
		case 5:
			MonthNom = 31;
			break;
		case 6:
			MonthNom = 30;
			break;
		case 7:
			MonthNom = 31;
			break;
		case 8:
			MonthNom = 31;
			break;
		case 9:
			MonthNom = 30;
			break;
		case 10:
			MonthNom = 31;
			break;
		case 11:
			MonthNom = 30;
			break;
		case 12:
			MonthNom = 31;
			break;

		default:
			break;

		}
		if (num < 1 || num > 12) {
			System.out.println("エラー：月を1～12の範囲で指定してください。");
		} else {
			System.out.println(num + "月の日数は、" + MonthNom + "日です。");
		}
	}

}
