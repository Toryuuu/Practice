class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer = new int[numbers.length]; // numbers의 크기와 같은 배열 선언
        
        for(int i =0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}