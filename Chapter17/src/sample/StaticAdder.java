package sample;

/**
 * P370 例題17-5
 *
 * @author 21002S
 *
 */
public class StaticAdder {

	private static int number;

	public static void add() {
		number++;
	}

	public static void main(String[] args) {

		number += 10;

		add();
		add();
		System.out.println("number = " + number);

	}

	//Static Initializer(静的初期化子)
	//プログラム起動時、staticメンバーがメモリーにロードされた直後に、
	//JVMがこれを実行します。
	static {

		System.out.println("クラスメンバーがメモリーにロードされました。");
		number = 100;
	}

}
