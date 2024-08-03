import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        double[][] save = new double[len][2];
        
        for(int i = 0; i < len; i++) {
            double average = (score[i][0] + score[i][1]) / 2.0; // 각 학생의 영어, 수학 평균
            
            save[i][0] = average; // 평균값 저장
            save[i][1] = i; // 식별을 위해 인덱스 저장
        }
        
        // 람다식 이용한 내림차순 정렬(평균값 기준)
        Arrays.sort(save, (a, b) -> Double.compare(b[0], a[0]));
        
        // 등수 매기기
        int rank = 1; // 1등에서 시작 -> 1씩 커지므로
        
        for(int i = 0; i < len;) {
            int same = 1; // 점수가 같은 사람 수
            answer[(int)save[i][1]] = rank; // 원래 인덱스에 등수 대입 
            
            // 같은 점수일 때 처리
            while(i + same < len && save[i][0] == save[i + same][0]) {
                answer[(int)save[i + same][1]] = rank;
                same++; // 같은 등수인 사람 증가시키기
            }
            
            i += same; // 같은 점수 -> 반복문 skip
            rank += same; // 등수 뛰어넘기(like 유도 동메달)
        }
              
        return answer;
    }
}