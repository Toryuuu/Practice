import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        // 각 문자열의 인덱스 n번째 글자 + 배열 strings 요소들을 list에 담아주기 
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]); 
        }
        
        // n번째 글자 순으로 오름차순 정렬
        Collections.sort(list); 
        
        // list 요소의 0번 인덱스 제외하고 answer에 담기 
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}