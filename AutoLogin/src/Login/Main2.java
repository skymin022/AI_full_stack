package Login;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {

	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws AWTException {
		
		// 크롬에서 네이버 실행하기
		driver.get("https://nid.naver.com/nidlogin.login");
		
		Robot robot = new Robot();
		
		 // 1. 바탕화면을 클릭 (여기서는 예시로 (100, 100) 위치 클릭)
        robot.mouseMove(100, 100);  // 마우스를 (100, 100) 위치로 이동
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);  // 왼쪽 마우스 버튼 클릭
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);  // 마우스 버튼 떼기
        
        // 잠시 대기 (바탕화면 클릭 후 대기)
        robot.delay(500);  // 500ms 대기
        
        // 2. Ctrl + Shift + N 단축키 눌러서 새로운 창 열기
        robot.keyPress(KeyEvent.VK_CONTROL);  // Ctrl 키 누르기
        robot.keyPress(KeyEvent.VK_SHIFT);    // Shift 키 누르기
        robot.keyPress(KeyEvent.VK_N);        // 'N' 키 누르기
        robot.keyRelease(KeyEvent.VK_N);      // 'N' 키 떼기
        robot.keyRelease(KeyEvent.VK_SHIFT);  // Shift 키 떼기
        robot.keyRelease(KeyEvent.VK_CONTROL); // Ctrl 키 떼기
        
        // 잠시 대기
        robot.delay(500);  // 500ms 대기
        
        // 3. 다시 한번 마우스를 클릭 (여기서는 예시로 (200, 200) 위치 클릭)
        robot.mouseMove(200, 200);  // 마우스를 (200, 200) 위치로 이동
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);  // 왼쪽 마우스 버튼 클릭
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);  // 마우스 버튼 떼기
	
	}
}
