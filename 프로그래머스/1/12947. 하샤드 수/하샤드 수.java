class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        // x의 각 자릿수를 분리 후 문자열 배열에 저장
        String[] str = Integer.toString(x).split("");
        
        int sum = 0; // 자릿수의 합
        
        // 문자열의 각 원소(자릿수)를 더한 후 int로 형변환
        for(String s : str) {
            sum += Integer.parseInt(s);
        }
        
        // x가 자릿수의 합으로 나눠떨어지면 true 리턴
        if(x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}