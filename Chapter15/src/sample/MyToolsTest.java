package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyToolsTest {

	@Test
	void test() {
		//テスト用メソッドの代表
		//「期待値」と「実際の結果」が等しいことを検証します。
		assertEquals(21.0, MyTools.bmi(62.3, 1.71));
	}

	@Test
	void testCalconv() {

		assertEquals(1985, MyTools.calconv("S", 60));
		assertEquals(1980, MyTools.calconv("s", 55));
		assertEquals(1991, MyTools.calconv("H", 3));
		assertEquals(2008, MyTools.calconv("h", 20));
		assertEquals(2022, MyTools.calconv("R", 4));
		assertEquals(2020, MyTools.calconv("r", 2));
		assertEquals(123, MyTools.calconv("X", 123));


	}

}
