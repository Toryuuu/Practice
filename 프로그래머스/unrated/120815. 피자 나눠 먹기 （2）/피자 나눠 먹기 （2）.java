class Solution {
    public int solution(int n) {
        int answer = 0; // 피자 수
        final int slices = 6;  // 피자 개당 조각 수
        
        while(true) { // 무한루프
            answer++; // 피자 수 1씩 증가
            int total = slices * answer; // 총 조각 수
            
            if(total % n == 0) { // 총 조각 수가 사람 수로 나눠떨어지면 
                 return answer; // 피자 개수 리턴      
            }
        }
    }
}