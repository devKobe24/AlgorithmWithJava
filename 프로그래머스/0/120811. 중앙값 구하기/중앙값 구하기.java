import java.util.Arrays;

public class Solution {
	public int solution(int[] array) {
		Arrays.sort(array);

		int answer = 0;
		int midValue = (array.length / 2);

		boolean condition1 = array.length % 2 != 0;
		boolean condition2 = 0 < array.length && array.length < 100;

		if (condition1 && condition2 == true) {
			for (int i = 0; i < array.length; i++) {
				if (i == midValue) {
					boolean condition3 = -1000 < array[i] && array[i] < 1000;

					if (condition3 == true) {
						answer = array[i];
					}
				}
			}
		}

		return answer;
	}
}
