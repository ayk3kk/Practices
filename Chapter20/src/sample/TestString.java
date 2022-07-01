package sample;

public class TestString {

	public static void main(String[] args) {

		//参照が、Object型にアップキャストされます。
		Object str = new String("Hello, Java!");

		//サブクラス独自のメンバーにはアクセスできません。
		System.out.println(((String)str).length());
	}

}
