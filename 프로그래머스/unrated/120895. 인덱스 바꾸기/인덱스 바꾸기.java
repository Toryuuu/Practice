class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // my_string 문자열을 담은 StringBuilder 생성
        StringBuilder sb = new StringBuilder(my_string);
        
        char c = sb.charAt(num1); // num1 인덱스에 해당하는 글자
        sb.setCharAt(num1, sb.charAt(num2)); // num1 인덱스의 문자를 num2 인덱스에 해당하는 글자로 대체
        sb.setCharAt(num2, c); // num2 인덱스의 문자를 c로 대체
        
        answer = sb.toString(); // sb를 문자열로 변환 후 리턴
        
        return answer;
    }
}