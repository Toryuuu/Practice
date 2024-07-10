import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 오름차순 정렬
        Arrays.sort(sides); 
        int min = sides[0];
        int max = sides[1];
        
        int low_range = max - min;
        int high_range = max + min;
        
        answer = high_range - low_range - 1;
        
        return answer;
    }
}