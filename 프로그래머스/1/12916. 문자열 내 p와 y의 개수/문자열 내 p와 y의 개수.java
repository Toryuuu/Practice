class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0; // p의 개수
        int y = 0; // q의 개수

        for(int i = 0; i < s.length(); i++) {
            // p와 y의 개수 세기
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }
        
        if(p != y) {
            answer = false;
        } else if(p == y) {
            answer = true;
        } else if(p == 0 && y == 0) {
            answer = true;
        }

        return answer;
    }
}