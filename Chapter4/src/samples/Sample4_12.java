package samples;

public class Sample4_12 {

	public static void main(String[] args) {

		loop1: for(int x = 0; x < 3; x++) {

			//以下の処理は、3回繰り返されます。
//			System.out.println("x = " + x);
			for(int y = 0; y < 3; y++) {

				//以下の処理は、9回(3 * 3)繰り返されます。
				System.out.println("x = " + x + " :y = " + y);

				//以下の条件が成立した場合に、繰り返し全体を終了します。
				if(x == 1 && y == 1) {

					break loop1;   //←外側forを強制終了
				}

			}//変数yのスコープは、ここまで
		}// 変数xのスコープは、ここまで

				System.out.println("-----------------------------");

				loop2: for(int x = 0; x < 3; x++) {

					for(int y = 0; y < 3; y++) {

						if(x == 1 && y == 1) {
							System.out.println("continue文の実行");
							continue loop2;
						}
						//スキップ対象の処理
						System.out.println("x= " + x + " : y =" + y);
					}

				}

	}

}
