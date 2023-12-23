import java.lang.Math;

class Solution {
    public long solution(long n) {
        
        double x = Math.sqrt(n); // n의 제곱근
        
        if(Math.pow((int)x, 2) == n) {
            return (long)Math.pow(x + 1, 2);
        } else
            return -1;
    }
}