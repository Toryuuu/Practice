class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 4개 혹은 6개의 숫자로 구성된 문자열
        String str = "\\d{4}|\\d{6}"; 
        
        if(!s.matches(str))
            answer = false;
        
        return answer;
    }
}