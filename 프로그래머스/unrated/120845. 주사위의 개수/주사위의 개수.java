class Solution {
    public int solution(int[] box, int n) {
        
        int width = box[0] / n; // 가로길이 / 주사위 모서리
        int depth = box[1] / n; // 세로길이 / 주사위 모서리
        int height = box[2] / n; // 높이 / 주사위 모서리
        
        int answer = width * depth * height;

        return answer;
    }
}