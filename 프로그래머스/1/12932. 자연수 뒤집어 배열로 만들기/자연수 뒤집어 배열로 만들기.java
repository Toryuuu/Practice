class Solution {
    public int[] solution(long n) {
        
        String str = "" + n; // n 문자열로 변환
        int[] answer = new int[str.length()];
        int index = 0;
        
        while(n > 0) {
            answer[index++] = (int)(n % 10); 
            // 일의자리수부터 answer에 순차대입
            n /= 10; 
            // 일의자리수부터 하나씩 제거 후 반복
        }
        
        return answer;
    }
}