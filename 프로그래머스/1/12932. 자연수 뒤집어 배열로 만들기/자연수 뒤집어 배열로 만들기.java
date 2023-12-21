class Solution {
    public int[] solution(long n) {
        
        // 하나씩 분리하여 문자열 배열에 저장
        String[] s = Long.toString(n).split("");
        
        int[] answer = new int[s.length];
        
        for(int i = 0; i < s.length; i++) {
            answer[i] = Integer.parseInt(s[s.length - 1 - i]); // s의 역순부터 대입
        }
        
        return answer;
    }
}