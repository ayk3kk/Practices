package sample;

/**
 * instanceof演算子の確認
 * @author 21002S
 *
 */

class A{}
class B extends A{}
class C extends B{}	//C is a A, C is a B, C is a C
class D extends C{}	//D is a C

public class Sample20_4 {

	public static void main(String[] args) {

		A a = new C();

		System.out.println(a instanceof A);  //aは、A型オブジェクトです。
		System.out.println(a instanceof B);  //aは、B型オブジェクトです。
		System.out.println(a instanceof C);  //aは、C型オブジェクトです。
		System.out.println(a instanceof D);  //aは、D型オブジェクトです。
	}

}
