class Solution {
	public int solution(int n) {
		int answer = 0;
		boolean condition = n >= 1 && n <= 100;
		int aSliceOfPizza = 7;
		int pizzaCnt = 0;
		int remainPersonRange = 0;

		if (condition) {
			if (n / aSliceOfPizza >= 0) {
				pizzaCnt += (n / aSliceOfPizza);
				if (n % aSliceOfPizza != 0) {
					remainPersonRange = (n % aSliceOfPizza);

					switch (remainPersonRange) {
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
						case 6:
							pizzaCnt++;
							break;
						default:
							throw new IllegalStateException("Unexpected value: " + remainPersonRange);
					}
				}
				answer = pizzaCnt;
			}
		}
		return answer;
	}
}