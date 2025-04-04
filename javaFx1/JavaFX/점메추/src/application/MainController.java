package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class MainController {

    @FXML
    private Button button;

    @FXML
    private ImageView image;

    @FXML
    private Label menu;
    
    // 메뉴 리스트 
    private static List<Menu> MENU_LIST;
    
    // 0.05초 마다 동작하는 타임라인 객체
    private Timeline timeline = null;
    // 3초 뒤에 중지시키는 타임라인 객체
    private Timeline stop = null;
    
    /**
     * FXML 이 로딩될 때 초기화하는 메소드 
     * 데이터 초기화
     * 이벤트 등록 
     * 
     */
    @FXML
    public void initialize() {
    	// 데이터 초기화
    	setData();
    	
    	// 타이머 세팅
    	setTimer();
    	
    }
    
    /**
     *  애니메이션을 위한 타임라인 객체 생성
     */
    void setTimer() {
    	// 애니메이션 적용
    	// Timeline - 주기적으로 처리할 수 있도록 하는 애니메이션 클래스
    	timeline = new Timeline(
    			// KeyFrame( 시간, 이벤트)
    			// : 지정한 시간마다 익명함수를 호출
    			// *Duration.millis(밀리초) - 0.05초
    			new KeyFrame(Duration.millis(50), e -> { 
    				setMenu();		// 랜덤 메뉴 세팅
    			})
    		);
    	// 애니메이션 반복 횟수 설정 - Timeline.INDEFINITE : 무한 반복 
    	timeline.setCycleCount( Timeline.INDEFINITE );
    	
    	// 3초 뒤에 애니메이션 멈춤
    	stop = new Timeline(
    			// 3초마다 동작하는 애니메이션 지정
    		new KeyFrame( Duration.millis(3000), e -> timeline.stop())
    			);
    	
    	// // 애니메이션 반복 횟수 설정 -> 1회
    	stop.setCycleCount(1);
    }
    
    
    void setData() {
    	MENU_LIST = new ArrayList<Menu>();
    	List<String> nameList = Arrays.asList("국밥","김밥","닭갈비","돈까스","라멘",
    			"마라탕","비빔밥","쌀국수","오징어볶음","짜장밥","찌개","초밥","칼국수",
    			"컵밥","토스트","파스타","피자","한솥 도시락","해물탕","햄버거");
    	
    	List<String> imgList= Arrays.asList("국밥.png","김밥.png","닭갈비.png","돈까스.png","라멘.png",
    			"마라탕.png","비빔밥.png","쌀국수.png","오징어볶음.png","짜장밥.png","찌개.png","초밥.png","칼국수.png",
    			"컵밥.png","토스트.png","파스타.png","피자.png","한솥 도시락.png","해물탕.png","햄버거.png");
    	
    	for (int i = 0; i < 20; i++) {
    		String name = nameList.get(i);
    		String img = imgList.get(i);
    		MENU_LIST.add( new Menu(name, img));
		}
    }
    
    /**
     * 버튼 클릭 이벤트 
     * @param event
     */
    
    @FXML
    void random(ActionEvent event) {
//    	System.out.println("추천");
    	
    	// 이전 애니메이션 중지
    	timeline.stop();
    	stop.stop();
    	
    	// 애니메이션 시작
    	timeline.play();
    	stop.play();
    }
    
    void setMenu() {
    	//TODO : 20개의 메뉴 요소들 중, 랜덤으로 하나 선택 
    	// 0 ~ 19 랜 수 뽑기
    	Random random = new Random();
    	int index = random.nextInt(20);
    	// 랜덤(추천) 메뉴
    	Menu randomMenu = MENU_LIST.get(index);
    	String menuName = randomMenu.getName();
    	String menuimg = randomMenu.getImg();
    	
    	// 랜덤으로 뽑힌 메뉴명 라벨에 지정
    	menu.setText(menuName);
    	// 랜덤 메뉴 이미지 지정
    	String filePath = getClass().getResource("/img/" + menuimg).toExternalForm();
    	image.setImage( new Image(filePath) );
    	
    }
    

}
