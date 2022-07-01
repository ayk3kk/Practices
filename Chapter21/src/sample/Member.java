package sample;

/**
 * Versionableの実装クラス
 *
 * @author 21002S
 *
 */
public class Member implements Versionable {

	@Override
	public String version() {

		return "Memberクラス version 1.0";
	}

	private int	id;
	private String name;

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
