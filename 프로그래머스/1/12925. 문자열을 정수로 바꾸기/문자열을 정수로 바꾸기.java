class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1; // 부호(기본적으로 +로 가정)
        
        // 부호에 따라 -1이나 1을 매치해줌
        if(s.charAt(0) == '-') {
            sign = -1; // -이면 음수로 설정
            s = s.substring(1); // 부호 제거
        } else if(s.charAt(0) == '+') { // 부호가 없을 수도 있으므로 조건식 꼭 적어주기
            sign = 1;
            s = s.substring(1);
        }
        
        // 문자 0(아스키코드 48)을 빼서 char -> int 변환
        for(int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            answer = answer * 10 + num; // 10씩 곱해서 자릿수를 지정 
        }
        
        // 부호를 곱해서 리턴
        return answer * sign;
    }
}