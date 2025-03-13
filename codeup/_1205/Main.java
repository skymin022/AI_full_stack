import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 2개 입력받아서 a, b에 저장
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 배열 생성 및 초기화 
        float arr[] = new float[10];
        float num = 0;

        arr[0] = (a + b);
        arr[1] = (b + a);
        arr[2] = (a - b);
        arr[3] = (b - a);
        arr[4] = (a * b);
        arr[5] = (b * a);
        arr[6] = (b != 0) ? ((float) a / b) : 0; // 0으로 나누기 방지
        arr[7] = (a != 0) ? ((float) b / a) : 0; // 0으로 나누기 방지
        arr[8] = (float) Math.pow(a, b);
        arr[9] = (float) Math.pow(b, a);

        for (int i = 0; i < 10; i++) {
            if (num < arr[i]) {               
                num = arr[i];
            }
        }
        
        System.out.printf("%.6f", num);

        sc.close();
    }
}
