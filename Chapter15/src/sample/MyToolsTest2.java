package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyToolsTest2 {

	@Test
	void testPadding() {
		//「期待値」と「実行結果」が等しいことを検証します。
		assertEquals("Java      ", MyTools.padding("Java", 10));
		assertEquals("Java", MyTools.padding("Java", 2));
	}

	@Test
	void testSum() {

		int[] n = {15, 11, 25, 7, 18, 3};

		assertEquals(79, MyTools.sum(n));;
	}

}
