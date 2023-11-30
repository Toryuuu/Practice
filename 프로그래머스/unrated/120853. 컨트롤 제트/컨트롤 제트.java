import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // s를 공백 기준으로 분리 후 담은 ArrayList 생성
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(s.split(" ")));
        
        // Z가 포함되지 않게 되면 벗어나는 WHILE문
        while(arr.contains("Z")) {
            arr.remove(arr.indexOf("Z")-1); // Z 인덱스 앞의 숫자 제거
            arr.remove(arr.indexOf("Z")); // 문자 Z 제거
        }
        
        // for문 돌려서 정수로 변환한 숫자 계산
        for(int i = 0; i < arr.size(); i++) {
            answer += Integer.parseInt(arr.get(i));
        }
        
        return answer;
    }
}