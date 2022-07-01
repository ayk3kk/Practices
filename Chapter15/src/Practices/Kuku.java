package Practices;

/**
 * 九九の計算に必要な値のデータ構造
 *
 * @author 21002S
 *
 */
public class Kuku {

	private int x;
	private int y;

	public Kuku(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getResult() {
		return this.x * this.y;
	}

	@Override
	public String toString() {
		return String.format("%d * %d = %2d", this.x, this.y, this.getResult());
	}



}
