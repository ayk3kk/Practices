package practices;
//4月28日写メ別回答あり

public class Practice04 {

	public static void main(String[] args) {

		//各言語種別を定数定義します。
		final String JAPANESE = "J";
		final String ENGLISH = "E";
		final String FRENCH = "F";

		final String MSG_ERR = "正しい「言語種別(J,E,F)」を指定してください。";

		String result = MSG_ERR;

		//コマンドラインパラメータの存在チェックを行う。
		if(args.length < 1) {
			System.out.println(MSG_ERR);
			return; //main()を終了
		}
			//コマンドラインで指定された値を変数へ取り込みます。
			String lang = args[0].toUpperCase();

			//指定された値に応じたメッセージをresultに代入します。
			if(lang.equals(JAPANESE)){
				result = "こんにちは、Java。";
			}else if(lang.equals(ENGLISH)){
				result = "Hello, Java.";
			}else if (lang.equals(FRENCH)){
				result = "Bonjour, Java.";
			}else {
				//何も行わない（エラーメッセージで初期化しているのでそれが表示される）
		}

			//結果を表示します。
			System.out.println(result);
		}
}


