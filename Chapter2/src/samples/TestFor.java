package samples;

/**
 * for文の練習
 *
 * @author AKAKE
 *
 */
public class TestFor {

	public static void main(String[] args) {

			//整数列0～20を表示します。
		for(int i = 0; i <= 20; i++) {

			System.out.println(i);

		}

		String[] lang = {"Java", "COBOL", "Ruby", "Python", "PHP"};

		for(int i = 0; i < 5; i++) {
		System.out.println(lang[i]);
		}
	}

}
