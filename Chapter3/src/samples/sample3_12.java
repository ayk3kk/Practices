package samples;

import lib.Input;

public class sample3_12 {

	public static void main(String[] args) {

		int num = Input.getInt("numの値");

		switch(num) {
			case 1:
				System.out.println("numの値は、1です。");
				break;
			case 2:
				System.out.println("numの値は、2です。");

			default:
				System.out.println("defaultです。");
		}
	}

}
