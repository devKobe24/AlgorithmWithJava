import java.util.ArrayList;

class Solution {
  public int[] solution(int n) {

    // 제한 사항
    if (n < 1 && n > 100) {
      return null;
    }

    // sort를 위한 ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();

    int[] answer = new int[n];

    // 홀수만 거르기
    for (int i = 1; i <= answer.length; i++) {
      if (i % 2 != 0) {
        numbers.add(i);
      }
    }

    // sort후 Array로 변환
    answer = numbers.stream().mapToInt(Integer::intValue).toArray();
    
    return answer;
  }
}
