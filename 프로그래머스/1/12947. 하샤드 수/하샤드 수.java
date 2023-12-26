class Solution {
    public boolean solution(int x) {
        
        String s = "" + x; // x 문자열로 변환
        int sum = 0; // 자릿수 합
        
        for(int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0'; // -'0' : 정수로 변환
        }
        
        return (x % sum == 0)? true: false;
    }
}