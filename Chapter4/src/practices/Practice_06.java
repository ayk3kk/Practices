package practices;

/**
 * @author 21002S
 *
 */
public class Practice_06 {

	public static void main(String[] args) {

		System.out.println("■整数列の横計と縦計");

		int num = 1;
		int hTotal = 0; //行単位の合計
		int[] vTotal = new int[10];	//列単位の合計

		while(num <= 100) {

			System.out.printf("%3d, ", num);

			//numを各合計に加算します。
			hTotal += num;
			vTotal[(num - 1) % 10] += num;	//配列要素のどれかに加算

			//10の倍数の時に改行します。
			if(num % 10 == 0) {
				System.out.printf("| %3d\n", hTotal);
				hTotal = 0;
			}

			num++;
		}//while()

		//各列の合計を出力します。
		System.out.println("―――――――――――――――――――――――――――――");
//		for(int i = 0; i < vTotal.length; i++) {
//			System.out.printf("%3d, ",vTotal[i]);
//		}

		//拡張構文で書く
			for(int vt : vTotal) {
				System.out.printf("%3d, ",vt);		//取り出し済みで受け渡してくれるので、そのままアクセスするだけ
			}

		System.out.println("\n\n終了しました。");

	}

}
