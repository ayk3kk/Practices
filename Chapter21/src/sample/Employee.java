package sample;

/**
 * 従業員のデータ構造
 * @author 21002S
 *
 */
public class Employee implements Versionable {

	private int	id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String version() {

		return "クラスEmployee ver.3.0";
	}
}
