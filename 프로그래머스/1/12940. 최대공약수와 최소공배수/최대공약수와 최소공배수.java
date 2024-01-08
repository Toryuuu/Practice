class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수 구하기
        int gcd = getGcd(n, m);
        answer[0] = gcd;
        
        // 최소공배수 구하기
        int lcm = (n * m) / gcd;
        answer[1] = lcm;

        return answer;
    }
    
        // 최대공약수를 구하는 메서드
        private int getGcd(int a, int b) {
            // a % b가 0이 될 때까지 반복
            while(b != 0) {
                int temp = b; // 원래 b 값 저장
                b = a % b; // b에 a를 b로 나눈 나머지 대입
                a = temp; // a에 원래 b값 대입 후 반복
            }
            return a;
        }
}
