import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수형 값 입력받음

        for(int i = 1; i <= n; i++) {  
            // 행마다 "*"를 i개 출력
            for(int j = 1; j <= i; j++) {
                 System.out.print("*");
            }
            // 한 행이 끝나면 개행
            System.out.println(); 
        }
    }
}