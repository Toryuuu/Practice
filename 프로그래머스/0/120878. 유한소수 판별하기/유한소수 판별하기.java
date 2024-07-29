class Solution {
    public int solution(int a, int b) {
        
        int gcd = getGCD(a, b); // 함수 호출
        
        // 기약분수 만들기
        b = b / gcd;
        
        // 유한소수 -> 1, 2, 5로만 나눠져야 함
        // => 2, 5로 최대한 나누기
        while(b % 2 == 0) {
            b /= 2;
        }
        while(b % 5 == 0) {
            b /= 5;
        }
        
        // 분모가 1이 되면 유한소수, 아니면 무한소수 리턴
        return (b  == 1)? 1: 2;
        
    }
    
    // 최대공약수 구하는 함수(유클리드 호제법 사용)
    private int getGCD(int a, int b) {
        // a < b일 경우 값을 서로 치환 후 진행
        if(a < b) {
            int temp = a;
            a = b; // a에 b값 치환
            b = temp; // b에 a값 치환
        }
        // 유클리드 호제법
        // b가 0이 될 때까지 반복
        while(b != 0) {
            int temp = b;
            b = a % b; 
            a = temp; // a 자리에 b값 넣은 후 반복 
        }
        return a;
    }
}