class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0; // 가장 큰 수
        int maxIndex = 0; // max의 인덱스
        
        for(int i = 0; i < array.length; i++) {
          for(int j = 0; j <= i; j++) {
              if(array[i] == array[j]) {
                continue;
            } else if(array[i] > array[j]) {
                max = array[i];   
                maxIndex = i;
            } else {
                max = array[j];   
                maxIndex = j;
              }
           }
          }
        // answer에 가장 큰 수와 인덱스를 담아줌
        answer[0] = max;
        answer[1] = maxIndex;
        
        return answer;
    }
}