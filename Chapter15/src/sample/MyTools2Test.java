package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTools2Test {

	@Test
	void testTriangle() {

//		int area = MyTools2.triangle(5, 8);

		//MyTools2をインスタンス生成します。
		MyTools2 mt2= new MyTools2();
		int area = mt2.triangle(10, 20);

		assertEquals(100, area);
	}

	//正三角形の面積を求めるテスト
	@Test
	void testTriangle2() {

		assertEquals(43, MyTools2.triangle(10));
	}

}
