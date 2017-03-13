package welcomeScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeScreenController {
	
	@FXML
	public Button btnTouchtoStart;
	@FXML
	public Button btnMeeting;
	@FXML
	public Button btnQuickLinks;
	@FXML
	public Button btnBack;
	
	@FXML
	public void TouchtoStart(ActionEvent event){
		try{
			btnMeeting.setVisible(true);
			btnQuickLinks.setVisible(true);
			btnTouchtoStart.setVisible(false);
			btnBack.setVisible(true);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@FXML
	public void BookMeeting(ActionEvent event){
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/BookScreen.fxml"));
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
	public void QuickLinks(ActionEvent event){
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/urls/Urls.fxml"));
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
	public void Back(ActionEvent event){
		try{
			if(btnMeeting.isVisible()){
				btnMeeting.setVisible(false);
				btnQuickLinks.setVisible(false);
				btnTouchtoStart.setVisible(true);
				btnBack.setVisible(false);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
