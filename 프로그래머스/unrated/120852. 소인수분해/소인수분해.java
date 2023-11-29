import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        // 소인수를 담을 ArrayList 생성
        ArrayList<Integer> primeFactors = new ArrayList<>();
        // for문을 돌려 소인수를 ArrayList에 추가해줌
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) { // n이 i로 나눠떨어질 동안
                if(!primeFactors.contains(i)) { // 중복 체크 후
                    primeFactors.add(i); // ArrayList에 담기
                } 
                n /= i; // n을 n/i로 초기화
            }
        }
        
        // ArrayList를 배열로 변환하기
        
        // 1. ArrayList와 같은 크기로 answer 배열 생성
        int[] answer = new int[primeFactors.size()];
        
        // 2. for문을 돌려 배열에 차례로 ArrayList 값 대입
        for(int i = 0; i < answer.length; i++) {
            answer[i] = primeFactors.get(i);
        }
        
        Arrays.sort(answer); // 오름차순 정렬
        
        return answer;
    }
}