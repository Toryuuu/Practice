class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1; // 0번째 인덱스는 -1
        
        for(int i = 0; i < s.length(); i++) {
            // 0 ~ i-1 인덱스값 중에서 i인덱스값이 마지막으로 나온 인덱스 찾기
            int x = s.substring(0, i).lastIndexOf(s.charAt(i));
            // 똑같은 값이 존재할 경우
            if(x != -1) {
                answer[i] = i - x; 
            } else {
                answer[i] = x; // 똑같은 값 없으면 -1
            }
        }
            
        return answer;
    }
}