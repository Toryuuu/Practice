class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split(""); // 문자열 분리 후 배열에 저장
        
        for(int i = 0; i < num.length; i++) {
            if(i < num.length - 4) {
                answer += "*";
            } else
                answer += num[i];
        }
        
        return answer;
    }
}