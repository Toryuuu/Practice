import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] c = commands[i];
            int[] temp = new int[c[1] - (c[0] - 1)];
            
            for(int j = 0; j < temp.length; j++) {
               temp[j] = array[j + (c[0] - 1)];
                // c[0] - 1 인덱스부터 1씩 증가시킨 원소 저장
            }
            Arrays.sort(temp); // 오름차순 정렬
            // K번째 수를 뽑아내서 answer에 대입
            answer[i] = temp[c[2] - 1]; // "번째" 수 -> -1 해줌
        }
        
        return answer;
    }
}