class Solution {
    public String solution(String my_string, int n) {
       
        // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        
        // 문자 배열을 담을 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < charArray.length; i++) {
            for(int j = 1; j <= n; j++) {
                answer.append(charArray[i]);  
                // 각 문자를 n번 반복하여 answer에 추가
            }
        }
        // StringBuilder를 문자열로 변환 후 반환
        return answer.toString();
    }
}