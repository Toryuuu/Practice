import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n+1)/2]; // 배열 answer를 홀수 개수(n+1의 절반) 크기로 초기화
        int index = 0; // 배열의 인덱스에 추가할 값
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) { // 정수 i가 홀수이면
                answer[index] = i; // 배열의 0번 인덱스부터 i 추가
                index++; // 인덱스는 0부터 시작해서 1씩 증가
            }
        }
        
        Arrays.sort(answer); // 배열 오름차순 정렬
        return answer;
    }
}