import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 배열 arr을 담은 ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                if(arr[i] != arr[i + 1]) {
                    list.add(arr[i]);
                } 
            } else
                list.add(arr[arr.length - 1]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}