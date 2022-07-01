package samples;

import lib.Input;

public class sample3_10 {

	public static void main(String[] args) {

			int num = Input.getInt("numの値");				//下のコンソールから整数入力できるようにするメソッド。()内は表示する文字
			String str = "numの値は、";


			if(num<10) {
				str += "10未満";
			}else {
				str += "10以上";
			}
//			str += num < 10 ? "10未満" : "10以上";
			System.out.println(str);
	}

}
