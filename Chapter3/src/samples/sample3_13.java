package samples;

import lib.Input;

public class sample3_13 {

	public static void main(String[] args) {

		int num = Input.getInt("numの値");

		switch(num) {
			case 1:
			case 2:
				System.out.println("1 または 2");
				break;
			case 3:
			case 4:
				System.out.println("3 または 4");
				break;
			default:
				System.out.println("default");
		}
	}

}
