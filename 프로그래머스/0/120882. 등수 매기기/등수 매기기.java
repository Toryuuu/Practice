import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        
        // 배열 단위로 이차원 배열 score 순회 
        for(int[] i : score) {
            list.add(i[0] + i[1]); // 점수의 합을 list에 삽입
        }
        
        // 합계순 내림차순 정렬
        list.sort(Comparator.reverseOrder());
        
        // 등수 매기기
        for(int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1; // 등수는 1부터 시작이므로 1 더하기
        }
        
        return answer;
    }
}