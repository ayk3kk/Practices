package sample;

/**
 * P362～
 *
 * @author 21002S
 *
 */
public class Sales {

	private String code;
	private String name;
	private int price;
	private int quantity;
	private boolean stock;  //在庫フラグ

	public Sales(String code, String name, int price, int quantity, boolean stock) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stock = stock;
	}

	// 売上金額をアプリケーションに提供するメソッド
	public int amount() {
		return this.price * this.quantity;
	}

	//高額売り上げかどうかを判断するメソッド
	public boolean isHighSales() {
		if(this.amount() >= 500000){
			return true;
		}else {
			return false;
		}
	}

	@Override   //←オーバーライドアノテーション：正しくオーバーライドされているか確認できる
	//オブジェクトの文字列表現を返します。
	public String toString(){

		String result = "\n商品コード：" + this.code
				       + "\n品　　　名：" + this.name
				       + "\n価　　　格：" + this.price + "円"
				       + "\n個　　　数：" + this.quantity + "個"
				       + "\n在庫の有無：" + (this.stock ? "あり" : "なし") ;
		return result;
	}



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





}
