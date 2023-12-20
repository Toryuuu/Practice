class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; 
         s = s.toLowerCase(); // 소문자로 통일
        
        // p의 개수만큼 +, y의 개수만큼 -
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                count++;
            } else if(s.charAt(i) == 'y') {
                count--;
            }
        }
        // p와 y의 개수가 같지 않으면
        if(count != 0) {
            answer = false;
        } // 같으면 기본값 return 리턴

        return answer;
    }
}