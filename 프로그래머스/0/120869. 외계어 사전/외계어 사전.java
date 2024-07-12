import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell과 dic 모두 정렬 후 같은지 비교
        
        // spell 한 글자씩 분리 후 문자배열로 전환
        char[] s_char = String.join("", spell).toCharArray();
        
        Arrays.sort(s_char); // 문자배열 오름차순 정렬

        // 정렬된 문자배열 문자열(한 단어)로 변환
        String newSpell = new String(s_char); 
        
        // dic의 단어를 하나씩 정렬한 후 비교
        for(String word : dic) {
            char[] d_char = word.toCharArray(); // 한 단어를 char배열로
            Arrays.sort(d_char); // 오름차순 정렬
            String newDic = new String(d_char); // 문자열로 변환
            
            // spell 문자열과 비교 후 1 혹은 2 리턴
            if(newDic.equals(newSpell))
                return 1;          
        }
   
        return 2;
    }
}