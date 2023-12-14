class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String ks = Integer.toString(k);
        
        for(int i = 0; i < str.length(); i++) {
            if(str.contains(ks)) {
                answer = str.indexOf(ks) + 1;
            } else
                answer = -1;
        }
        
        return answer;
    }
}