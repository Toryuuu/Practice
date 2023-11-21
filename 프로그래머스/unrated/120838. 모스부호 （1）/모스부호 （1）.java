class Solution {
    public String solution(String letter) {
        String answer = "";
       
        // 모스부호가 담긴 문자열 배열 생성
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 공백을 기준으로 분리 후 문자열 배열에 저장
        String[] letterArray = letter.split(" ");
        
        // for문을 돌려 StringBuilder에 담아주기
        // 1. 각 글자가 morse 배열의 몇 번째 인덱스인지 알아내기
        // 2. 해당 인덱스+97로 소문자 뽑아내서 담아주기
        for(String let : letterArray) {
           
            for(int i = 0; i < morse.length; i++) {
                if(morse[i].equals(let))
                  answer += (char)(i + 'a');  
            }
        }
        
        return answer;
    }
}