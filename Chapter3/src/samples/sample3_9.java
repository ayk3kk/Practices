package samples;

import lib.Input;

public class sample3_9 {

	public static void main(String[] args) {

		char c = Input.getChar("1文字を入力してください");

		if(c == 'a') {
			System.out.println("cの値は'a'です。");
		}else if(c == 'b') {
			System.out.println("cの値は'b'です。");
		}else if(c == 'c') {
			System.out.println("cの値は'c'です。");
		}else {
			System.out.println("cの値は'a'でも'b'でも'c'でもありません。");
			System.out.println("cの値は '" + c + "' です。");
		}
	}

}
