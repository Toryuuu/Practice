import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        // 문자열 분리 후 배열에 담기
        char[] c = s.toCharArray();
        
        Arrays.sort(c); // 오름차순 정렬
        
        return new StringBuilder(new String(c)).reverse().toString();
    }
}