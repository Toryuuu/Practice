class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = new int[10]; // 크기가 10인 배열
        
        // 주어진 배열의 원소값에 해당하는 num 인덱스에 1 대입
        for(int i = 0; i < numbers.length; i++) {
            num[numbers[i]] = 1; 
        }
        
        // 원소값이 1이 아닌 인덱스를 모두 더해줌
        for(int i = 0; i < num.length; i++) {
            if(num[i] != 1)
                answer += i;
        }
        
        return answer;
    }
}