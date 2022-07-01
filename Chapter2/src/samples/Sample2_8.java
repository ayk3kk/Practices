package samples;

/**
 * 参照型の利用
 *
 * @author AKAKE
 *
 */
public class Sample2_8 {

	public static void main(String[] args) {

		int[] a = new int[1];
		int[] b = a;	//参照変数間の代入 →参照情報がコピーされ、a,b共に同一配列オブジェクトを参照した状態になります。★配列は一つしかない

		a[0] = 10;
		System.out.println("a[0]:" +a[0] + " b[0]:" +b[0]);

		b[0] = 50;
		System.out.println("a[0]:" +a[0] + " b[0]:" +b[0]);
	}

}
