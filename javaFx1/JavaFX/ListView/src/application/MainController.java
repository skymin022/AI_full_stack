package application;

import java.util.Arrays;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private ListView<String> ListView;

    List<String> todoList = Arrays.asList(
    				"java 복습", "시험보기", "폭삭속았수다", "바람의 나라"
    	);
    
    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private TextField input;

    @FXML
    private Label item;

    // 현재 선택한 아이템
    String selectedItem;
    
    /**
     *  데이터 초기화
     *  이벤트 등록 
     */
    @FXML
    public void initialize() {
    	// todoList 데이터를 추가 
    	ListView.getItems().addAll(todoList);
    	
    	// 리스트뷰의 항목 선택 이벤트 
    	ListView.getSelectionModel().selectedItemProperty()
    			.addListener( new ChangeListener<String>() {
    				
    				// 선택한 항목이 변경됐을 때 실행되는 메소드
					@Override
					public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
						// 선택한 항목을 저장
						selectedItem = ListView.getSelectionModel().getSelectedItem();
						// 라벨에 지정
						item.setText(selectedItem);
					}
    			});
    	
    	// 리스트뷰의 더블 클릭 이벤트 
    	ListView.setOnMouseClicked( new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2) {
					System.out.println("더블 클릭");
					selectedItem = ListView.getSelectionModel().getSelectedItem();
					System.out.println("선택된 아이템  : " + selectedItem);
					//TODO : 상세 화면으로 이동 
				}
			}
		});
    	// 
    }
    
    
    
    /**
     * 추가 버튼 이벤트 
     * @param event
     */
    @FXML
    void add(ActionEvent event) {
    	System.out.println("추가 버튼 클릭 ");
    	String text = input.getText();
    	if( text != null && !text.equals("")) {
    		// 리스트뷰에 입력 값 추가
    		ListView.getItems().add(text);
    		// 입력 후 텍스트 필드 비우기 
    		input.clear();
    	}
    	
    	
    }
    
    /**
     * 삭제 버튼 이벤트 
     * @param event
     */
    @FXML
    void delete(ActionEvent event) {
    	System.out.println("삭제 버튼 클릭 ");
    	if( selectedItem == null || selectedItem.equals("")) {
    		System.err.println("선택한 항목이 없습니다.");
    		return;
    	}
    	ListView.getItems().remove(selectedItem);
    	selectedItem = null;
    	item.setText("");
    	
    	// 선택해제
    	ListView.getSelectionModel().clearSelection();
    }

    @FXML
    void input(ActionEvent event) {

    }

    @FXML
    void item(MouseEvent event) {

    }

}
