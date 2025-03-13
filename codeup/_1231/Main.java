import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine(); // 연산식 입력받기

        char operator = ' '; // 연산자 저장 변수

        // 입력된 문자열에서 연산자 찾기
        for (char c : input.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                break;
            }
        }

        if (operator == ' ') {
            
            return;
        }

        // 연산자를 기준으로 숫자 분리
        String[] numbers = input.split("\\" + operator); 
        int num1 = Integer.parseInt(numbers[0].trim());
        int num2 = Integer.parseInt(numbers[1].trim());

        // 연산 수행 및 결과 출력
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.printf("%.2f\n", (double) num1 / num2);
                break;
            default:
               break;
        }

        sc.close();
    }
}
