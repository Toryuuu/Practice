import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        
        Map<String, Integer> map = new HashMap<>();
        
        // 해시맵에 key와 value 추가
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            s = s.replace(entry.getKey(), entry.getValue().toString()); // map에 저장된 key(영단어)를 String 변환된 value(숫자)로 치환하기  
        }
        // int로 변환하여 리턴
        return Integer.parseInt(s);
    }
}