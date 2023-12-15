class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n 원소를 하나씩 분리하여 문자열 배열에 저장
        String[] str = Integer.toString(n).split("");
        
        for(int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}