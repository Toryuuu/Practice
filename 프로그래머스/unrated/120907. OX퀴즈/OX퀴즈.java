class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            // quiz의 각 원소를 공백기준으로 분리
            String[] q = quiz[i].split(" ");
            // 각 숫자를 계산하기 위해 정수형으로 변환
            int num1 = Integer.parseInt(q[0]);
            int num2 = Integer.parseInt(q[2]);
            int num3 = Integer.parseInt(q[4]);
            
            if(q[1].equals("+")) {
                if((num1 + num2) == num3){
                    answer[i] = "O";
                } else
                    answer[i] = "X";
            } else {
                if((num1 - num2) == num3){
                    answer[i] = "O";
                } else
                    answer[i] = "X";
            }
        }
        
        return answer;
    }
}