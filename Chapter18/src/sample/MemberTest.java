package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	void 一般会員のテスト() {

		Member taro = new Member(123, "田中太郎");

		assertEquals(123, taro.getId());
		assertEquals("田中太郎", taro.getName());

		taro.setId(999);
		taro.setName("大阪太郎");

		assertEquals(999, taro.getId());
		assertEquals("大阪太郎", taro.getName());
	}

}
