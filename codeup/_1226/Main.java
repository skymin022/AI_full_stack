import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 숫자 입력
        Scanner sc = new Scanner(System.in);
        // 정답 및 내 번호 입력
        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        
        int num = 0;

        // 정답 배열 입력
        for (int i = 0; i < 6; i++) {
            arr1[i] = sc.nextInt();
        }

        // 보너스 번호 입력
        num = sc.nextInt();

        // 내 번호 배열 입력
        for (int i = 0; i < 6; i++) {
            arr2[i] = sc.nextInt();
        }

        // 정답과 내 번호 비교
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        // 보너스 번호 확인
        boolean bonus = false;
        for (int i = 0; i < 6; i++) {
            if (arr2[i] == num) {
                bonus = true;
            }
        }   

        // 등수 확인
        if (count == 6) {
            System.out.println(1);
        } else if (count == 5 && bonus) {
            System.out.println(2);
        } else if (count == 5) {
            System.out.println(3);
        } else if (count == 4) {
            System.out.println(4);
        } else if (count == 3) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }

        sc.close();

    }
}
