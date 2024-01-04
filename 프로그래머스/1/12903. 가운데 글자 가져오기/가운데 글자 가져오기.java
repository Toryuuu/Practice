class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        
        for(int i = 0; i < str.length; i++) {
            if(str.length % 2 == 1) {
                answer = str[(str.length - 1) / 2];
                break;
            } else
                answer = str[(str.length / 2) - 1];
                answer += str[str.length / 2];
        }
        
        
        return answer;
    }
}