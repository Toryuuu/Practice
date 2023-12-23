class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        // x의 각 자릿수를 분리 후 문자열 배열에 저장
        String[] str = Integer.toString(x).split("");
        
        int sum = 0; // 자릿수의 합
        
        for(String s : str) {
            sum += Integer.parseInt(s);
        }
        
        if(x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}