class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        // 문자열 배열을 생성하고 각 숫자 담아주기
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
         // for문을 돌려 numbers에 있는 숫자가 eng 배열의 몇 번째 인덱스인지 반환
        for(int n = 0; n < numbers.length();) {
            for(int i = 0; i < eng.length; i++) {
                if(numbers.startsWith(eng[i], n)) { // n번째 인덱스부터 eng 원소값과 일치하는지 검사
                    answer = answer * 10 + i; // 자릿수 계산 위해 10 곱한 후 i(인덱스)를 더해줌
                    n += eng[i].length(); // 영단어 길이만큼 n 더해줌 
                }
            }
        }
        
        return answer;
    }
}