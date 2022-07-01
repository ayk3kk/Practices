package sample;

/**
 * 販売オブジェクトのデータ構造を定義します。
 *
 * @author 21002S
 *
 */
public class Sales {

	private String code;
	private String name;
	private int   price;
	private int   quantity;
	private boolean stock;

	public Sales(String code, String name, int price, int quantity, boolean stock) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.stock = stock;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Sales [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", stock=" + stock +"]";
	}
}
