package Sample;

/**
 * テキストP346
 * 練習16-1 「PC用インクカートリッジの注文オブジェクトのデータ構造」
 *
 * @author 21002S
 *
 */
public class Order {

	private String id;			//型番
	private String date;		//受注日
	private int price;			//価格
	private int quantity;		//個数
	private boolean delivery;	 //納品済みか（納品済みフラグ）

	public Order(String id, String date, int price, int quantity, boolean delivery) {

		//各フィールド変数に初期値を代入します。
		this.id =id;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.delivery = delivery;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isDelivery() {
		return delivery;
	}


}
