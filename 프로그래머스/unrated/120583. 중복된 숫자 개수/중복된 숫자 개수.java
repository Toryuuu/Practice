class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        String s = Integer.toString(n);
        
        // 문자열 배열 생성
        String[] str = new String[array.length];
        
        // 문자열 배열에 array 대입
        for(int i = 0; i < array.length; i++) {
            str[i] = Integer.toString(array[i]);
        }
        
        // 개수 세기
        for(int i = 0; i < str.length; i++) {
            if(!str[i].equals(s)) {
                continue;
            } else
                answer++;
        }
        
        return answer;
    }
}