package sample;

/**
 * P450  例題20-5
 * @author 21002S
 *
 */

//抽象クラス
abstract class Parent {

	//抽象メソッド
	public abstract void print();
}

//具象クラス
class Child extends Parent{

	@Override
	public void print() {
		System.out.println("Childクラス");
	}
}
