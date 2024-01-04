class Solution {
    public int[] solution(int[] arr) {
        
        int size = arr.length;
        int[] answer = new int[size - 1];
        
        if(size == 1) {
            arr[0] = -1;
            return arr; // 배열크기가 1이면 -1 담아 리턴
        } else {
            int min = Integer.MAX_VALUE; // 최솟값. 정수의 최댓값 임시지정
            // 최솟값 가려내기
            for(int i = 0; i < size; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            // 최솟값을 제외하고 배열에 담은 후 리턴
            int index = 0;
            for(int i = 0; i < size; i++) {
                if(arr[i] != min)
                    answer[index++] = arr[i];
            }
        }      
        
        return answer;
    }
}