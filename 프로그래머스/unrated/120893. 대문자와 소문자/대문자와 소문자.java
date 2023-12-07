class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 문자 배열로 변환
        char[] cmst = my_string.toCharArray();
        
        // 아스키코드 대문자 : 65~90, 소문자 : 97~122
        
        for(int i = 0; i < cmst.length; i++) {
            if(cmst[i] >= 65 && cmst[i] <= 90) {
                answer += Character.toLowerCase(cmst[i]);
            } else
                answer += Character.toUpperCase(cmst[i]);
        }
        
        return answer;
    }
}