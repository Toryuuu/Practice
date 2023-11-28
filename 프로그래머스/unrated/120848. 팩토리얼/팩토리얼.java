class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        int i = 1;
        
        // x > n이 되면 빠져나옴
        while (x <= n) { 
            x *= i; // i!
            i++;
        }
        answer = i - 2; // i가 증가된 시점에 while문 빠져나옴 -> -2 해줌!
        return answer;
    }
}