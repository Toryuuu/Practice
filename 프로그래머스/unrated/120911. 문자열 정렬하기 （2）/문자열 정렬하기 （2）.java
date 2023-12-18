import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 문자열을 소문자로 변환하고 문자 배열로 변환
        char[] lower = my_string.toLowerCase().toCharArray();
        
        // 소문자로 구성된 문자 배열을 오름차순 정렬
        Arrays.sort(lower);
        
        // 정렬된 문자 배열을 문자열로 합친 후 리턴
        return answer = new String(lower);
    }
}