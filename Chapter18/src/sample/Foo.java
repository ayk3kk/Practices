package sample;

/**
 * P405
 * @author 21002S
 *
 */
public class Foo {

	private String name;

	public Foo(String name) {

		this.name = name;
		//フィールド変数が定義されていないため、初期化するものがありません。
	}

	public void printFoo() {

		System.out.println("Fooクラス");
	}
}
