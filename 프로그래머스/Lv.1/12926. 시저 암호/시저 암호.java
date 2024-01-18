class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] word = s.toCharArray(); // 한글자씩 분리
        
        for(int i = 0; i < word.length; i++) {
            char ch = word[i]; // i번째 문자(인덱스값)
            
            // 인덱스값이 대문자일 경우
            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)('A' + (ch - 'A' + n) % 26);
            } 
            // 인덱스값이 소문자일 경우
            else if(ch >= 'a' && ch <= 'z') {
                ch = (char)('a' + (ch - 'a' + n) % 26);
            } 
            // 인덱스값이 공백일 경우
            else {
                ch = ' '; // 공백 그대로 추가
            }
                
            answer += ch;
        }
        
        return answer;
    }
}