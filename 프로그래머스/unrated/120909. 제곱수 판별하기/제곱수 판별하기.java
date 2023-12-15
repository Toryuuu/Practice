import java.lang.Math;

class Solution {
    public int solution(int n) {
        // n의 제곱근이 1로 나눈 나머지가 0이면
        int answer = (Math.sqrt(n) % 1 == 0)? 1: 2;
        
        return answer;
    }
}