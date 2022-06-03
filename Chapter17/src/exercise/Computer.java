package exercise;

/**
 * @author 21002S
 *
 */
public class Computer {

	private String name;	//機種名
	private int cores;		//MPUコアのビット数

	//このコンストラクタを他のコンストラクタから再利用します。
	public Computer(String name, int cores) {
		super();
		this.name = name;
		this.cores = cores;
	}

	//MPUコアのビット数が不明な場合、こちらのコンストラクタを使うと規定値が使われる
	public Computer(String name) {

		this(name, 32);
//		this.name = name;
//		this.cores = 32;	//規定値を設定します。
	}

	//すべての情報が不明な場合
	public Computer() {

		this("M200", 32);
//		this.name = "M200";
//		this.cores = 32;
	}


	@Override
	public String toString() {
		return "Computer [name=" + name + ", cores=" + cores + "]";
	}

}
