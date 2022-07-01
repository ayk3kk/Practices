package sample;


/**
 * String#repeat()の練習
 *
 * @author 21002S
 *
 */
public class TestRepeat {

	public static void main(String[] args) {

		//String#repeat()の練習
		String s1 = "XYZ";
		System.out.println(s1.repeat(3));

		System.out.println("Java".repeat(5));

		//MyTools#padding()をテストします。
		System.out.println(MyTools.padding("Java", 20));
		System.out.println(MyTools.padding("Java", 2));
	}

}
