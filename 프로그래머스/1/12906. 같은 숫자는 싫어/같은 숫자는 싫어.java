import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]); // 첫 번째 원소는 무조건 추가
        
        // arr[1]부터 순회하면서 연속되지 않은 숫자만 list에 추가
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                list.add(arr[i]);
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