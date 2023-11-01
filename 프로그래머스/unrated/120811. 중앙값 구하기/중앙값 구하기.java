import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        
        // 중앙 인덱스 값 계산(배열 길이의 절반)
        int answer = array.length / 2;
        
        // 해당 값 반환
        return array[answer];
        
    }
}