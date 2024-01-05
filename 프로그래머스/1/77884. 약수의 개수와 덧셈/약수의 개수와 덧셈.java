class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int count = 0; // 약수의 개수(매 숫자마다 초기화)
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0)
                    count++; // 약수 개수 구하기
        }
            if(count % 2 == 0) {
                answer += i;
            } else
                answer -= i;
            }
        
        return answer;
    }
}