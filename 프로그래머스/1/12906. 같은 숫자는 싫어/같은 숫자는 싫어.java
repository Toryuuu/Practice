import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                list.add(arr[0]); // 첫 번째 원소 무조건 추가
                continue;
            } else {
                if(list.get(list.size() - 1) == arr[i]) {
                    continue; // 다음에 들어갈 arr 원소가 list의 마지막 원소와 똑같으면 skip
                } else
                    list.add(arr[i]); // 똑같지 않으면 추가
            }
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