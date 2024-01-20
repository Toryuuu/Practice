class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder("");
   
        for(int i = 0; i < s.length(); i++) {
           String val = String.valueOf(s.charAt(i)); // i번째 원솟값
            if(sb.lastIndexOf(val) != -1)
                answer[i] = i - sb.lastIndexOf(val);
            else  
                answer[i] = -1;
            
            sb.append(val);
        }
            
        return answer;
    }
}