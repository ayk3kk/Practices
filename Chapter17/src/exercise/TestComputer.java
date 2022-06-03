package exercise;

/**
 *
 * @author 21002S
 *
 */
public class TestComputer {

	public static void main(String[] args) {

		Computer comp1 = new Computer("IBM PC", 16);
		System.out.println(comp1);

		Computer comp2 = new Computer("DEC PDP-11");
		System.out.println(comp2);

		Computer comp3 = new Computer();
		System.out.println(comp3);
	}

}
