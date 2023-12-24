class Solution {
    public int solution(long num) {
        
        int count = 0; // 반복횟수
        
        if(num == 1) {
            return 0;
        }
        
        while(num != 1) { // num == 1이 되면 빠져나옴
          if(num % 2 == 0) { // 짝수일 때
              num = num / 2;
            } else { // 홀수일 때
                  num = (num * 3) + 1;
            } 
            count++;
            
            if(count >= 500) {
               return -1;
             }
        }   
           
        return count;
    }
}