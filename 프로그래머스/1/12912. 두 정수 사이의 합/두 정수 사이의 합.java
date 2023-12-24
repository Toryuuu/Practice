class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b) {
            int temp = a;
            a = b; // a에 b 대입
            b = temp; // b에 원래 a값 대입
        }
        
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}