import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d); // 오름차순 배열
        
        for(int i : d) {
            // 각 부서의 지원금이 예산 이하면
            if(i <= budget) {
                answer++; // 부서 개수 1씩 추가
                budget -= i; // 예산에서 해당 금액 빼기
            }
        }
        
        return answer;
    }
}