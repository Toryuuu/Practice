class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += (n % 10); // 일의 자리부터 더하기
            n /= 10; // n에서 일의 자리 없애고 반복
        }
        
        return answer;
    }
}