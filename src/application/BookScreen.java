package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;



public class BookScreen extends Application {
	
	
	
	@FXML
	private GridPane showGrid; 
	@FXML
	private Label reg;
	@FXML
	private Label car;
	
		
	@FXML
	private Button hour11;
	@FXML
	private Button hour40;
	@FXML
	private Button btnNext;
	@FXML
	private Button back;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("BookScreen.fxml"));
			//System.out.println("Milliseconds since January 1, 1970, 00:00:00 GMT : " + date.getTime());
		
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
		  primaryStage.setFullScreen(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void OpenSecondPage(ActionEvent event) throws Exception {               
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
	public void openWelcome(ActionEvent event) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/welcomeScreen/WelcomeScreen.fxml"));
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
	public void OpenTimeTable(ActionEvent event){
		try{
			showGrid.setVisible(true);
			reg.setVisible(true);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@FXML
	public void OpenTimeTableC(ActionEvent event){
		try{
			showGrid.setVisible(true);
			car.setVisible(true);		
			
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
//	public static void main(String[] args) {
//		launch(args);
//	}
}
