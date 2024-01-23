import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = 0;
        
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
        
        // s 길이 초과시 빠져나옴
        while(n < s.length()) {
            // 문자열 인덱스값이 숫자일 경우
            if(Character.isDigit(s.charAt(n))) {
                // 자릿수 맞추기 위해 10을 곱한 후 숫자 더해주기
                answer = answer * 10 + Character.getNumericValue(s.charAt(n));
                n += 1; // 한 자리씩 증가
            } else {
                for(String i : map.keySet()) {
                // 문자열 s가 인덱스 n부터 i로 시작하는지 검사 
                if(s.startsWith(i, n)) {
                    // 자릿수 맞추기 위해 10을 곱한 후 값 더해주기
                    answer = answer * 10 + map.get(i);
                    // n에 i 길이만큼 더한 후 반복
                    n += i.length();
                    break;
                } 
              }
            }
        }
        
        return answer;
    }
}