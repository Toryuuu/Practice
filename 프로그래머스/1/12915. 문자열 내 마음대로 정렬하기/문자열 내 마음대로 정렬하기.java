import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int cnt = 0;
        
        Arrays.sort(strings); // 오름차순 정렬
        
        // a ~ z 아스키코드 : 97 ~ 122
        for(int i = 97; i < 123; i++) {
            for(int j = 0; j < strings.length; j++) {
                // 각 단어의 인덱스 n의 문자가 아스키코드와 일치하면
                if(strings[j].charAt(n) == i) {
                    answer[cnt++] = strings[j]; // answer에 처음부터 차례로 넣어줌
                }
            }
        }
        
        return answer;
    }
}