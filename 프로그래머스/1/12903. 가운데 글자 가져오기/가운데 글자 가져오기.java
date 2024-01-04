class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 하나씩 분리 후 배열로 저장
        String[] str = s.split("");
        
        for(int i = 0; i < str.length; i++) {
            // 홀수 길이일 경우
            if(str.length % 2 == 1) {
                answer = str[(str.length - 1) / 2];
                break;
            } 
            // 짝수 길이일 경우 
                else {
                    answer = str[(str.length / 2) - 1];
                    answer += str[str.length / 2];
                }
        }
        
        return answer;
    }
}