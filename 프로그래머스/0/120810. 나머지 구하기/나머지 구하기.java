public class Solution {
	public int solution(int num1, int num2) {
		boolean condition1 = num1 > 0 && num1 <= 100;
		boolean condition2 = num2 > 0 && num2 <= 100;
		int answer = -1;

		if (condition1 && condition2 == true) {
			answer = num1 % num2;
		}

		return answer;
	}
}