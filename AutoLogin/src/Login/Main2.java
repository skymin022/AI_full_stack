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
	
	
    static Robot robot;
    // Robot 객체 선언 
    static {
        try {
            // Robot 객체 초기화
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


	public static  void Enter_Delay() {
		
		robot.delay(200);  // 200ms 대기
        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 누르기
        robot.delay(200);  // 200ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(200);  // 200ms 대기
	}
	

	public static void New_Tab(String url) {
        robot.keyPress(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyPress(KeyEvent.VK_T); // Enter 키 떼기
        robot.delay(200);  // 200ms 대기
        robot.keyRelease(KeyEvent.VK_CONTROL); // Enter 키 떼기
        robot.keyRelease(KeyEvent.VK_T); // Enter 키 떼기

        robot.delay(200);  // 200ms 대기
        copyToClipboard(url);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        robot.delay(200);  // 200ms 대기

        robot.keyPress(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(200);  // 200ms 대기
        robot.keyRelease(KeyEvent.VK_ENTER); // Enter 키 떼기
        robot.delay(200);  // 500ms 대기
		
	}
	
	public static void TextInput(String text) {
        copyToClipboard(text);  // 한글을 클립보드에 복사
        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
        robot.delay(200);  // 200ms 대기
        
	}
	
	
	public static void BackTap() {
		robot.delay(200);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(200);
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
        robot.delay(200); // 붙여넣기 대기 시간
    }

	// 크롬 드라이버 
	public static WebDriver driver = new ChromeDriver();
	
	
	
	
	public static void main(String[] args) throws AWTException {
		
		// 크롬에서 네이버 실행하기
		driver.get("https://www.google.com/");
		
		WebElement body = driver.findElement((By.id(("APjFqb"))));
        body.click();
		
        // 잠시 대기 (바탕화면 클릭 후 대기)
        robot.delay(200);  // 500ms 대기
        
        
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
//        // 문장 입력
//        robot.delay(200);  // 200ms 대기
//        String text = "알클.com"; // 입력할 한글
//        robot.delay(200);  // 500ms 대기
//        copyToClipboard(text);  // 한글을 클립보드에 복사
//        pasteWithRobot(robot);  // Ctrl + V 로 붙여넣기
//        Enter_Delay();
        
       
        
        
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

//        // 두 번째 탭
//        String url = "https://wwwaloha.oopy.io/";
//        New_Tab(url);
//        Enter_Delay();
        
        
//        // 구글 로그인
//        String url2 = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=ko&ifkv=AXH0vVv8fG9ALU3_excp_ENKbUorCP6IWLjRqlQlpLFts_wgP8slqMEmPAtKvvM1UWqM2nsuoWHs-g&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-47841988%3A1743650284574886";
//        New_Tab(url2);
        
        
        
        
        
        
//         세 번째 탭 
        String url1 = "https://chatgpt.com/";
        New_Tab(url1);
        
        // id 입력
        robot.delay(2000);
        String Id = "wlqtk44";
        TextInput(Id);
        robot.delay(2000);
        Enter_Delay();
        

        

        
            
        }
	





            
			

        
	
	
}
