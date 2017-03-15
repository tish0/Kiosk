package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import screenFramework.ScreenController;
import screenFramework.ScreensFramework;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;



public class BookScreen implements Initializable, screenFramework.ControlledScreen {
	
	ScreenController myController;
	
	@FXML
	private GridPane showGrid; 
	@FXML
	private Label reg;
	@FXML
	private Label car;
	@FXML
	private Label Please;
		
	@FXML
	private Button hour11;
	@FXML
	private Button hour40;
	@FXML
	private Button btnNext;
	@FXML
	private Button back;
	
	
	
	
	@FXML
	public void OpenSecondPage(ActionEvent event) throws Exception {               
		 myController.setScreen(screenFramework.ScreensFramework.screen3ID);
}
	@FXML
	public void openWelcome(ActionEvent event) throws Exception {               
		myController.setScreen(screenFramework.ScreensFramework.screen1ID);
}	
	@FXML
	public void OpenTimeTable(ActionEvent event){
		try{
			showGrid.setVisible(true);
			reg.setVisible(true);
			Please.setVisible(false);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@FXML
	public void OpenTimeTableC(ActionEvent event){
		try{
			showGrid.setVisible(true);
			car.setVisible(true);		
			Please.setVisible(false);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@FXML
	public void busy(ActionEvent event){
		try{
			
			hour11.setDisable(true);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@FXML
	public void busy1(ActionEvent event){
		try{
			
				
				hour40.setDisable(true);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public void setScreenParent(ScreenController screenParent) {
		 myController = screenParent;
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
