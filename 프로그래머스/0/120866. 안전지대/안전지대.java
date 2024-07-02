class Solution {
    public int solution(int[][] board) {
        int answer = 0; // 안전지대 칸 수
        int n = board.length; // 배열 크기
        boolean[][] danger = new boolean[n][n]; // 위험지대 표시 배열(false로 초기화, board 배열과 같은 크기)
        
        // 지뢰 위치를 찾고 주변을 위험지대로 표시
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // 지뢰가 있는 경우
                if(board[i][j] == 1) {
                    // 지뢰 + 주변지역을 위험지대로 표시
                    // 각각 x, y축의 -1, 0, 1 (주변+ 지뢰 범위)
                    for(int dx = -1; dx <= 1; dx++) { 
                        for(int dy = -1; dy <= 1; dy++) { 
                            // 지뢰위치의 주변으로 범위조정
                            int ni = i + dx;
                            int nj = j + dy;
                            
                            // 배열 범위 내로 한정
                            if(ni >= 0 && ni < n && nj >= 0 && nj < n) {
                                danger[ni][nj] = true;
                            }
                        }
                    }
                }
                
            }
        }
        
        // boolean 배열에서 false 개수 리턴
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!danger[i][j]) 
                    answer++;
            }
        }
        
        return answer;
    }
}