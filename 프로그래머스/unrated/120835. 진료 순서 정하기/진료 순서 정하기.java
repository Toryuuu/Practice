class Solution {
    public int[] solution(int[] emergency) {
       
        // 순위를 담을 정수배열 생성
        int[] answer = new int[emergency.length];
    
        // for문을 이용해서 answer 배열에 담아주기
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]){
                    answer[i]++; // 응급도가 낮을수록 순위는 증가
                } 
            } answer[i]++; // 제일 높은 순위가 0이 아닌 1이 되어야 하므로 1씩 더해줌 
        }
        
        return answer;
    }
}