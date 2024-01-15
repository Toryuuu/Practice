class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int start = 0; // 시작 인덱스
        int end = p.length(); // 끝 인덱스(p의 길이)
        
        while(end < t.length() + 1) {
            long temp = Long.parseLong(t.substring(start, end)); // p 길이만큼 자른 문자열(인덱스 0 ~ p 길이)
            
            if(temp <= Long.parseLong(p)) {
                answer++; // 자른 숫자가 p 이하면 1 증가시킴
            }
            // 인덱스 1씩 증가시킨 후 반복 
            start++;
            end++;
        }
        
        return answer;
    }
}