class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a < b라고 가정
        if(a > b) {
            int temp = a;
            a = b; // a에 b 대입
            b = temp; // b에 원래 a값 대입
        }
        
        // a부터 b까지의 합 구한 후 리턴
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}