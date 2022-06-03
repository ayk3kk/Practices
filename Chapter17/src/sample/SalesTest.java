package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalesTest {

	@Test
	void testAmount() {

		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);

		assertEquals(1000000, s1.amount());
	}

	@Test
	void testIsHighSales() {

		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);

		assertTrue(s1.isHighSales());
	}

	@Test
	void testIsHighSales2() {

		Sales s1 = new Sales("AX-551", "テレビ", 15000, 32, false);

		assertFalse(s1.isHighSales());
	}
}
