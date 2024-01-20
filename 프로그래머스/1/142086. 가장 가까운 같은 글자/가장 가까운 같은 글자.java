import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 원소값과 인덱스를 추가할 해시맵 생성
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            // map에 i번째 원소가 없으면
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1; 
                map.put(s.charAt(i), i); // map에 추가
            } 
            // 원소가 map에 존재하는 경우
            else {
                answer[i] = i - map.get(s.charAt(i));
                // i - key(원소값)과 짝지어진 value(인덱스)
                map.put(s.charAt(i), i); // map에 추가
            }
        }
        
        return answer;
    }
}