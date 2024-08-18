class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            for(String w : words) {
                word = word.replaceFirst(w, "-");
            }
            if(word.replaceAll("-", "").isEmpty()) {
                answer++;
            }
        }
            
        return answer;
    }
}