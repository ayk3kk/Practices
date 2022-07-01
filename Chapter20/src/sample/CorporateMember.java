package sample;

/**
 * 法人会員に特化したデータ構造、APIの定義
 *
 * @author 21002S
 *
 */
public class CorporateMember extends Member {

	private int employees;	//従業員数

	public CorporateMember(int id, String name, int employees) {
		super(id, name);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}
}
