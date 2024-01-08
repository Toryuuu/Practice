class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s); // 정수형으로 변환 
                answer = true; // 변환 가능할 경우 true
            } catch(NumberFormatException e) {
                answer = false; // 변환 불가능할 경우 false 리턴
            }
            
        } else
            answer = false; // 길이가 4 혹은 6이 아니면 false 리턴
        
        return answer;
    }
}