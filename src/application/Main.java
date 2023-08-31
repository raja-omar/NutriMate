package application;

//The created application takes inspiration from the following website
//Date accessed: July 25th, 2022
//https://www.calculator.net/calorie-calculator.html
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FoodData.init();
			AnchorPane root = FXMLLoader.load(getClass().getResource("Introduction.fxml"));
			Scene scene = new Scene(root,500,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calorie Calculator");
			primaryStage.show();
			System.out.println();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}