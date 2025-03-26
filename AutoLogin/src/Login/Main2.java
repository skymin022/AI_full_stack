package Login;

import java.util.Scanner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // ChromeDriver 경로 설정 (자신의 경로로 수정)
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver\\chromedriver.exe");
        
        // WebDriver 인스턴스 생성
        WebDriver driver = new ChromeDriver();
        
        // 웹사이트 열기
        driver.get("https://www.google.com");

        // Actions 객체 생성
        Actions actions = new Actions(driver);

        System.out.println("Ctrl + Shift + N 단축키를 입력하려면 1을 입력하세요.");
        
        int N = sc.nextInt();
        
        if (N == 1) {
            // Ctrl + Shift + N 단축키 입력
            actions.keyDown(Keys.CONTROL)
                   .keyDown(Keys.SHIFT)
                   .sendKeys("n")
                   .keyUp(Keys.SHIFT)
                   .keyUp(Keys.CONTROL)
                   .perform();
            System.out.println("Ctrl + Shift + N 단축키가 입력되었습니다.");
        } else {
            System.out.println("입력된 값이 1이 아닙니다.");
        }

        // 잠시 대기 후 종료
        try {
            Thread.sleep(3000); // 3초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 브라우저 종료
        driver.quit();
    }
}
