import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 하나씩 분리하여 배열로 저장
        String[] str = s.split("");
        
        // 배열 str을 역순(내림차순)으로 정렬
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String r : str) {
            answer += r; // 배열된 글자 담아주기
        }
        
        return answer;
    }
}