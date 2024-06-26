class Solution {
    public int solution(String my_string) {
        int answer = 0; // 숫자의 누적값 
        String num = ""; // 숫자를 문자열 형태로 저장하는 변수 
        
        // 포인트 : 숫자가 연속할 경우 어떻게 처리?
        
        // 문자열을 순회하는 for문으로 숫자 걸러내기
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); // i번째 인덱스 글자
            
            // i번째 글자가 숫자인 경우
            if(c >= '0' && c <= '9') {
                num += c; // 문자열 형태로 이어붙이기
            } else {
                // i번째 글자가 문자인 경우
                // NumberFormatException 방지 위해 num에 값이 있는 경우로 한정
                if(!num.isEmpty()) {
                    answer += Integer.parseInt(num); // 저장된 숫자들을 int로 변환하여 리턴값에 누적
                    num = ""; // 숫자를 담는 문자열 초기화
                }
            }
        }
        
        // 마지막 글자가 숫자인 경우 남은 숫자 처리
        if(!num.isEmpty()){
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}