import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = -1; // -1로 초기화
        int x = 1; // 양의 정수의 최솟값 1로 초기화
        
        // x 제곱이 n 이하일 동안 반복
        while((long)Math.pow(x, 2) <= n) {
            if((long)Math.pow(x, 2) == n) {
                answer = (long)Math.pow((x + 1), 2);
                break; // 값 찾으면 빠져나오기
            }  
            x++; // x값 증가시켜 반복
        }
         
        return answer;
    }
}