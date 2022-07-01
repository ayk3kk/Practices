package Practices;

/**
 * 練習問題 九九の式一覧表示
 *
 * @author 21002S
 *
 */
public class Practice_08 {

	public static void main(String[] args) {

		for(int x = 1; x <=9; x++) {

		String[] numArray = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};


		System.out.println("------------");
		System.out.printf("■%sの算\n", numArray[x - 1]);
		System.out.println("------------");


		for(int y = 1; y <= 9; y++) {

			int result = x * y;
			System.out.printf("%d * %d = %2d\n",x ,y,result);

			if(result == 81) {
				break;
			}
	    }
		}

	}

}
