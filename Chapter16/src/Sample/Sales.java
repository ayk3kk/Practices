package Sample;

/**
 * 売上明細オブジェクトのデータ構造
 *
 * テキストP339
 * @author 21002S
 *
 */
public class Sales {

	//フィールド変数でデータ構造を定義します。
	private String code;
	//改修：配列化し、日本語商品名と英語商品名を記憶可能にします。
	private String name;
	private int   price;
	private int   quantity;
	private boolean stock;

	//コンストラクタ←クラスと同じ名前にする、仮パラメータの設定
	public Sales(String code, String name, int price, int quantity, boolean stock) {

		//各フィールド変数を初期化します。
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stock = stock;

		System.out.println("売上明細オブジェクトが作成されました。");
	}

	//以下、ゲッターメソッド（=インスタンスメソッド）を定義し、公開します。
	public String getCode() {

		return this.code;
	}
	public String getName() {

		return this.name;
	}

	public int getPrice() {

		return this.price;
	}

	public int getQuantity() {

		return this.quantity;
	}

	public boolean isStock() {

		return this.stock;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
