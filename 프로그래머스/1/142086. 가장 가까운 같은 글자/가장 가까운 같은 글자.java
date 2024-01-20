class Solution {
    public int[] solution(String s) {
        
        String[] arr = s.split(""); // 하나씩 떼서 배열에 저장
        int[] answer = new int[arr.length];
        answer[0] = -1; // 0번째 인덱스는 -1
   
        // 이중for문으로 같은 값 찾기
        for(int i = 1; i < arr.length; i++) {
            answer[i] = -1; // 디폴트는 -1
            // 0부터 i-1 인덱스까지 역순으로 검색 
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j].equals(arr[i])) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
            
        return answer;
    }
}