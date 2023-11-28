import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int len = numbers.length;
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        answer = numbers[len-1] * numbers[len-2];
        
        return answer;
    }
}