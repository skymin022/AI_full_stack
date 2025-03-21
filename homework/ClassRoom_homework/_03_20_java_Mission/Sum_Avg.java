import java.util.Scanner;

public class Sum_Avg {

    public static void main(String[] args) {
        // 변수 입력 받기
        Scanner sc = new Scanner(System.in);
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int java = sc.nextInt();

        // 합계
        int sum = eng + math + java;

        // 평균
        double avg = sum / 3.0; 

        // 출력
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
        

    }

}
