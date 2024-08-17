class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            int i = 0; // 문자열 word의 현재 탐색 위치
            while(i < word.length()) {
                boolean match = false;
                for(String w : words) {
                    if(i + w.length() <= word.length() && word.substring(i, i + w.length()).equals(w)) {
                        i += w.length(); // i를 단어 길이만큼 증가 후 반복
                        match = true;
                        break;
                    }
                }
                if(!match) {
                    break; // false일 경우 빠져나감
                }
            }
            if(i == word.length()) {
                answer++; // word가 발음할 수 있는 단어로 이루어져 있음  
            }
        }
        
        return answer;
    }
}