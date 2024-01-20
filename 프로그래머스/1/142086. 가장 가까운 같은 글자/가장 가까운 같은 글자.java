class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if(i != 0) {
                int x = s.substring(0, i).lastIndexOf(s.charAt(i));
                // 똑같은 값이 존재할 경우
                if(x != -1) {
                    answer[i] = i - x; 
                } else {
                    answer[i] = x; // 똑같은 값 없으면 -1
                }
            } else
                answer[i] = -1; // 0번째 인덱스는 -1
        }
            
        return answer;
    }
}