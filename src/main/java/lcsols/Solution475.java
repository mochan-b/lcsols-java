package lcsols;

import java.util.Arrays;

public class Solution475 {
	int findHeater(int house, int[] heaters) {
		int left = 0, right = heaters.length - 1, mid;

		while (left <= right) {
			mid = (left + right)/2;

			if (heaters[mid] == house)
				return mid;
			if (heaters[mid] < house)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return left;
	}

	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);

		int radius = 0;
		final int MAX_VAL = (Math.max(houses[houses.length - 1], heaters[heaters.length-1]) - Math.min(houses[0], heaters[0])) + 1;

		for (int i=0; i<houses.length; i++) {
			int house = houses[i];
			int closestHeater = findHeater(house, heaters);

			int heaterDist;
			int leftDist = MAX_VAL, rightDist= MAX_VAL;

			if (closestHeater != heaters.length )
				rightDist = heaters[closestHeater] - house;
			if (closestHeater != 0)
				leftDist = house - heaters[closestHeater-1];
			heaterDist = Math.min(leftDist, rightDist);

			radius = Math.max(radius, heaterDist);
		}

		return radius;
	}
}
