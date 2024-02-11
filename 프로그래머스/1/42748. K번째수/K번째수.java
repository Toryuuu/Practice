import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] c = commands[i];
            
            // 배열 array 자르고 정렬하기
            int[] cut = Arrays.copyOfRange(array, c[0] - 1, c[1]); // n번째 숫자를 구해야 하므로 인덱스-1부터 시작, 메서드에서 3번째 인자는 결과에 미포함이므로 -1 안 해줌.
            Arrays.sort(cut); // 오름차순 정렬
            
            // K번째 수를 뽑아내서 answer에 대입
            answer[i] = cut[c[2] - 1]; // "번째" 수 -> -1 해줌
        }
        
        return answer;
    }
}