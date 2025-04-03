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
        // 문장 입력
        robot.delay(200);  // 200ms 대기
        String text = "알클.com"; // 입력할 한글
        robot.delay(200);  // 500ms 대기
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

//        // 두 번째 탭
//        String url = "https://wwwaloha.oopy.io/";
//        New_Tab(url);
//        Enter_Delay();
        
        
        // 세 번째 탭 
        String url1 = "https://accounts.google.com/v3/signin/identifier?opparams=%253Faudience%253D799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com&dsh=S-466873824%3A1743647682983097&client_id=799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com&ddm=1&nonce=OgJ8SwiJ4tpM2W6TjHLS&o2v=2&redirect_uri=https%3A%2F%2Fauth.openai.com%2Fapi%2Faccounts%2Fcallback%2Fgoogle&response_type=code&scope=openid+profile+email&service=lso&state=facfb849-fdca-4396-b496-1f5c0becba6f&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAN-6vkydQHrnPmRHyUp2HAOUGjC8R0kGB9YzMbpm3kSUrBLbbTlQSEeXgK1ituJ3Drn-3PVbzfZ3Ipp0Ao5QdrfRAz3etx_OpIrXPtVOQr5zqROPCeDgVIjcKgP-pokZkaDTGSS22rQVynqgsjs8r6Btl0_I_jBMxb-DNfGLuF4jRrVivZl0T1XW0G1zGfpu7m9n-R24ZiAOi2dvjigTPCgucExcmbWdDXyYqgwKL0jkQ5uk7OkPZsQtbiAUbmsfRlkNBnR59I7DulsrXcG43s2aT-_gsYcs_XpulKrKuY2ln3Yt1VUfTCM6BacJjyYrRG0LcOfE5kPu4S_cSKAx6jokMzCce2elBrsBBhEpt1KEjjz2QN9QVVSdD6IP7cuRERt59Ol_VB6zE2WCLCFtXEWe3vT2IDpYm1o8UoKtsPm8ZaZYPQfJr786vRRNwFYCEP-Ezn0W5vT6ctIsoRyWt9lGol3rg%26flowName%3DGeneralOAuthFlow%26as%3DS-466873824%253A1743647682983097%26client_id%3D799222349882-ne3i0s9jdm5s0p7ll2d7tlsi1vc1halt.apps.googleusercontent.com%23&app_domain=https%3A%2F%2Fauth.openai.com&rart=ANgoxcfhcdWIBhwbiX8qomfnR19Cn2pepfqv0ndIVwqMk3jjIueCLtIqs9RYwBdIEmCzxs-EGb0B5ZZluhZnYMnLTFz2mGi3HxSJBB2-X2I45Q4HYAtg3xw";
        New_Tab(url1);
        
        // id 입력
        robot.delay(2000);
        String Id = "wlqtk44";
        TextInput(Id);
        robot.delay(2000);
        Enter_Delay();
        

        

        
            
        }
	





            
			

        
	
	
}
