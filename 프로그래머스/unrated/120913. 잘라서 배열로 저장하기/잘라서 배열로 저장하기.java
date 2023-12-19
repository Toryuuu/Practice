class Solution {
    public String[] solution(String my_str, int n) {
        
        int len = 0; // answer의 크기(잘라낼 덩어리 갯수)
        
        if(my_str.length() % n == 0) {
            len = my_str.length() / n;
        } else if(my_str.length() % n > 0) {
            len = (my_str.length() / n) + 1;
        }
       
        String[] answer = new String[len];
        
        // 각 덩어리를 대상으로 자르기
        for(int i = 0; i < len; i++) {
            if(my_str.length() >= n) {
                // n씩 나눌 수 있는 경우
                answer[i] = my_str.substring(0, n); // 0부터 n-1 인덱스까지 answer에 대입
                my_str = my_str.substring(n, my_str.length()); // 문자열을 n부터 끝까지로 재설정
            } else // 나머지 부분
                answer[i] = my_str.substring(0, my_str.length()); // 나머지 부분 : 처음부터 끝까지
        }
        
        return answer;
    }
}