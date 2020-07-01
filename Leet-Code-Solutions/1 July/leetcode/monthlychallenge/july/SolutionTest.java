package leetcode.monthlychallenge.july;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testArrangeCoins() {
		int input =8;
		Solution solution = new Solution();
		System.out.println("Input = " +input);
		System.out.println("Output = " + solution.arrangeCoins(input));
	}

}
