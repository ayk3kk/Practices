package samples;

public class Sample4_7 {

	public static void main(String[] args) {

		char[] array = {'a', 'b', 'c', 'd', 'e' };

		//拡張for文でシーケンシャルアクセスする場合
		for(char c : array) {
			System.out.print(c + " ");
		}

		System.out.println();

		//通常のfor文でシーケンシャルアクセスする場合
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
