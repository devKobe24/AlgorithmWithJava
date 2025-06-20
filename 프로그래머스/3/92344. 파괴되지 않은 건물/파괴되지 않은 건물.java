class Solution {
    public int solution(int[][] board, int[][] skill) {
        int n = board.length; // 행 크기 저장
        int m = board[0].length; // 열 크기 저장
        int[][] sum = new int[n+2][m+2]; // 누적합용 배열(패딩 포함)

        // 모든 스킬을 누적합 배열에 적용
        for (int[] s : skill) {
            int type = s[0]; // 1: 공격, 2: 회복
            int r1 = s[1], c1 = s[2], r2 = s[3], c2 = s[4], degree = s[5];
            int val = (type == 1) ? -degree : degree; // 공격이면 음수, 회복이면 양수

            sum[r1][c1] += val; // 좌상단에 val 더함
            sum[r1][c2+1] -= val; // 우상단+1에 val 빼줌
            sum[r2+1][c1] -= val; // 좌하단+1에 val 빼줌
            sum[r2+1][c2+1] += val; // 우하단+1에 val 더함
        }

        // 가로 방향 누적합
        for (int i = 0; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                sum[i][j] += sum[i][j-1]; // 왼쪽 누적
            }
        }
        // 세로 방향 누적합
        for (int j = 0; j < m+1; j++) {
            for (int i = 1; i < n+1; i++) {
                sum[i][j] += sum[i-1][j]; // 위쪽 누적
            }
        }

        int answer = 0; // 파괴되지 않는 건물 카운트
        // 누적합을 원본 board에 적용
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] += sum[i][j]; // board에 변화량 더함
                if (board[i][j] > 0) answer++; // 0보다 크면 파괴되지 않음
            }
        }
        return answer; // 정답 반환
    }
}
