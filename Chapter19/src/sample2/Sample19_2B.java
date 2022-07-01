package sample2;

//import sample.Foo;		//クラスFooのネームスペースを解決します。

public class Sample19_2B {

	public static void main(String[] args) {

		sample.Foo foo = new sample.Foo();

//		System.out.println("a = " + foo.a);
//		System.out.println("b = " + foo.b);  //他パッケージ
		System.out.println("c = " + foo.c);
	}

}
