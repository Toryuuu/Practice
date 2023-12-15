class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n 원소를 하나씩 분리하여 문자열 배열에 저장
        String[] str = String.valueOf(n).split("");
        
        for(String s : str) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}