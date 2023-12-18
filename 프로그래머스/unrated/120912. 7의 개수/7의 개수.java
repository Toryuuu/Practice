class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            String[] split = str.split("");
            
            for(int j = 0; j < split.length; j++) {
                if(split[j].equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}