package exercise;

/**
 * 「話し手」クラス
 *
 * @author 21002S
 *
 */
public class Speaker implements Talkable{

	private String name;

	public Speaker(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void talk(String s) {
		System.out.println(s);
	}
}
