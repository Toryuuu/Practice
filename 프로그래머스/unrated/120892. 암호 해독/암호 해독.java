class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // cipher를 한 글자씩 분리 후 배열 str에 저장
        String[] str = cipher.split("");
       
        // for문을 돌려 code의 배수만 저장
        for (int i = 1; i <= str.length; i++) {
            // 인덱스 i가 code의 배수일 때
            if (i % code == 0) {
                answer += str[i-1]; // answer에 저장
            }
        }
        
        return answer;
    }
}