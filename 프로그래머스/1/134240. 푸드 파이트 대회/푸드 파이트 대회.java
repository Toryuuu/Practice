class Solution {
    public String solution(int[] food) {
        String answer = "";
        String left = ""; 
        String right = "";
        
        // food[0]은 언제나 1이므로 i는 1부터 시작
        for(int i = 1; i < food.length; i++) {
            // 원솟값이 2 이상일 때
            if(food[i] >= 2) {
                // 인덱스 i를 몫 개수만큼 출력
                for(int j = 0; j < (food[i] / 2); j++) {
                    left += i; // 빈 문자열 left에 저장  
                }
            }
        }
        
        // 문자열 left를 담은 StringBuffer 생성
        StringBuffer sb = new StringBuffer(left);
        
        right = sb.reverse().toString(); // left 역순으로 담기
        answer = left + "0" + right;
        
        return answer;
    }
}