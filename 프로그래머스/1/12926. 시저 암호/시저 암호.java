class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) + n; // 연산 후의 값
            
            // 1. 원솟값이 공백일 경우
            if(s.charAt(i) == ' ') {
                sb.append(" "); 
            } 
            // 2. 연산한 값이 소문자 z를 넘어가는 경우
            else if(num > 'z') {
                int diff = num - 'z'; 
                sb.append((char)('a' + diff%26 - 1));
            }
            // 3. 연산한 값이 대문자이면서 Z를 넘어가는 경우
            else if(num > 'Z' && s.charAt(i) <= 'Z') {
                int diff = num - 'Z'; 
                sb.append((char)('A' + diff%26 - 1));
            } 
            // 4. 연산한 값이 대/소문자 범위 내인 경우
            else {
                sb.append((char) num);    
            }
        }
            
        return sb.toString();
    }
}