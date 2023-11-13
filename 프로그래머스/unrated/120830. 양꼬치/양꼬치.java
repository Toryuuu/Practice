class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int lamb = 12000 * n; // 양꼬치 가격
        int beverage = 2000 * k; // 음료수 가격
        int free = (n / 10) * 2000; // 서비스 음료수 가격
        
        answer = lamb + beverage - free;
        
        return answer;
    }
}