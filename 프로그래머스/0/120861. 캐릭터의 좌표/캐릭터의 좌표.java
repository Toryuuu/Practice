class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; // [0, 0]부터 시작
        int xlimit = board[0] / 2; // [0,0] 기준 x축 범위
        int ylimit = board[1] / 2; // [0,0] 기준 y축 범위
        
        // 입력값에 맞게 조작 
        for(int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "up" :
                    if(answer[1] < ylimit) {
                        answer[1]++;
                    }
                    break;
                case "down" :
                    if(answer[1] > -ylimit) {
                        answer[1]--;    
                    }
                    break;
                case "left" :
                    if(answer[0] > -xlimit) {
                        answer[0]--;    
                    }
                    break;
                case "right" :
                    if(answer[0] < xlimit) {
                        answer[0]++;    
                    }
                    break;
            }
        }
        
        return answer;
    }
}