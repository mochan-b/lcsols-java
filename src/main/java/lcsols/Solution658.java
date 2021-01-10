package lcsols;

import java.util.Collections;
import java.util.List;

public class Solution658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    	int left = 0, right = arr.length - 1, mid;
    	
    	int i = -2;
    	
    	while (left <= right) {
    		mid = (left + right) / 2;
    		
    		if (arr[mid] == x)
    		{
    			i = mid;
    			break;
    		}
    		
    		if (arr[mid] < x) {
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}    		
    	}
    	
    	if (i == -2) {
    		i = right;
    	}
    	
        List<Integer> ans = new java.util.Vector<Integer>(k);
		
        int lefti = i;
        int righti = i+1;
        for (int j=0; j<k; j++)
        {
        	if (lefti < 0)
        	{
        		ans.add(arr[righti]);
        		righti++;
        		continue;
        	}
        	
        	if (righti >= arr.length)
        	{
        		ans.add(arr[lefti]);
        		lefti--;
        		continue;
        	}
        	
        	int a = arr[lefti];
        	int b = arr[righti];
        	if (Math.abs(a - x) == Math.abs(b - x))
        	{
        		ans.add(arr[lefti]);
        		lefti--;
        	} 
        	else if (Math.abs(a - x) < Math.abs(b - x))
        	{
        		ans.add(arr[lefti]);
        		lefti--;        		
        	}
        	else {
        		ans.add(arr[righti]);
        		righti++;
        	}
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}
