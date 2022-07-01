package sample;

/**
 * 管理職に特化したデータ構造
 *
 * サブクラス P397
 * @author 21002S
 *
 */
public class Manager extends Employee {

	private String title;	//管理職名

	public Manager(long id, String name, int salary, String title) {

		super(id, name, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {

		return this.getId() + "/" + this.getName() + "/" + this.getSalary() + "/" + this.title;
	}

}
