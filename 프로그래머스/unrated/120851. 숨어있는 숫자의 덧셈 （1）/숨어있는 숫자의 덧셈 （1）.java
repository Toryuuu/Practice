class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 문자열에서 숫자 제외하고 삭제 후 하나씩 분리하고 배열에 저장
        String[] mstr = my_string.replaceAll("[^0-9]", "").split("");
        
        // 숫자 계산을 위한 정수배열 생성
        // int[] numbers = new int[mstr.length];
        
        // for문을 돌려 정수형으로 변환한 모든 원소값 더하기
        for(int i = 0; i < mstr.length; i++) {
            answer += Integer.parseInt(mstr[i]);
        }
        
        return answer;
    }
}