import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // 복사할 길이 지정
        int length = num2 - num1 +1; // 인덱스 0부터 시작이므로 +1
        
        // 결과를 저장할 배열 생성
        int answer[] = new int[length];
        
        // 배열 numbers에서 지정한 부분을 복사하여 배열 answer에 저장
        System.arraycopy(numbers, num1, answer, 0, length);
    
        
        return answer;
    }
}