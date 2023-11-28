import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String[] strArr = my_string.replaceAll("[^0-9]", "").split(""); // 문자열에서 소문자를 제거 후 한글자씩 떼서 문자열 배열에 저장
        
        Arrays.sort(strArr); // 문자열 배열을 오름차순 정렬
        
        int[] answer = new int[strArr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]); // 형변환 후 정수배열에 대입
        }
        
        return answer;
    }
}