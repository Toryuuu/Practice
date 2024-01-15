import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
      
        int maxWidth = 0;
        int maxHeight = 0;

        // forEach문으로 [가로길이, 세로길이] 한 덩어리씩 비교
        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]); // 둘 중 큰 수를 임시 가로길이 지정
            int height = Math.min(size[0], size[1]); // 둘 중 작은 수를 임시 세로길이로 지정

            // 임시값과 비교해가며 가장 큰 가로길이 구하기
            maxWidth = Math.max(maxWidth, width);

            // 임시값과 비교해 가장 큰 세로길이 구하기
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return maxWidth * maxHeight;
    }
}