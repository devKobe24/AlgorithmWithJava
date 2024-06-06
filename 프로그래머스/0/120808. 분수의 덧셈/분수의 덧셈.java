class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = ((numer1 * denom2) + (numer2 * denom1));
		int demon = denom1 * denom2;

		int max = 1;

		for (int i = 1; i <= numer && i <= demon; i++) {
			if (demon % i == 0 && numer % i == 0) {
				max = i;
			}
		}

		numer = numer / max;
		demon = demon / max;

		int[] answer = {numer, demon};

		return answer;
	}
}