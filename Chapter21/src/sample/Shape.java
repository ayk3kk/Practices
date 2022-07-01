package sample;


/**
 * 図形一般のデータ構造とAPIを定義する抽象クラス
 *
 * @author 21002S
 *
 */
public abstract class Shape {

	private String color;

	protected Shape(String color) {
		super();
		this.color = color;
	}

	public abstract String getName();

	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
