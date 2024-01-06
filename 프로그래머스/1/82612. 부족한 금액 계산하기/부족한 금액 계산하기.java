class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        
        for(int i = 1; i <= count; i++) {
            total += (long)(price * i);
        }
        
        if(money >= total) { // 금액이 부족하지 않은 경우
            answer = 0;
        } else // 금액이 부족할 경우
            answer = total - money;
        
        return answer;
    }
}