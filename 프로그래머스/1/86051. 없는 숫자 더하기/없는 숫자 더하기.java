import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // 없는 숫자를 저장할 ArrayList 생성
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < num.length; i++) {
            boolean found = false; // 기본값 false로 설정
           for(int j = 0; j < numbers.length; j++) {
               if(num[i] == numbers[j]) {
                   found = true;
                   break; // 값이 일치할 경우 빠져나감
               }
           }
           if(!found) {
               list.add(num[i]); // 없는 숫자만 리스트에 추가
           }
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i); // 없는 숫자들의 합  
        }
        
        return answer;
    }
}