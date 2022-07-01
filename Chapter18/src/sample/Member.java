package sample;

/**
 * 一般会員のデータ構造
 *
 * @author 21002S
 *
 */
public class Member {


	private int id;		//会員番号
	private String name;	//氏名

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
