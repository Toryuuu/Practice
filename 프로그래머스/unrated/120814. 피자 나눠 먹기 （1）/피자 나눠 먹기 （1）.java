class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 >= 0)
            answer = (n+6) / 7;
        return answer;
    }
}