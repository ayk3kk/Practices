package sample;

/**
 * P397 練習18-2
 * @author 21002S
 *
 */
public class Employee{

	private long id;		//従業員番号
	private String name;	//氏名
	private int salary;	//給与

	public Employee(long id, String name, int salary) {
		super();	//Objectのコンストラクタを呼出しています。
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
