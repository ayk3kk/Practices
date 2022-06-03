package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	void testAdd() {

		//インスタンス生成します。
		Adder a = new Adder(100);

		// Adder#add()を50回実行します。
		for(int i = 0; i < 50; i++) {
			a.add();
	}

		//実行結果が150であることを検証します。
		assertEquals(150, a.getNumber());
	}
}
