import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 하나씩 분리하여 배열로 저장
        String[] str = s.split("");
        
        // 배열 str을 역순(내림차순)으로 정렬
        Arrays.sort(str, Collections.reverseOrder());
        
        // 구분자 없이(붙여서) str 원소들을 조합하기
        return String.join("", str);
    }
}