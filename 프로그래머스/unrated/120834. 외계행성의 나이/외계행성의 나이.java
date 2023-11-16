class Solution {
    public String solution(int age) {
        
        // age를 문자열로 변환
        String ageStr = String.valueOf(age);
        
        // 알파벳 소문자를 저장하는 문자열 생성
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
       
        // 결과를 저장할 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        
        // 1. ageStr를 문자 배열로 변환, 문자형 digitChar 사용해서 배열의 모든 원소에 하나씩 접근 
        // 2. digitChar이 해당하는 숫자의 정수값을 정수형 변수 digit에 저장
        // 3. 알파벳이 저장된 문자열에서 인덱스 번호를 찾아서 answer에 담아줌
        for(char digitChar : ageStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            answer.append(alphabet.charAt(digit));
        }
        
        // answer를 문자열로 변환 후 리턴
        return answer.toString();
    }
}