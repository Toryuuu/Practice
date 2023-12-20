import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        
        // stream으로 구하기
        return IntStream.of(arr).average().orElse(0);
    }
}