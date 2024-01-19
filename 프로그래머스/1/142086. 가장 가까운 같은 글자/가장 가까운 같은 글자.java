class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1; // 맨 첫 글자는 무조건 -1
        
        for(int i = 1; i < s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i, i+1), i - 1); // i번째 인덱스값을 i-1 인덱스부터 역순으로 찾기 -> 인덱스(0부터 센) 반환
            
            // 같은 글자가 있으면
            if(x != -1) {
                answer[i] = i - x; 
            }
            // 같은 글자가 없으면 -1 반환
            else
                answer[i] = x;
        }
        
        return answer;
    }
}