import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides); // sides 오름차순 정렬
        
        answer = sides[0] + sides[1] > sides[2]? 1: 2;
        
        return answer;
    }
}