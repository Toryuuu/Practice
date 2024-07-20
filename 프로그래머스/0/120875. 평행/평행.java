class Solution {
    // 기울기 구하는 함수
    private double getSlope(int[] d1, int[]d2) {
            return (double) (d2[1] - d1[1]) / (d2[0] - d1[0]); 
            // 기울기 == y축의 차 / x축의 차
        }
    
    public int solution(int[][] dots) {
        if(getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) return 1;
        if(getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) return 1;
        if(getSlope(dots[0], dots[3]) == getSlope(dots[2], dots[1])) return 1;
        
        return 0;
    }
}