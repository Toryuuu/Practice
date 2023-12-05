import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 한 자씩 분리한 my_string을 담은 ArrayList 생성
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        // 중복 제거를 위해 LinkedHashSet 생성
        Set<String> UniqueSet = new LinkedHashSet<>(list);
        
        // 중복이 제거된 리스트를 다시 ArrayList에 할당
        ArrayList<String> result = new ArrayList<>(UniqueSet);
        
        // 문자열 변수 s로 result를 순회하며 한 자씩 answer에 추가
        for(String s : result) {
            answer += s;
        }
        
        return answer;
    }
}