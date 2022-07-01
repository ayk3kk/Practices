package sample;

/**
 * 学生会員に特化したデータ構造、APIの定義
 *
 * @author 21002S
 *
 */
public class StudentMember extends Member {

	private String birthday;	//誕生日

	public StudentMember(int id, String name, String birthday) {
		super(id, name);
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
