class Solution {
    public long solution(int price, int money, int count) {
       
        long total = 0; 
        
        for(int i = 1; i <= count; i++) {
            total += i; // 이용횟수의 합(1+2+...+count)
        }
        
        total *= (long) price; // 총 이용금액
        
        return (money >= total)? 0: total - money;
    }
}