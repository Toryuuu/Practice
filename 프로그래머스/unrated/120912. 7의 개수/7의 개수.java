class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        String[] str = new String[array.length];
        
        // 문자열 배열에 array를 담아줌
        for(int i = 0; i < array.length; i++) {
          str[i] = Integer.toString(array[i]);
        }
        
        for(int i = 0; i < str.length; i++) {
            String[] split = str[i].split("");
            
            for(int j = 0; j < split.length; j++) {
                if(split[j].equals("7")) {
                    count++;
                }
            }
        }
        
        answer = count;
        
        return answer;
    }
}