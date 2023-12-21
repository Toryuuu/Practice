import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += (n % 10); // 맨 끝자릿수
            n = n / 10; // 일의 자릿수부터 하나씩 없앤 후 반복
        }

        return answer;
    }
}