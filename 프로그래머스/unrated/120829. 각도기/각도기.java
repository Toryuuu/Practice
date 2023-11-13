class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if(angle == 180){ // 각이 180도일 때
            answer = 4;
        } else if(angle > 90) { // 각이 90도 이상일 때
            answer = 3;
        } else if(angle == 90) { // 각이 90도일 때
            answer = 2;
        } else // 각이 90도 미만일 때
            answer = 1;
        
        return answer;
    }
}