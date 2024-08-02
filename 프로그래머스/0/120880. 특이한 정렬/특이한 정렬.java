import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] num = new double[numlist.length];
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0) {
                num[i] = (numlist[i] - n) * -1 + 0.5;
                // 음수일 경우 양수로 만든 후 0.5 더해서 순서 뒤로 미루기
            } else {
                num[i] = numlist[i] - n;
            }
        }
        
        Arrays.sort(num); // 오름차순 정렬
        
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 1 != 0) { // 차가 음수였던 경우
                answer[i] = n - (int)num[i];
                // double을 int 변환시 소수점 내림처리 -> 0.5 따로 뺄 필요 x
            } else {
                answer[i] = (int)num[i] + n;
            }
        }
        
        return answer;
    }
}