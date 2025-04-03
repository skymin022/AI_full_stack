package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class Main2 {
	
	
	private static Robot robot;



	public static  void Enter_Delay() {
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
	}
	

	public static WebDriver driver = new ChromeDriver();
	
	
	
	
	public static void main(String[] args) throws AWTException {
		
		// 크롬에서 네이버 실행하기
		driver.get("https://www.google.com/");
		
		Robot robot = new Robot();
		
		WebElement body = driver.findElement((By.id(("APjFqb"))));
        body.click();
		
        // 잠시 대기 (바탕화면 클릭 후 대기)
        robot.delay(500);  // 500ms 대기
        
        
        //TODO : 메스드 형태로 정리하기 
        // 2. Ctrl + Shift + N 단축키 눌러서 새로운 창 열기
        robot.keyPress(KeyEvent.VK_CONTROL);  // Ctrl 키 누르기
        robot.keyPress(KeyEvent.VK_SHIFT);    // Shift 키 누르기
        robot.keyPress(KeyEvent.VK_N);        // 'N' 키 누르기
        robot.keyRelease(KeyEvent.VK_N);      // 'N' 키 떼기
        robot.keyRelease(KeyEvent.VK_SHIFT);  // Shift 키 떼기
        robot.keyRelease(KeyEvent.VK_CONTROL); // Ctrl 키 떼기
        
        // 잠시 대기
        robot.delay(500);  // 500ms 대기
        
        
        
        // 복사,붙여넣기를 활용한 한글입력    
        // 문장 입력
        robot.delay(100);  // 100ms 대기
        String text = "알클.com"; // 입력할 한글
        robot.delay(100);  // 500ms 대기
        copyToClipboard(text);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        
        Enter_Delay();
       
        
        
        //TODO : 시크릿창으로 여는 방법 탐구 필요 
//        크롬에서 탭을 이동하는 단축키는 다음과 같습니다.
//        Tab 키를 눌러 앞으로 이동합니다 
//        Shift + Tab 키를 눌러 뒤로 이동합니다 
//        Ctrl + PgUp 키를 눌러 다음 탭으로 이동합니다 
//        Ctrl + PgDn 키를 눌러 이전 탭으로 이동합니다 
//        Ctrl + Shift + PgUp 키를 눌러 탭을 왼쪽으로 이동합니다 
//        Ctrl + Shift + PgDn 키를 눌러 탭을 오른쪽으로 이동합니다 
//		  Ctrl + t : 새탭 열기 
        
        
        
        // 새로운 탭 열기
//        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
//        newTab.get("https://www.naver.com");
        
        // 두 번째 탭
        robot.keyPress(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_T); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_T); // Enter 키 떼기
        
        robot.delay(100);  // 100ms 대기
        String text1 = "https://wwwaloha.oopy.io/"; // 입력할 한글
        robot.delay(100);  // 500ms 대기
        copyToClipboard(text1);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기

        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
           
        robot.delay(500);  // 500ms 대기
        
        // 세 번째 탭 https://chatgpt.com/
        robot.keyPress(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_T); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_T); // Enter 키 떼기
        
        robot.delay(100);  // 100ms 대기
        String text2 = "https://accounts.google.com/v3/signin/identifier?opparams=%253Faudience%253D799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com&dsh=S1007322593%3A1743644019839152&client_id=799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com&ddm=1&nonce=5s2gDEroGgImaTmwsgmW&o2v=2&redirect_uri=https%3A%2F%2Fauth.openai.com%2Fapi%2Faccounts%2Fcallback%2Fgoogle&response_type=code&scope=openid+profile+email&service=lso&state=58a62250-eed5-41a5-8b0d-6da32087f03d&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAN-wRwgNTDb6iXRYQmgI8lKz0UsjI1oJLnCt10wcoEmNeh4JRdnw-H1RxSHB5NvguP9JHES5I-yEi0MFEBlHV7g-eie_KgS0XbnygAeZdAlSnWFkaSFfvCgcJcYYTyAlWyYjuXej2cAFuTNUyR3AtLD1r4DCfj9g7Hl14eZfxFdUXeyNxTu3um9AFrP9APAIhwleT0tQO0oMceO0azoURgb2FiINVrPBS3T83-N-SA72YPDRmEcm31C4iqDhiLGLPfc_tAMzzvzS3s4hRogoWYN5zBhbONxlrHlKz8FEGDt8ia42xYw3Ov3O_dRtfzqiElFbCR5oC5jANDk38IOY4VFCbf2qeatz69hTJy0dtw3HW7ebUSd4q0kYA9ndauZwIR1QY_uhldLgsDUjCDqlQGniXs_upmjVbn-CWWTkQcCapbgOWdjNv9489Yw86inDp-SlUdw2Mm7_MyOpHh1zmyyMD1WMA%26flowName%3DGeneralOAuthFlow%26as%3DS1007322593%253A1743644019839152%26client_id%3D799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com%23&app_domain=https%3A%2F%2Fauth.openai.com&rart=ANgoxccEio8ICAXmXBJP4asJR8BUWxfC4-TwmSd7X4j8WUWfRSe4dZvr904JOo_FnnCURa0GqpR9dtVWgorU8Rzadf3K9qF7GbQi1rAbgHGD4s7G8G68CkA"; // 입력할 한글
        robot.delay(100);  // 500ms 대기
        copyToClipboard(text2);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        
        // id 입력 
        robot.delay(100);  // 100ms 대기
        robot.delay(100);  // 500ms 대기
        String text3 = "wlqtk44"; // 입력할 한글
        copyToClipboard(text3);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        
        robot.delay(1000);  // 100ms 대기
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(1000);  // 100ms 대기
        
        // shift + tap 
        robot.keyPress(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기

        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        
        // shift + tap 2번 
        // 1번
        robot.keyPress(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        // 2번 
        robot.keyPress(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_SHIFT); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_TAB); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        
        // pw 입력 
        robot.delay(100);  // 500ms 대기
        String text4 = "@ghdals44"; // 입력할 한글
        copyToClipboard(text4);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(100);  // 100ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(1000);  // 500ms 대기
        
        
        
        
        
            
        }
	





            
			
            // 클립보드에 텍스트 복사
            public static void copyToClipboard(String text) {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Clipboard clipboard = toolkit.getSystemClipboard();
                StringSelection selection = new StringSelection(text);
                clipboard.setContents(selection, null);
            }

            // Ctrl + V 입력 (붙여넣기)
            public static void pasteWithRobot(Robot robot) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(100); // 붙여넣기 대기 시간
            }
        

       

        
	
	
}
