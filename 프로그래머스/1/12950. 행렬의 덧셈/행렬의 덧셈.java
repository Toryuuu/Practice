class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int rows = arr1.length; // 행 길이 = 가로 = 원래 배열 크기
        int cols = arr1[0].length; // 열 길이 = 세로 = 적어도 1개로 가정(arr1[0] 길이 = 열 길이가 됨)
        
        int[][] answer = new int[rows][cols]; 
        
        // 0, 0부터 동일한 인덱스끼리 더해줌
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }   
        }
        
        return answer;
    }
}