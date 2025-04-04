package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class BController {

    @FXML
    private Button button;

    @FXML
    private TextField input;

    @FXML
    void exit(ActionEvent event) {
    	// 종료 확인 경고창
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("프로그램 종료");
    	alert.setHeaderText("프로그램을 종료합니다.");
    	alert.setContentText("정말로 종료하시겠습니까?");
    	
    	// 경고창에서 OK 버튼 클릭 시
    	if( alert.showAndWait().get() == ButtonType.OK ) {
    		System.out.println("프로그램을 종료합니다...");
    		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    		stage.close(); 			// 프로그램 종료
    	}
    	
    }
    
    // 데이터를 전달받을 메소드
    public void passData(String data) {
    	System.out.println("A -> B 전달 데이터 : " + data);
    	input.setText(data);
    }

}









