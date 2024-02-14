import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백 단위로 잘라서 문자 배열에 저장
        String[] numbers = s.split(" ");
        
        // 문자 배열 원소들을 정수형으로 변환
        int[] num = new int[numbers.length];
        
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(num); // 오름차순 정렬
        
        answer = num[0] + " " + num[num.length - 1];
        
        return answer;
    }
}