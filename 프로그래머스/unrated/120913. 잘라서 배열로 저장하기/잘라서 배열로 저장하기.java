import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        
        ArrayList<String> list = new ArrayList<>();
        int len = my_str.length(); // 문자열 길이
        
        // 문자열이 n으로 나눠떨어지는 경우
        for(int i = 0; i < (len / n); i++) {
            list.add(my_str.substring((n * i), (n * (i + 1)))); // end 인자에 +1 꼭 해주기
}
        
        // 문자열이 n으로 나눠떨어지지 않는 경우 나머지 처리
        if(len % n != 0) {
            list.add(my_str.substring((len / n) * n));
        }
        
        // list를 문자열 배열로 변환
        String[] answer = list.toArray(new String[0]);
            
        return answer;
    }
}