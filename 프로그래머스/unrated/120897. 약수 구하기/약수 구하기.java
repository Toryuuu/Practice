import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        // 배열 answer의 크기를 구하기 위해 약수 개수 세기
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        
        // n의 약수일 경우 배열 answer에 저장
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        // 오름차순 정렬 후 리턴
        Arrays.sort(answer); 
        return answer;
    }
}