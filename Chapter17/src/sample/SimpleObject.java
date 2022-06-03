package sample;

public class SimpleObject {

	//このクラスにはコンストラクタが定義されていません。

	private String name;

	//↓ コンストラクタを明示的に定義したため、
	//   もう、デフォルトコンストラクタは作成されません。
	public SimpleObject(String name) {
		super();
		this.name = name;
	}


	public static void print() {
		System.out.println("SimpleObject!");
	}
}
