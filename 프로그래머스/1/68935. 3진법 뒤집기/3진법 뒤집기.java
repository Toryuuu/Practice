class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 10진수 -> 3진수로 변환
        String three = Integer.toString(n, 3);
        
        // 3진수를 담은 StringBuffer 생성
        StringBuffer sb = new StringBuffer(three);
        
        // sb의 원소를 역순으로 담는 문자열
        String reverse = sb.reverse().toString();
        
        // 뒤집힌 3진수 -> 10진수로 변환
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}