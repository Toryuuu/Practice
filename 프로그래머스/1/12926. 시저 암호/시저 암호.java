class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int num = 0;
        
        for(int i = 0; i < s.length(); i++) {
            num = s.charAt(i) + n; // 원솟값에 n을 더한 값
            
            // 원솟값이 공백일 경우 공백 추가
            if(s.charAt(i) == ' ') {
                answer += " ";
            } 
            // 대문자면서 연산 후 'Z' 넘길 경우 or 'z'를 넘길 경우 26 빼주기(아스키코드 A : 65, Z : 90, a : 97, z : 122)
            else if(s.charAt(i) < 91 && num > 90 || num > 122) {
                num -= 26; // 다시 65 or 97로 돌아감  
                answer += (char) num;
            } 
            // 연산이 Z or z 범위 내일 경우
            else
                answer += (char) num;
        }
        
        return answer;
    }
}