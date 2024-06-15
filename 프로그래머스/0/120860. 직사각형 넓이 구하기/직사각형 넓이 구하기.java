class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int width = 0; // 가로길이
        int height = 0; // 세로길이
        int x = dots[0][0];
        int y = dots[0][1];
        
        for(int i = 1; i < dots.length; i++) {
            if(x != dots[i][0])
                width = Math.abs(dots[i][0] - x);
            if(y != dots[i][1])
                height = Math.abs(dots[i][1] - y);
        }
        
        answer = width * height;
        
        return answer;
    }
}