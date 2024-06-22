import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        // 오름차순 정렬
        Arrays.sort(numbers);
        
        // 가장 큰 수끼리의 곱
        int max1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        // 가장 작은 수끼리의 곱(둘 다 음수일 경우 양이 되므로)
        int max2 = numbers[0] * numbers[1];
        
        // 둘 중 더 큰 값을 리턴
        return Math.max(max1, max2);
    }
}