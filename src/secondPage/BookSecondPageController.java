package secondPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BookSecondPageController {
	@FXML
	private Button back;
	@FXML
	private Button bookNow;
	@FXML
	private MenuButton pp;
	@FXML
	private TextField reason;
	@FXML
	public void openBookScreen(ActionEvent event) throws Exception {               
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
	public void openConfirm(ActionEvent event) throws Exception {               
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/bookConfirm/BookConfirm.fxml"));
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
	public void getReason(ActionEvent event) throws Exception {               
		reason.setText("Reason one");
	}
}
