import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 1) 
                count++;
        }
        int[] num = new int[count];
        
        int index = 0;
        
        for(int i = 1; i < n; i++) {
            if(n % i == 1) 
                num[index++] = i;
        }
        Arrays.sort(num);
        answer = num[0];
        
        return answer;
    }
}