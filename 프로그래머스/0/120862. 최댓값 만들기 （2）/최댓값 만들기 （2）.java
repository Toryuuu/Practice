import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0; // 음수 중 가장 큰 두 값을 곱한 값
        int temp2 = 0; // 양수 중 가장 큰 두 값을 곱한 값
        
        // 오름차순 정렬
        Arrays.sort(numbers);
        
        // 가장 작은 수가 음수일 때 -> 바로 오른쪽에 있는 음수와 곱하기
        if(numbers[0] < 0 && numbers[1] < 0) {
            temp = numbers[0] * numbers[1];
            temp2 = numbers[numbers.length - 1] * numbers[numbers.length - 2]; 
            answer = (temp < temp2)? temp2: temp;
        } else { // 가장 큰 수가 양수일 때 -> 바로 왼쪽에 있는 수와 곱하기
            answer = numbers[numbers.length - 1] * numbers[numbers.length - 2]; 
        }
        
        return answer;
    }
}