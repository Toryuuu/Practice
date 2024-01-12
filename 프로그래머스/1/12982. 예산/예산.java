import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0; // 신청금액의 합
        Arrays.sort(d); // 오름차순 배열
        
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            // 신청금액이 예산 이하인 경우
            if(sum <= budget) {
                answer = d.length; // 모든 부서 지원 가능
            } // 신청금액이 예산을 초과하는 경우 
            else {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}