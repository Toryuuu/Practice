class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int origin = x; // x의 원래 값 저장
        int sum = 0; // 자릿수의 합
        
        while(x >= 1) {
            sum += (x % 10); // 일의자리수 계속 더해줌
            x /= 10; // x에서 일의자리수 제거 후 반복
        }
        
        // x가 자릿수의 합으로 나눠떨어지면 true 리턴
        if(origin % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}