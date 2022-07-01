package sample;

/**
 * Overrideのテストドライバクラス
 * @author 21002S
 *
 */
public class TestOverride {

	public static void main(String[] args) {

		Child c = new Child();
		c.print();

		Parent p = new Child();
		((Child)p).print();		//サブクラス型にダウンキャスト

		Parent p2 = new Child();
		p2.print();	// ← サブクラス側を実行します。
	}

}
