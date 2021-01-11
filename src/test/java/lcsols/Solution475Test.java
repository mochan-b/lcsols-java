package lcsols;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution475Test {

	@Test
	public void test1() {
		int houses[] = {1, 2, 3};
		int heaters[] = {2};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(1, result);
	}

	@Test
	public void test2() {
		int houses[] = {1, 3, 2};
		int heaters[] = {2};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(1, result);

	}

	@Test
	public void test3() {
		int houses[] = {1, 2, 3};
		int heaters[] = {1,4};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(1, result);

	}

	@Test
	public void test4() {
		int houses[] = {1, 5};
		int heaters[] = {2};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(3, result);

	}

	@Test
	public void test5() {
		int houses[] = {1, 5};
		int heaters[] = {10};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(9, result);
	}

	@Test
	public void test6() {
		int houses[] = {282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923};
		int heaters[] = {823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729, 823378840, 143542612};

		Solution475 soln = new Solution475();
		int result = soln.findRadius(houses, heaters);

		assertEquals(161834419, result);
	}	
}
