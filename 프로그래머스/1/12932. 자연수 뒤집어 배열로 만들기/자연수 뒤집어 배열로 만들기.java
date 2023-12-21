class Solution {
    public int[] solution(long n) {
        
        String str = "" + n; // n 문자열로 변환
        int len = str.length();
        int[] answer = new int[len];
        
        // answer의 역순인덱스부터 str 원소값 순차대입
        // len -  1 하는 이유 : 인덱스는 0부터 시작하므로
        for(int i = len - 1; i >= 0; i--) {
            answer[i] = str.charAt(len - i - 1) - '0';
            // len - i - 1으로 index 0부터 순차적으로 접근
            // '0'(아스키코드 48)을 빼서 int로 변환 후 대입
        }
        
        return answer;
    }
}