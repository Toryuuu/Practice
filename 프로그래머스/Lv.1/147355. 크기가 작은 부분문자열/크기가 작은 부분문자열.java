class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length(); // t 길이
        int pLen = p.length(); // p 길이
        
        for(int i = 0; i <= tLen - pLen; i++) {
            // a. 문자열 t의 일부를 p 길이만큼 자르기
            String str = t.substring(i, i + pLen);
            long num = Long.parseLong(str);
            long pp = Long.parseLong(p);
            
            // b. 자른 문자열 숫자와 p 대소비교
            if(num <= pp) {
                answer++;
            }
        }
        
        return answer;
    }
}