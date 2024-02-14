import java.util.*;

class Solution {
    public String solution(String s) {
        // Collections 기능을 쓰기 위해 리스트 생성
        List<Integer> list = new ArrayList<Integer>();
        
        // 공백 단위로 잘라서 문자 배열에 저장
        String[] num = s.split(" ");
        
        // list에 문자 추가 
        for(int i = 0; i < num.length; i++) {
            list.add(Integer.parseInt(num[i]));    
        }
        
        String answer = Collections.min(list) + " " + Collections.max(list);
        
        return answer;
    }
}