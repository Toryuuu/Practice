class Solution {
    public int solution(int n) {
        int count = 0; // 현재까지 찾은 3x 마을 숫자 개수
        int number = 0; // 현재 숫자
        
        // n까지 카운트하면 벗어남
        while(count < n) {
            number++; // 1부터 시작
            
            // 3의 배수인 경우 or 3이 들어가는 경우 skip
            if(number % 3 == 0 || String.valueOf(number).contains("3")) {
                continue;
            }
            
            count++; // 3의 배수 제외한 숫자만 카운트
        }
        
        return number;
    }
}