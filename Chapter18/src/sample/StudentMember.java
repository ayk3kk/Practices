package sample;

/**
 * 学生会員のデータ構造
 * ※サブクラス側に記載する！P394～
 * @author 21002S
 *
 */
public class StudentMember extends Member {

	private String birthday;	//誕生日 ← 学生会員に特化した情報

	public StudentMember(int id, String name, String birthday) {

		super(id, name);		//スーパークラス側のコンストラクターを再利用します。
//		this.id = id;			//スーパークラス側のprivateメンバーには
//		this.name = name;		//直接アクセスできません。
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {

		return "■会員番号："+ this.getId() + "\n"
				+ "■氏　　名： "+ this.getName() + "\n"
				+ "■誕 生 日：" + this.birthday;
	}
}
