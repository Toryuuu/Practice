class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백 기준으로 나누어 배열에 저장
        String[] words = s.split(" ", -1); // -1 추가하여 빈 문자열도 포함되도록 함.
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // 공백문자가 연속해서 나올 경우 답에도 공백 더해줌
            if(word.isEmpty()) {
                answer += " ";
                continue;
            }
            
            // word의 0번 인덱스(첫글자)
            char init = word.charAt(0);
            
            // 모두 소문자로 변환 후 첫글자만 대문자로 변환
            word = word.toLowerCase();
            if(Character.isDigit(init)){
                answer += word + " ";
            } else {
                word = Character.toUpperCase(init) + word.substring(1);
                answer += word + " ";
            }
        }
            // 마지막에 있는 공백 제거
            if(answer.length() > 0) {
                answer = answer.substring(0, answer.length() - 1);
            }
             
        return answer;
    }
}