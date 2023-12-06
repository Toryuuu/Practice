import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0; // difference
        int min = Integer.MAX_VALUE; // 절댓값은 0 이상이어야 하므로 가장 큰 정숫값으로 초기화
        
        for(int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]); // n과 원솟값 차의 절댓값
            if(diff < min) {
                min = diff; // 가장 가까운 수에 절댓값 대입
                answer = array[i]; // 그 때의 인덱스값 리턴
            } else if(diff == min && array[i] < answer) {
                // 가까운 수가 여러개이며 더 작은 수일 경우
                answer = array[i]; // 그 때의 인덱스값 리턴
            }
        }
        
        return answer;
    }
}