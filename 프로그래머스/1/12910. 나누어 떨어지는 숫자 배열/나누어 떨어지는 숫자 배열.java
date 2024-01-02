import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = {-1}; // -1로 디폴트 설정
        
        // divisor 값을 담을 ArrayList 생성
        List<Integer> list = new ArrayList<Integer>();
        
        // 배열 arr에서 divisor로 나눠떨어지는 원소 리스트에 추가
        for(int num : arr) {
            if(num % divisor == 0) 
                list.add(num);
        }
        
        // 리스트에 값이 존재할 경우(나눠떨어지는 수가 있으면)
        if(list.size() != 0) {
            answer = new int[list.size()]; // 리스트와 같은 크기로 설정
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i); // 배열에 리스트 원소 대입
            }
            // 오름차순 정렬
            Arrays.sort(answer); 
        }
        
        return answer;
    }
}