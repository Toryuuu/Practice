class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = (numer1 * denom2) + (numer2 * denom1); // 계산 후 분자
        int denom = denom1 * denom2; // 계산 후 분모
        
        // 기약분수 : 분자와 분모의 공약수가 1뿐인 분수 => 분자와 분모를 각각의 최대공약수로 나눈 분수 
        
        // 두 숫자에 동시에 나누어떨어지는 수 i 찾기
        
        int max = 1; // 최대공약수 max 1로 초기화
        for(int i=1; i<=numer && i<=denom; i++) {
            if(denom%i ==0 && numer%i==0) {
                max = i; // for문을 반복하면서 최대공약수가 최종적으로 저장됨
            }
        }
        
        // 분자와 분모를 최대공약수로 나눔
        numer = numer/max;
        denom = denom/max;
        
        // 기약분수의 분자, 분모를 배열 answer에 저장
         int[] answer = {numer, denom};
        
        return answer;
    }
}