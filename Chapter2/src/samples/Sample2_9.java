package samples;

/**
 * コマンドラインパラメータの使用 ★ブロンズ試験によくでる
 *
 * @author AKAKE
 *
 * ※コマンドラインパラメータを3つ入力する必要があります。
 *
 */
public class Sample2_9 {

	public static void main(String[] args) {

		//3つ入力されていない場合は、エラーメッセージを表示し、main()を終了します。
		if(args.length != 3) {
			System.out.println("コマンドラインパラメータを3つ入力してください。");
				return;
		}

		System.out.println(args[0]);
		System.out.println(args[1]);   //"10"
		System.out.println(args[2]);   //"20"

		System.out.println(args[1] + args[2]);   //"10" + "20" →"1020" 文字列の足し算

		//文字列を整数変換します。
		int num1 = Integer.parseInt(args[1]);	//"10" → 10
		int num2 = Integer.parseInt(args[2]);	//"20" → 20

		System.out.println(num1 + num2);
	}

}
