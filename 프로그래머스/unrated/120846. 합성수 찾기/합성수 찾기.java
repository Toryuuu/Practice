class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int count = 0; // 약수 개수. for문 돌릴 때마다 0으로 초기화
            for(int j = 1; j <= i; j++) {
                count += (i % j == 0)? 1: 0; // 나눠떨어지면 1, 아니면 0 카운트에 추가
            }
            answer += (count >= 3)? 1: 0; // 약수 3개 이상이면 결과 1개씩 추가
        }
        
        return answer;
    }
}