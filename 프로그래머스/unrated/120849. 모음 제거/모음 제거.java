class Solution {
    public String solution(String my_string) {
        // my_string에서 모음을 제거한 후 리턴
        String answer = my_string.replaceAll("[aeiou]", "");
        
        return answer;
    }
}