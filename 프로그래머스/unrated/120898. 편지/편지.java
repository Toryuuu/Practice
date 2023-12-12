class Solution {
    public int solution(String message) {
        int answer = 0;
        
        // 문자 배열로 변환
        char[] len = message.toCharArray();
        for(int i = 0; i < len.length; i++) {
            answer = 2 * len.length;
        }
        
        return answer;
    }
}