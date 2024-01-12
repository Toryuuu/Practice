class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 10진수 -> 3진수로 변환
        String three = Integer.toString(n, 3);
        
        // 3진수를 한자리씩 분리 후 배열에 담기
        String[] str = three.split("");
        
        String reverse = ""; // 뒤집은 숫자를 담을 문자열
        
        // 3진수를 역순으로 문자열에 담아주기
        for(int i = 0; i < str.length; i++) {
            reverse += str[str.length - 1 - i];
        }
        
        // 뒤집힌 3진수 -> 10진수로 변환
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}