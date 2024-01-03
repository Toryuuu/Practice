import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < num.length; i++) {
            boolean found = false;
           for(int j = 0; j < numbers.length; j++) {
               if(num[i] == numbers[j]) {
                   found = true;
                   break;
               }
           }
           if(!found) {
               list.add(num[i]);
           }
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);   
        }
        
        return answer;
    }
}