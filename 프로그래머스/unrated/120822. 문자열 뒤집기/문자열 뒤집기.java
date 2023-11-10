class Solution {
    public String solution(String my_string) {
        
        // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        int leng = charArray.length;
        
        for(int i = 0; i < leng / 2; i++) {
            // 1. 배열 값을 순서대로 temp에 대입
            char temp = charArray[i]; 
            // 2. 배열 값을 역순으로 대입(leng - 1 : 제일 마지막 값)
            charArray[i] = charArray[leng - 1 - i]; 
            // 3. 역순으로 다시 temp값 대입
            charArray[leng - 1 - i] = temp;
        }
        // 문자 배열을 다시 String으로 변환
        String answer = new String(charArray);
        
        return answer;
    }
}