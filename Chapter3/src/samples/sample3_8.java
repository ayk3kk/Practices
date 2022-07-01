package samples;

import lib.Input;

public class sample3_8 {

	public static void main(String[] args) {
		//コマンドラインパラメータの値でnumを初期化する。
//		int num = Integer.parseInt(args[0]);

		//コンソールからnumに値を入力します。
		int num = Input.getInt("numの値");



		if(num < 10) {
			System.out.println("numの値は10未満です。");
		}else {
			System.out.println("numの値は10以上です。");
		}

		System.out.println("if-else文の外の処理");
	}

}
