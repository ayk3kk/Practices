package practices;

public class Practice_07 {

	public static void main(String[] args) {

		int maxNum = 1;
		int minNum = 1;

		for (int i = 0; i < 25; i++) {

			int num = (int) (Math.random() * 100 + 1);

			System.out.printf("%3d", i + 1);

			if (num % 2 == 0) {
				System.out.printf(":%4d -> 偶数 \n", num);
			} else {
				System.out.printf(":%4d -> 奇数 \n", num);
			}

			if (num > maxNum) {
				maxNum = num;
			}

			if (num < minNum) {
				minNum = num;
			}
		}


		System.out.println("―――――――――");

		System.out.printf("最大値： %3d\n", maxNum );
		System.out.printf("最小値： %3d\n", minNum);
	}

}
