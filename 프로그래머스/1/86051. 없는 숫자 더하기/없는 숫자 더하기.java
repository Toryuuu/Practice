class Solution {
    public int solution(int[] numbers) {
        
        int sum = 45; // 0부터 9를 더한 값
        
        for(int i : numbers) {
            sum -= i; // 합계에서 numbers에 있는 숫자를 빼줌
        }
        
        return sum;
    }
}