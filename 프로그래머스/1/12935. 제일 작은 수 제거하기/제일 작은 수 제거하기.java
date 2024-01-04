class Solution {
    public int[] solution(int[] arr) {
        
        // 배열 길이가 1인 경우 -1만 담은 배열 리턴
        if(arr.length == 1) {
            return new int[]{-1}; 
        }
        
        int min = arr[0]; // 최솟값 임시지정
        
        // 배열 arr에서 가장 작은 수 찾기(주의 : i 1부터 시작)
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        
        // 가장 작은 수를 제외하고 배열에 담아주기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != min)
                answer[index++] = arr[i];
        }
        
        
        return answer;
    }
}