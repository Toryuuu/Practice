import java.util.Arrays;

class Solution {
    public long solution(long n) {
        
        
        String result = "";
        
        // char배열로 변환
        char[] arr = Long.toString(n).toCharArray();
        // 오름차순 정렬
        Arrays.sort(arr);
        // 역순으로 result에 담아줌
        for(int i = 0; i < arr.length; i++) {
            result += arr[arr.length -1 - i];
        }
        // long으로 변환 후 리턴
        long answer = Long.parseLong(result);
    
        return answer;
    }
}