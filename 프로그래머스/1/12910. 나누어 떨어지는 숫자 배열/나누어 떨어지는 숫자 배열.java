import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = {-1}; // -1로 디폴트 설정
        
        // 나눠떨어지는 원소가 있는지 확인
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer = Arrays.stream(arr) 
                    .filter(e -> e % divisor == 0)
                    .sorted()
                    .toArray();
                break;
            }
        }
        
        return answer;
    }
}