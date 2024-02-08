import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings); // 오름차순 정렬
        Arrays.sort(strings, Comparator.comparing(s -> s.substring(n, n+1))); // 각 문자열의 n번째 문자를 기준으로 정렬
        
        return strings;
    }
}