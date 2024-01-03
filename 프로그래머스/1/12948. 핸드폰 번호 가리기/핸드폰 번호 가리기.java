class Solution {
    public String solution(String phone_number) {
        
        // 문자배열로 변환
        char[] num = phone_number.toCharArray();
        
        for(int i = 0; i < num.length - 4; i++) {
           num[i] = '*'; // 대체
        }
        // 문자열로 변환하여 리턴
        return new String(num);
    }
}