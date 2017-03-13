package bookConfirm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class BookConfirmController {
	@FXML
	private Button back;
	@FXML
	private Button Confirm;
	@FXML
	private ImageView thanks;
	// Event Listener on Button[#back].onAction
	@FXML
	public void openBookSecondPage(ActionEvent event) throws Exception {               
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/secondPage/BookSecondPage.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1)); 
			stage.setFullScreen(true);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void OpenThanks(ActionEvent event){
		try{
			thanks.setVisible(true);
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
