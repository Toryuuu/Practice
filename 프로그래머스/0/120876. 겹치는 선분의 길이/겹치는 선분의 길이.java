class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] points = new int[201]; // -100 ~ 100
        // 배열생성시 모든 원소 0으로 초기화
        
        for(int[] line : lines) {
            int start = line[0] + 100; // 맨 끝점 -100부터 시작
            int end = line[1] + 100; 
            
            for(int i = start; i < end; i++) {
                points[i]++; // 해당 범위 - 맨끝 1씩 추가
            }
        }
        
        // end 숫자는 뺐으므로 1 이상인 숫자만 카운트 
        for(int count : points) {
            if(count > 1) answer++;
        }
        
        return answer;
    }
}