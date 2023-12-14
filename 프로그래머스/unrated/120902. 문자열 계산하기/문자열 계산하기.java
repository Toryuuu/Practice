class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 공백 기준으로 분리 후 배열에 저장
        String[] str = my_string.split(" ");
        
        answer = Integer.parseInt(str[0]); // 초깃값을 str의 0번 인덱스값으로 지정
        
        for(int i = 1; i < str.length; i += 2) {
            if(str[i].equals("+")) {
                answer += Integer.parseInt(str[i+1]);
            } else if(str[i].equals("-")) {
                answer -= Integer.parseInt(str[i+1]);
            }
        }
        
        return answer;
    }
}