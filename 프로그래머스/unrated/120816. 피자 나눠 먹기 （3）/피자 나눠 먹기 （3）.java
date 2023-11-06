class Solution {
    public int solution(int slice, int n) {
        int answer = 0; // 시켜야 하는 피자 수
        int totalSlices = 0; // 총 피자 조각 수
        
        // 총 조각 수가 인원수 이상이 되면(정답) 빠져나옴
        while(totalSlices < n) {
            answer++; // 피자 수 증가시킴
            totalSlices += slice; // 총 조각 수는 입력된 조각 수를 더한 것
        }
        return answer;
    }
}