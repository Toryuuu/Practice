import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열 분리 후 배열에 담기
        String[] str = s.split("");
        
        Arrays.sort(str); // 오름차순 정렬
        
        // 역순으로 배열 answer에 담기
        for(int i = 0; i < str.length; i++) {
            answer += str[str.length - 1 - i];
        }
        
        return answer;
    }
}