import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0;
        
        Arrays.sort(str); // 오름차순 정렬
        

        for(int i = 0; i < str.length; i++) {
            count = 0; // 0으로 초기화
            for(int j = 0; j < str.length; j++) {
                if(str[i].equals(str[j])) {
                    count++;
                }
            }
            if(count == 1) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}