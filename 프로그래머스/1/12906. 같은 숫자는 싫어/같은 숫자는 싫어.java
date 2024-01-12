import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // 배열 arr의 연속되지 않는 원소만 list에 담기
        for(int i = 0; i < arr.length; i++) {
            // 마지막 원소가 아닐 경우
            if(i != arr.length - 1) {
                if(arr[i] != arr[i + 1]) {
                    list.add(arr[i]); // 다음 원소와 같지 않으면 list에 추가
                } 
            // 마지막 원소는 무조건 list에 추가
            } else 
                list.add(arr[arr.length - 1]);
        }
        // list와 같은 크기의 배열 생성
        int[] answer = new int[list.size()];
        
        // answer에 list의 원소 옮겨담기
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}