class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 숫자 3개 뽑기
        for(int x = 0; x < number.length; x++) {
          for(int y = x + 1; y < number.length; y++) {
            for(int z = y + 1; z < number.length; z++) {
                if(number[x] + number[y] + number[z] == 0)
                    answer++; // 세 수의 합이 0이면 1씩 증가
            }
          }
        }
        
        return answer;
    }
}