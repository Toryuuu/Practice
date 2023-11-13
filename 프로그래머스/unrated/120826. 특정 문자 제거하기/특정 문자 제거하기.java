class Solution {
    public String solution(String my_string, String letter) {
        
        // 문자열 my_string을 char 배열로 변환
        char[] charArray = my_string.toCharArray();
        
        // 문자열 letter를 char형으로 변환
        char let = letter.charAt(0); // 문자열의 0번째 인덱스
        
        // 결과를 담을 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] != let)  // letter가 아닌 문자이면
                answer.append(charArray[i]); // answer에 추가   
        }
        
        return answer.toString();
    }
}