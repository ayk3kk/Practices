package Practice;


/**
 * Java単元テスト 問題30
 * ※複数クラスの場合、publicがついているクラス名で保存しないとエラーがでる
 * @author 21002S
 *
 */
class Data {

	int[] getData(int x, int y, int z) {

		int[] data = { x, y, z };
		return data;
	}
}

public class Sample {
	public static void main(String[] args) {

		Data d = new Data();
		int[] data = d.getData(10, 20, 30);
		System.out.println(data[1] + data[2] );

	}
}
