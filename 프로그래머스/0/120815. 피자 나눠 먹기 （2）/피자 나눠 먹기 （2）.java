public class Solution {
	public int solution(int n) {
		int answer = 0;
		boolean condition = n >= 1 && n <= 100;
		int gcd = 0;
		int lcm = 0;

		if (condition) {
			if (6 % n == 0) {
				gcd = gcd(6, n);
				switch (gcd) {
					case 1:
					case 2:
					case 3:
					case 6:
						answer = 1;
						break;
				}
				System.out.println("answer = " + answer);
			} else {
				lcm = lcm(6, n);
				answer = lcm / 6;
				System.out.println("answer = " + answer);
			}
		}
		return answer;
	}

	// 최대공약수를 구하는 메서드
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// 최소공배수를 구하는 메서드
	public static int lcm(int a, int b) {
		// Math.abs는 두 수의 곱이 음수가 될 가능성을 대비하여 절댓값을 취함.
		return Math.abs(a * b) / gcd(a, b);
	}
}