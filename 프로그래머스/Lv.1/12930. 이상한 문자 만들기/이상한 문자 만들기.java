class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백 포함 한 글자씩 구분
        String[] sArray = s.split("");
        int cnt = 0; // 인덱스 
        
        for(String str : sArray) {
            // 공백이 아닌 원소에 인덱스 1씩 증가
            cnt = str.contains(" ")? 0: cnt + 1;
            // 인덱스가 짝수면 소문자로, 홀수면 대문자로 변환
            answer += (cnt % 2 == 0)? str.toLowerCase(): str.toUpperCase();
        }
        
        return answer;
    }
}