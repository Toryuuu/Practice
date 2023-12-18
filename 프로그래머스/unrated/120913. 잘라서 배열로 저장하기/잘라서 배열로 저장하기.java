import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        
        ArrayList<String> sList = new ArrayList<>();
        
        int count = 0;
        
        while(true) { // 무한반복
            if(my_str.length() <= n) {
              if(my_str.length() == 0) {
                  break; // 남은 문자열이 없으면 빠져나감
              } else {
                  sList.add(my_str); // 남은 문자열을 리스트에 추가
                  break; // 추가 후 빠져나감
              } 
            } 
            
            String str = my_str.substring(0, n); // 처음부터 n-1 인덱스까지의 문자열
            sList.add(str); // 리스트에 추가
            count++;
            my_str = my_str.substring(n); // 문자열에서 str 없앰
        }
        
        String[] answer = new String[sList.size()];
        
        // 리스트 값을 배열 answer에 담아줌
        for(int i = 0; i < sList.size(); i++) {
            answer[i] = sList.get(i); 
        }
        
        return answer;
    }
}