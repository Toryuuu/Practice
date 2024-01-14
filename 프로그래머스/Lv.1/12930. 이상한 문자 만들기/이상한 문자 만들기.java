class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase(); // 소문자로 통일시키기
        
        String[] sArray = s.split(""); // 한 글자씩 분리
        int idx = 0; // 인덱스
        
        for(int i = 0; i < sArray.length; i++) {
            if(idx % 2 == 0) {
                sArray[i] = sArray[i].toUpperCase();
                // 짝수번째 알파벳 대문자로 변환
            }
            if(sArray[i].isBlank()) {
                idx = - 1; // 공백일 경우 인덱스 1 감소
            }
            answer += sArray[i];
            idx++;
        }
        
        return answer;
    }
}