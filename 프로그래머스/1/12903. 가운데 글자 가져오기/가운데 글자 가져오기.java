class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length(); // 문자열 길이
        
        // 인덱스가 0부터 시작임을 감안하여 범위 설정
        if(len % 2 == 0) {
            answer = s.substring(len / 2 - 1, len / 2 + 1);
        } else
            answer = s.substring(len / 2, len / 2 + 1);
        
        return answer;
    }
}