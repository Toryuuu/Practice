class Solution {
    public String solution(int[] food) {
        String answer = "";
        String s = ""; // 임시 문자열
        
        for(int i = 0; i < food.length; i++) {
            // 원솟값이 2 이상일 때
            if(food[i] >= 2) {
                // 인덱스 i를 몫 개수만큼 출력
                for(int j = 0; j < food[i] / 2; j++) {
                    s += i; // 빈 문자열 s에 저장  
                }
            }
        }
        
        String[] str = s.split(""); // 한글자씩 분리
        
        // answer에 추가하기
        for(int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        answer += "0"; // 0 덧붙이기
        
        // 문자열 역으로 복사해서 덧붙이기
        for(int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        
        return answer;
    }
}