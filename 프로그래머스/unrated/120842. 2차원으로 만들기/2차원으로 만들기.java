class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        // for문을 돌려 answer 배열에 n개씩 쪼개 담아주기
        for(int i = 0; i < num_list.length; i++) {
          answer[i / n][i % n] = num_list[i];
        }
        
        return answer;
    }
}