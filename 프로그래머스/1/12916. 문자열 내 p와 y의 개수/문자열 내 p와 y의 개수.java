class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0; // p의 개수
        int y = 0; // q의 개수
		s = s.toLowerCase(); // 소문자로 통일

        for(int i = 0; i < s.length(); i++) {
            // p와 y의 개수 세기
            if(s.charAt(i) == 'p') 
                p++;
            else if(s.charAt(i) == 'y') 
                y++;
        }
        // p와 y 개수가 다를 경우
        if(p != y) {
            answer = false;
        } // 그 외(같거나 없을 경우)는 기본값 true 리턴

        return answer;
    }
}