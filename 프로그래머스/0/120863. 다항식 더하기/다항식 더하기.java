class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0; // 변수 x 앞에 오는 숫자
        int num = 0; // 상수항
        
        // " + " 기준으로 분리 후 문자열 배열에 저장
        String[] temp = polynomial.split(" \\+ ");
        
        
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].contains("x")) {
                if(temp[i].equals("x")) {
                    xNum += 1; // x 앞에 숫자가 없는 경우 1로 처리 
                } else {
                    int xx = temp[i].indexOf("x"); // x의 인덱스번호
                    xNum += Integer.parseInt(temp[i].substring(0, xx)); // 처음부터 "x" 전까지(숫자만) 잘라내서 더해주기
                }
            } else {
                // 상수항 더하기
                num += Integer.parseInt(temp[i]);
            }
        }
        
        // answer에 값 넣어주기
        // 1. x 앞의 값을 더한 xNum에 "x" 붙이기
        if(xNum != 0) {
            if(xNum == 1) {
                answer += "x"; // x 앞의 수가 1일 경우 x로 표시
            } else {
                answer += Integer.toString(xNum) + "x";
                // xNum을 문자열로 변환하고 "x" 붙여줌
            }
        }
        // 2. 상수항이 있을 경우 문자열로 변환하기
        if(num != 0) {
            if(!answer.equals("")) {
                answer += " + "; // x항이 존재할 경우
            }
            answer += Integer.toString(num); // 문자열로 변환
        }
        
        return answer;
    }
}