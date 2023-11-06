class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int number : numbers) {
            sum += number; // numbers 배열 값들 순차적으로 더함
        }
        
        answer = sum / numbers.length;
        // 모든 원소 더한 값을 배열 길이로 나눔
        
        return answer;
    }
}