package lcsols;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Vector;

public class Solution658Test {
	@Test
	public void test1() {
		int arr[] = {1,2,3,4,5};
		int k = 4;
		int x = 3;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(1);
		ans.add(2);
		ans.add(3);
		ans.add(4);
		assertEquals(ans, result);
	}
	
	@Test
	public void test2() {
		int arr[] = {1,2,4,5,8};
		int k = 1;
		int x = 3;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(2);
		assertEquals(ans, result);
	}
	
	@Test
	public void test3() {
		int arr[] = {1,2,3,4,5};
		int k = 1;
		int x = 3;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(3);
		assertEquals(ans, result);
	}
	
	@Test
	public void test4() {
		int arr[] = {2,4,5,8};
		int k = 1;
		int x = 1;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(2);
		assertEquals(ans, result);
	}
	
	@Test
	public void test5() {
		int arr[] = {1,2,3,4,5};
		int k = 4;
		int x = -1;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(1);
		ans.add(2);
		ans.add(3);
		ans.add(4);
		assertEquals(ans, result);
	}
	
	@Test
	public void test6() {
		int arr[] = {3,5,8,10};
		int k = 2;
		int x = 15;
		
		Solution658 soln = new Solution658();
		List<Integer> result = soln.findClosestElements(arr, k, x);
		
		List<Integer> ans = new Vector<Integer>(4);
		ans.add(8);
		ans.add(10);
		assertEquals(ans, result);
	}
}
