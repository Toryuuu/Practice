class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // order를 문자열로 변환 후 한 글자씩 분리하고 문자열 배열에 저장
        String str = Integer.toString(order);
        String[] num = str.split("");
        
        for(int i = 0; i < num.length; i++) {
            if(num[i].equals("3")){
                answer++;
            } else if (num[i].equals("6")){
                answer++;
            } else if (num[i].equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}