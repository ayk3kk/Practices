package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StatTest {


	//各テスト用オブジェクトの参照変数
	Stat st1 = null;
	Stat st2 = null;

	//各テストを実施する前の、準備処理を実装します。
	@BeforeEach
	public void setup() {

		//テストデータを準備します。
		double[] data = {2.8, 1.5, 5.4, 8.2, 3.5};
		st1 = new Stat(data);

		//要素数5の空配列で、オブジェクトを初期化します。
		st2 = new Stat(5);
		//各要素に、1.0 ～ 4.0 を代入します。
		for(int i = 0; i < 5; i++) {
			st2.set(i, i); // → {0.0, 1.0, 2.0, 3.0, 4.0}
		}
	}


	@Test
	void testSum() {

		// sum()をテストします。第3引数は、許容する誤差を指定します。
		assertEquals(21.4, st1.sum(), 0.01);


		assertEquals(10.0, st2.sum(),0.01);
	}

	@Test
	void testMean() {

		assertEquals(4.28, st1.mean(),0.01);

		assertEquals(2.0, st2.mean(),0.01);
	}

	@Test
	void testGet() {

		assertEquals(2.8, st1.get(0), 0.01);
		assertEquals(1.5, st1.get(1), 0.01);
		assertEquals(5.4, st1.get(2), 0.01);
		assertEquals(8.2, st1.get(3), 0.01);
		assertEquals(3.5, st1.get(4), 0.01);
	}
}
