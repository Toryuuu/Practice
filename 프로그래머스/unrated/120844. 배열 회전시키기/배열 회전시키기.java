class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int[numbers.length];
        int len = numbers.length;
        
        // 1. direction이 왼쪽인 경우
        if(direction.equals("left")) {
            for(int i = 0; i < len-1; i++) {
                answer[i] = numbers[i+1];
                answer[len-1] = numbers[0];
            }
        } else // 2. direction이 오른쪽인 경우
            for(int i = 1; i < len; i++) {
                answer[0] = numbers[len-1];
                answer[i] = numbers[i-1];
            }
                  
        return answer;
    }
}