class Solution {
    public int solution(int hp) {
        
        int a = hp / 5; // 장군개미 숫자
        int b = (hp % 5) / 3; // 병정개미 숫자
        int c = hp - ((5 * a) + (3 * b)); // 일개미 숫자
        
        int answer = a + b + c; // 모든 개미의 숫자
        
        return answer;
    }
}