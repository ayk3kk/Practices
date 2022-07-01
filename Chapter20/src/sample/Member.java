package sample;

/**
 * 会員共通のデータ構造、およびAPI を定義
 * @author 21002S
 *
 */
public class Member {

	//アプリケーションの実行環境を指定するための定数
	public static final int	STUDENT = 1;
	public static final int	CORPORATE = 2;

	//現在処理対象に設定されている会員のタイプ
	public static final int	CURRENT_TYPE = STUDENT;

	private int	id;		//会員番号
	private String  name;	//氏名

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
