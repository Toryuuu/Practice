import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array); // 배열 오름차순 정렬
        int answer = 0;
        int max = array[array.length - 1]; // 배열에서 가장 큰 값 max에 대입
        
		// 각 값이 몇 번인지 세기 위한 배열 count 
        int count[] = new int[max + 1]; // index는 0부터 시작 -> max + 1 해줌
        
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++; // 배열 count의 원소를 배열 array의 각 값의 빈도수만큼 증가시킴
        }
        
        max = count[0]; // max에 count의 첫번째 인덱스 값 대입
        
        // 배열 count에 저장된 빈도수로 최빈수 찾아내기
        // t는 (인덱스) 값, count[t]는 빈도수(총 몇 번인지)
        for(int t = 1; t < count.length; t++) {
            // 현재 최빈수보다 큰 값이 있는 경우
            if(max < count[t]) {
                max = count[t]; // 현재 최빈수에 대입
                answer = t; // 최빈수에 t 대입
            } 
            // 배열 내 빈도수가 같을 경우
            else if(max == count[t]) {
                answer = -1; // -1 리턴
            }
        }
        return answer;
    }
}