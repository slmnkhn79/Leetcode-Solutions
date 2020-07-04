package leetcode.categorywisequestions.bitmanipulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

	@Test
	void test1() {
		SingleNumber number = new SingleNumber();
		int nums [] = {2,2,1};
		assertEquals(1, number.singleNumber(nums));
	}
	@Test
	void test2() {
		SingleNumber number = new SingleNumber();
		int nums [] = {4,1,2,1,2};
		assertEquals(4, number.singleNumber(nums));
	}


}
