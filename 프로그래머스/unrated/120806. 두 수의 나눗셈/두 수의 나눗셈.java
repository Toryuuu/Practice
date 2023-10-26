class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        // 입력값이 주어진 범위 내에 있는지 검사
        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            
            double solution = (double)num1 / num2 * 1000;
            answer = (int) solution;
              
        } 
        
        return answer;
    }
}