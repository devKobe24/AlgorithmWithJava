import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	public int[] solution(int n) {
		boolean condition = n >= 1 && n <= 100;
		int[] answer = {};
		List<Integer> arrayList = Arrays.stream(answer)
		                                .boxed()
		                                .collect(Collectors.toList());

		if (condition == true) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					arrayList.add(i);
				}
			}
		}

		Collections.sort(arrayList);

		answer = arrayList.stream()
		                  .mapToInt(Integer::intValue)
		                  .toArray();

		return answer;
	}
}