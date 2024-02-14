class Solution {
    public String solution(String s) {
        
        // 공백 단위로 잘라서 문자 배열에 저장
        String[] temp = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(temp[0]);
        
        // 대소비교하면서 정렬하기
        for(int i = 1; i < temp.length; i++) {
            int n = Integer.parseInt(temp[i]);
            if(min > n) min = n; // 현재 최솟값보다 작은 수를 min으로 대체
            if(max < n) max = n; // 현재 최댓값보다 큰 수를 max로 대체
        }
        
        return min + " " + max;
    }
}