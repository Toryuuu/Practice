class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split(""); // 문자열 분리 후 배열에 저장
        // 값을 담을 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        
        // 마지막에서 4번째 인덱스까지 *로 대체하고 StringBuilder에 추가
        for(int i = 0; i < num.length - 4; i++) {
            sb.append("*");
        }
        // 마지막 4자리 숫자를 StringBuilder에 추가
        for(int i = num.length - 4; i < num.length; i++) {
            sb.append(num[i]);
        }
        // StringBuilder를 문자열로 변환 후 리턴
        answer = sb.toString();
        
        return answer;
    }
}