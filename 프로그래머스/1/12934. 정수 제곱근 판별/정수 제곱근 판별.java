import java.lang.Math;

class Solution {
    public long solution(long n) {
        
        int x = 1; // 양의 정수 제곱근의 최솟값 1로 초기화
        
        // x 제곱이 n 이하일 동안 반복
        while((long)Math.pow(x, 2) <= n) {
            if((long)Math.pow(x, 2) == n) {
                return (long)Math.pow((x + 1), 2);
            }  
            x++; // x값 증가시켜 반복
        }
         
        return -1;
    }
}