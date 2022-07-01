package samples;

import lib.Input;

public class sample3_11 {

	public static void main(String[] args) {

			int a = Input.getInt("aの値");

			if(a > 0) {
				System.out.println("aは、正の値です。");
				if(a % 2 == 0) {
					System.out.println("aは、偶数です。");
				}
			}else if(a == 0) {
					System.out.println("aは、0です。");
			}else {
					System.out.println("aは、負の値です。");
				}


//			if(a > 0) {
//				System.out.println("aは、正の値です。");
//				if(a % 2 == 0) {
//					System.out.println("aは、偶数です。");
//				}
//			}else {
//				if(a == 0) {
//					System.out.println("aは、0です。");
//				}else {
//					System.out.println("aは、負の値です。");
//				}
//			}


	}
}
