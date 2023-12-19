class Solution {
    public String[] solution(String my_str, int n) {
        
        // 배열 answer의 크기(쪼개지는 덩어리 개수)
        int len = (my_str.length() + n - 1) / n;
        
        String[] answer = new String[len];
        
        // 각 덩어리마다 시작과 끝 인덱스 지정하기
        for(int i = 0; i < len; i++) {
            int start = n * i; // 시작점 : n의 배수
            int end = 0; // 끝은 0으로 초기화
            
            if(start + n >= my_str.length()) {
                // 시작점이 문자열을 넘어가면
                end = my_str.length(); // 끝 인덱스 = 문자열의 마지막 인덱스
            } else {
                // 시작점이 문자열 내인 경우
                end = start + n; // 끝 인덱스 = 시작점 + n(n의 배수)
            }
             // answer에 잘라낸 각 덩어리를 대입(end : end-1 인덱스까지 잘라냄)
             answer[i] = my_str.substring(start, end);   
        }
        
        return answer;
    }
}